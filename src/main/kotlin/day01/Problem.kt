package day01

import kotlin.math.abs

fun partOne(data:List<String>) = parse(data).matchData().sum()

fun parse(data:List<String>) = Pair(
    data.map{it.split("   ")[0].toInt()}.sorted(),
    data.map{it.split("   ")[1].toInt()}.sorted()
    )

fun Pair<List<Int>,List<Int>>.matchData(result:List<Int> = listOf()):List<Int> =
    if (first.isEmpty()) result
    else Pair(first.drop(1), second.drop(1)).matchData( result + abs(first.first() - second.first()))

fun partTwo(data:List<String>): Int {
    val (list1, list2) = parse(data)
    return createSimilarityScore(list1, list2).sum()
}

fun createSimilarityScore(list1: List<Int>, list2: List<Int>): List<Int> {
    val map = createMapOfOccurrence(list1, list2)
    return list1.map{ it * map.getValue(it) }
}

fun createMapOfOccurrence(list1:List<Int>, list2:List<Int>, map:MutableMap<Int, Int> = mutableMapOf()):Map<Int, Int> =
    if (list1.isEmpty() ) map
    else createMapOfOccurrence(list1.drop(1), list2, map).also {
        if (list1.first() !in map) map[list1.first()] = list1.first().occurrenceIn(list2) }

fun Int.occurrenceIn(list:List<Int>) = list.count { it == this}
