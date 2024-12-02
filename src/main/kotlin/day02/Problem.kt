package day02

fun partOne(data:List<String>) = data.parse().count{it.diffs().areValid()}

fun List<String>.parse() = map(String::parse)

fun String.parse() = split(" ").map(String::toInt)

fun List<Int>.diffs() = windowed(2,1).map{it[0] - it[1]}

fun List<Int>.areValid() = all{diff -> diff in 1..3} || all{diff -> diff in -3..-1}

fun partTwo(data:List<String>): Int {
    return data.parse().count { it.reportIsValid() }
}

fun List<Int>.reportIsValid() =
    diffs().areValid() || removeOneElement().any{it.diffs().areValid()}

fun List<Int>.removeOneElement() = indices.map{ j -> this.filterIndexed { i, _ -> i != j }}