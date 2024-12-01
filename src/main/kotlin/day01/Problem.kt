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
    val scoreMap = createMapOfOccurrence(list1, list2)
    return list1.map{ it * scoreMap.getValue(it) }
}

fun createMapOfOccurrence(list1:List<Int>, list2:List<Int>, scoreMap:MutableMap<Int, Int> = mutableMapOf()):Map<Int, Int> =
    if (list1.isEmpty() ) scoreMap
    else createMapOfOccurrence(list1.drop(1), list2, scoreMap).also { list1.first().updateOccurrenceIn(list2, scoreMap)}

fun Int.updateOccurrenceIn(list:List<Int>, scoreMap:MutableMap<Int, Int> = mutableMapOf() ):Int {
    if (this !in scoreMap) scoreMap[this] = list.count { it == this}
    return scoreMap.getValue(this)
}
