package day07

val operations = mapOf(
    '+' to {a:Long, b:Long -> a + b},
    '*' to {a:Long, b:Long -> a * b},
    '|' to {a:Long, b:Long -> "$a$b".toLong()},
    )
typealias Operation = (Long, Long) -> Long

fun partOne(data:List<String>): Long {
    val input = parseInput(data)
    val evaluators = createEvaluators(input.maxOf { it.second.size} - 1)
    return input.filter { it.first in it.second.evaluate(evaluators) }.sumOf { it.first }
}

fun List<Long>.evaluate(evaluators:Map<Int, List<List<Operation>>>) =
    evaluators.getValue(size - 1).let{evaluator ->
        evaluator.map{e -> drop(1).foldIndexed(first()){i, result, n ->
            e.get(i)(result, n) }  }
    }

fun createEvaluators(qty:Int, operators:List<Char> = listOf('+','*'),operations:Map<Char, Operation> = day07.operations): Map<Int, List<List<Operation>>>{
    val output = mutableMapOf<Int, List<List<(Long,Long) -> Long>>>()
    (1..qty).forEach { n ->
        output[n] = buildCombinations(n,operators).map{ combo -> combo.map{operations.getValue(it)} }
    }
    return output
}

fun parseInput(data:List<String>):List<Pair<Long,List<Long>>> =
    data.map(String::parseInput)

fun String.parseInput() = Pair(
    split(":").first().toLong(),
    split(": ").last().split(" ").map(String::toLong))

fun buildCombinations(size:Int, options:List<Char>,output:List<List<Char>> = options.map{listOf(it)}):List<List<Char>> {
    if (size == 1) return output
    return buildCombinations(size - 1, options, options.flatMap{ option -> output.map { it -> it + option }  })
}

fun partTwo(data:List<String>): Long {
    val input = parseInput(data)
    val evaluators = createEvaluators(input.maxOf { it.second.size}, listOf('+','*','|'))
    return input.filter { it.first in it.second.evaluate(evaluators) }.sumOf { it.first }
}