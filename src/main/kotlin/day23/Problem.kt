package day23

fun partOne(data:List<String>): Int {
    val keyMap = data.createMap()
    return getTrios(keyMap).count{ set -> set.any { s:String -> s.startsWith ("t") } }
}

fun getTrios(keyMap: Map<String, Set<String>>) =
    keyMap.flatMap { keyMap.matchesWith(it.key) }.toSet()

fun List<String>.createMap():Map<String, Set<String>> {
    val map = mutableMapOf<String, Set<String>>()
    forEach { s -> s.split("-").also{ map.updateWithPair( it[0],it[1])} }
    return map
}

fun MutableMap<String, Set<String>>.updateWithPair(a:String, b:String) {
    get(a)?.let{ set(a, it + b)} ?: set(a, setOf(b))
    get(b)?.let{ set(b, it + a)} ?: set(b, setOf(a))
}

fun Map<String, Set<String>>.matchesWith(s:String):Set<Set<String>> {
    val candidates = this[s] ?: setOf()
    return  candidates.flatMap{
        candidate -> this.getValue(candidate).map{third -> if (s in this.getValue(third)) listOf(s, candidate, third) else listOf()}
    }.map{it.toSet()}.filter{it.size > 2}.toSet()
}

fun partTwo(data:List<String>): Int {
    return 0
}

