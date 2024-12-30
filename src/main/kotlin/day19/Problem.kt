package day19

fun partOne(patterns:String, designs:List<String>): Int {
    val patterns = patterns.parsePatterns()
    return designs.filter{ design ->
        matchingPatterns(design, patterns).isNotEmpty()
    }.size
}

fun String.parsePatterns() = split(", ").toSet()

fun matchingPatterns(design:String, patterns:Set<String>, memo:MutableMap<String,List<List<Boolean>>> = mutableMapOf()):List<List<Boolean>> {
    if (design.isEmpty()) return listOf(listOf(true))
    else if (design in memo) return memo.getValue(design)
    else return  patterns.filter{pattern -> design.startsWith(pattern)}.flatMap { pattern ->
        matchingPatterns(design.removePrefix(pattern), patterns, memo).also{memo[design] = it}
    }
}

fun partTwo(patterns:String, designs:List<String>): Int {
    val patterns = patterns.parsePatterns()
    val cache2 = mutableMapOf<String, Int>()
    designs.forEach{design -> println( "$design ${checkValidPattern(patterns, design, cache2)}")}
    println()

    designs.forEach{design -> println( "$design ${matchingPatterns(design, patterns)}")}
    return designs.sumOf{ design ->
        matchingPatterns(design, patterns).count()
    }
}

fun checkValidPattern( patterns: Set<String>, sequence: String, cache2:MutableMap<String, Int>):Int {
    if (sequence in cache2) {
        return cache2.getValue(sequence)
    }
    var count = 0
    patterns.filter{ pattern -> sequence.startsWith(pattern) }.forEach {
        var next = sequence
        next = sequence.removePrefix(next)
        if (next.isEmpty()) {
            count += 1
        } else {
            count += checkValidPattern(patterns, next, cache2)
        }
    }

    cache2[sequence] = count
    return count

}