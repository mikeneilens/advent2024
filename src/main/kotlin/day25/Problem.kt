package day25

fun partOne(data:List<List<String>>): Int {
    val (keys,locks) = data.parse()
    return keys.sumOf{ key -> locks.count { lock -> key.fitTogetherWith(lock) } }
}

interface Schematic{ val depths:List<Int> }
data class Key(override val depths: List<Int>) :Schematic
data class Lock(override val depths: List<Int>) :Schematic

fun List<List<String>>.parse() = map(List<String>::parse)
    .let{schematics -> Pair(schematics.filterIsInstance<Key>(), schematics.filterIsInstance<Lock>())}

fun List<String>.parse() =
    first().indices.map{height(it)}.let{ depths -> if (first().all{ it == '#'}) Lock(depths) else Key(depths) }

fun List<String>.height(col:Int) = count { it[col] == '#' } - 1

fun Key.fitTogetherWith(lock:Lock) = depths.mapIndexed{ i, kDepth -> kDepth + lock.depths[i]}.all{it < 6}