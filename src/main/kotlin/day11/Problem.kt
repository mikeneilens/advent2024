package day11

typealias StoneMap = MutableMap<Long, Long>

fun partOne(data:String, blinks:Int = 25): Long {
    var stones=data.parseIntoMap()
    repeat(blinks){stones = blink(stones)}
    return stones.values.sum()
}

fun partTwo(data:String): Long = partOne(data, blinks = 75)

fun blink(previousMap: StoneMap): StoneMap =
    mutableMapOf<Long, Long>().apply{
        previousMap.forEach{ (previousStone, previousQty) ->
            when {
                previousStone == 0L -> changeToOne(previousQty)
                "$previousStone".length % 2 == 0  -> split(previousStone, previousQty)
                else -> multiplyBy2024(previousStone, previousQty)
            }
        }
    }

fun StoneMap.multiplyBy2024(stone: Long, qty: Long) { add(stone * 2024L, qty) }
fun StoneMap.changeToOne(qty: Long) { add(1L, qty) }
fun StoneMap.split(stone: Long, qty: Long) { stone.split().map { add(it, qty) } }

fun String.parseIntoMap() = mutableMapOf<Long,Long>().apply { split(" ").map{ add(it.toLong(),1L)} }

fun StoneMap.add(stone:Long, qty:Long) {
    this[stone] = this.getOrDefault( stone, 0) + qty
}

fun Long.split() = "$this".chunked("$this".length/2).map{it.toLong()}
