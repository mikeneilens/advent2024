package day03

fun partOne(data:String) =
    data.split("mul(")
        .toNumberStrings()
        .map(String::toDigits)
        .filter { it.first in 1..999 && it.second in 1..999 }
        .sumOf { it.first * it.second }


fun List<String>.toNumberStrings() = map{it.split(")").firstOrNull() ?: "0,0"}

fun String.toDigits() = split(",").let{ if (it.size == 2) Pair(it[0].toIntOrNull() ?: 0, it[1].toIntOrNull() ?:0 ) else Pair(0,0) }

fun partTwo(data:String) =  partOne(data.removeDont())

fun String.removeDont() = split("do()").joinToString("") { it.split("don't()").first() }