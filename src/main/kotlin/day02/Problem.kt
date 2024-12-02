package day02

import kotlin.math.abs

fun partOne(data:List<String>) = data.parse().count{it.diffs().areValid()}

fun List<String>.parse() = map(String::parse)

fun String.parse() = split(" ").map(String::toInt)

fun List<Int>.diffs() = windowed(2,1).map{it[0] - it[1]}

fun List<Int>.areValid() = (all{it > 0} || all{it < 0}) && all{abs(it) in 1..3}

fun partTwo(data:List<String>): Int {
    return data.parse().count { it.reportIsValid() }
}

fun List<Int>.reportIsValid() =
    diffs().areValid() || removeOne().any{it.diffs().areValid()}

fun List<Int>.removeOne() = indices.map{ j -> this.filterIndexed { i, _ -> i != j }}