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

fun createSimilarityScore(list1: List<Int>, list2: List<Int>) = list1.map{ it * (it occurrencesIn list2) }

infix fun Int.occurrencesIn(list:List<Int> ) = list.count { it == this}

