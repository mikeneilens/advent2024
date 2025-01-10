package day24

fun partOne(variableData:List<String>, gateData:List<String>): Long {
    val variables = parseToVariables(variableData)
    val gates= parseToGates(gateData, variables)
    processGates(gates)
    return variables.toValue()
}

fun parseToVariables(variableData:List<String>):MutableMap<String, Boolean> {
    val variables = mutableMapOf<String, Boolean>()
    variableData.forEach { s -> variables[s.split(": ")[0]] = if (s.split(": ")[1] == "1") true else false }
    return variables
}

fun parseToGates(gateData:List<String>, variables: MutableMap<String, Boolean>):List<Gate> =
    gateData.map{ s->
        val (input1, _, input2, _, output ) = s.split(" ")
        when (s.split(" ")[1]) {
            "AND" -> AndGate(input1, input2, output,variables)
            "OR" -> OrGate(input1, input2, output,variables)
            else -> XOrGate(input1, input2, output,variables)
        }
    }

fun processGates(gates:List<Gate>) {
    while (gates.any { it.canCompute() }) {
        gates.forEach { gate -> if (gate.canCompute()) gate.compute() }
    }
}

fun Map<String, Boolean>.toValue() =
    toList().filter{it.first.startsWith("z")}.sortedByDescending { it.first }.map{if (it.second) "1" else "0"}
        .joinToString("").toLong(radix =2)

interface Gate{
    val input1:String
    val input2:String
    val output:String
    val variables:MutableMap<String, Boolean>
    fun compute()
    fun canCompute() = input1 in variables && input2 in variables && output !in variables
}
class AndGate(override val input1: String, override val input2: String, override val output: String, override val variables: MutableMap<String, Boolean>):Gate {
    override fun compute() { variables[output] = if (variables.getValue(input1) && variables.getValue(input2) ) true else  false }
}
class OrGate(override val input1: String, override val input2: String, override val output: String, override val variables: MutableMap<String, Boolean>):Gate {
    override fun compute() { variables[output] = if (variables.getValue(input1) || variables.getValue(input2) ) true else  false }
}
class XOrGate(override val input1: String, override val input2: String, override val output: String, override val variables: MutableMap<String, Boolean>):Gate {
    override fun compute() { variables[output] = if ((variables.getValue(input1) || variables.getValue(input2)) && variables.getValue(input1) !=  variables.getValue(input2) ) true else  false }
}

fun partTwo(variableData:List<String>, gateData:List<String>): Int {
    return 0
}