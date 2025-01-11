package day25

fun partOne(data:List<List<String>>): Int {
    val keys = data.parse().filterIsInstance<Key>()
    val locks = data.parse().filterIsInstance<Lock>()
    return keys.sumOf{ key -> locks.count { lock -> key.fitTogetherWith(lock) } }
}

interface Schematic{ val depths:List<Int> }
data class Key(override val depths: List<Int>) :Schematic
data class Lock(override val depths: List<Int>) :Schematic

fun List<List<String>>.parse() = map(List<String>::parse)

fun List<String>.parse():Schematic =
    if (first().all{ it == '#'}) Lock( first().indices.map{height(it)} ) else Key( first().indices.map{height(it)} )

fun List<String>.height(col:Int) = count { it[col] == '#' } - 1

fun Key.fitTogetherWith(lock:Lock) = depths.mapIndexed{ i, kDepth -> kDepth + lock.depths[i]}.all{it < 6}