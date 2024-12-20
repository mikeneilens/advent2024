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
    designs.forEach{design -> println( "$design ${matchingPatterns(design, patterns)}")}
    return designs.sumOf{ design ->
        matchingPatterns(design, patterns).count()
    }
}