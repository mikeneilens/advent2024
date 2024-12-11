package day11

fun partOne(data:String, blinks:Int = 25): Long {
    var stones=data.parseIntoMap()
    repeat(blinks){stones = blink(stones)}
    return stones.values.sum()
}

fun partTwo(data:String): Long = partOne(data, blinks = 75)

fun blink(previousMap: MutableMap<Long, Long>): MutableMap<Long, Long> =
    mutableMapOf<Long, Long>().apply{
        previousMap.keys.forEach{ stone ->
            when {
                stone == 0L ->  add(1L, previousMap.getValue(stone))
                "$stone".length % 2 == 0  -> stone.split().map{ add(it, previousMap.getValue(stone))}
                else -> add(stone * 2024L, previousMap.getValue(stone))
            }
        }
    }

fun String.parseIntoMap() =
      mutableMapOf<Long,Long>().apply { split(" ").map{ add(it.toLong(),1L)} }

fun MutableMap<Long,Long>.add(stone:Long, qty:Long) {
    this[stone] = this.getOrDefault( stone, 0) + qty
}

fun Long.split() = "$this".chunked("$this".length/2).map{it.toLong()}
