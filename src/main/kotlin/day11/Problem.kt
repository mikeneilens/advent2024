package day11


fun partOne(data:String, blinks:Int = 25): Long {
    var stones=data.parseIntoMap()
    repeat(blinks){stones = stones.blink()}
    return stones.values.sum()
}

fun partTwo(data:String): Long {
    return partOne(data, blinks = 75)
}

fun MutableMap<Long, Long>.blink(): MutableMap<Long, Long> {
    val newMap = mutableMapOf<Long, Long>()
    keys.forEach{ stone ->
        when {
            stone == 0L ->  newMap.add(1L, getValue(stone))
            "${stone}".length % 2 == 0  -> stone.split().map{newMap.add(it,getValue(stone))}
            else -> newMap.add(stone * 2024L,getValue(stone))
        }
    }
    return newMap
}

fun String.parseIntoMap():MutableMap<Long, Long> {
    val map = mutableMapOf<Long,Long>()
    split(" ").map{map.add(it.toLong(),1L)}
    return map
}

fun MutableMap<Long,Long>.add(stone:Long, qty:Long) {
    this[stone] = this.getOrDefault( stone, 0) + qty
}

fun Long.split() = listOf(
    "${this}".substring(0..("${this}".lastIndex/2)).toLong() ,
    "${this}".substring(("${this}".lastIndex/2 + 1).."${this}".lastIndex).toLong())