package day23

fun partOne(data:List<String>): Int {
    val keyMap = data.createMap()
    return keyMap.flatMap { combinations(it.value + it.key).filter { combo -> combo.size == 3 && combo.allConnected(keyMap) } }
        .distinct().count{ set -> set.any { s:String -> s.startsWith ("t") } }
}

fun List<String>.createMap():Map<String, Set<String>> {
    val map = mutableMapOf<String, Set<String>>()
    forEach { s -> s.split("-").also{ map.updateWithPair( it[0],it[1])} }
    return map
}

fun MutableMap<String, Set<String>>.updateWithPair(a:String, b:String) {
    get(a)?.let{ set(a, it + b)} ?: set(a, setOf(b))
    get(b)?.let{ set(b, it + a)} ?: set(b, setOf(a))
}

fun partTwo(data:List<String>): String {
    val keyMap = data.createMap()
    return keyMap.flatMap { combinations(it.value + it.key).filter { combo -> combo.allConnected(keyMap) } }
        .maxBy{ it.size }
        .sorted().joinToString(",")
}

fun Set<String>.allConnected(map:Map<String, Set<String>>) =
    all{s -> this.all{
        other -> other == s || s in map.getValue(other)
    } }

tailrec fun combinations(s:Set<String>, result:Set<Set<String>> = setOf(setOf())):Set<Set<String>> =
    if (s.isEmpty()) result
    else combinations(s - s.first(), result + result.map{ t -> t + s.first()})
