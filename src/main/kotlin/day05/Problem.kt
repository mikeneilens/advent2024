package day05

fun partOne(data:List<String>,rulesData:List<String>): Int {
    val mustBeBefore = mutableMapOf<String, Set<String>>()
    parseToBeforeMap(rulesData, mustBeBefore)
    return data.map{it.split(",")}
        .filter { it  == it.correctOrder(mustBeBefore)}
        .sumOf { it[it.size/2].toInt() }
}

fun parseToBeforeMap(rulesData:List<String>, mustBeBefore:MutableMap<String, Set<String>> = mutableMapOf()):Map<String, Set<String>>{
    rulesData.forEach{
        mustBeBefore.addToMap( Pair( it.split("|").first(),it.split("|").last()))
    }
    return mustBeBefore
}

fun MutableMap<String,Set<String>>.addToMap(values: Pair<String, String>) {
    if (values.first !in this) this[values.first] = setOf(values.second)
    else this[values.first] = getValue(values.first) + values.second
}

fun partTwo(data:List<String>,rulesData:List<String>): Int {
    val mustBeBefore = mutableMapOf<String, Set<String>>()
    parseToBeforeMap(rulesData, mustBeBefore)
    return data.map{it.split(",")}
        .filter { it  != it.correctOrder(mustBeBefore)}
        .map{it.correctOrder(mustBeBefore)}
        .sumOf { it[it.size/2].toInt() }
}

fun List<String>.correctOrder(mustBeBefore:Map<String, Set<String>>) =
    sortedByDescending{ (this.toSet() intersect mustBeBefore.getOrDefault(it, setOf())).size }
