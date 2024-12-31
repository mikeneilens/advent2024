package day17

import kotlin.math.pow

data class Status(val a:Long, val b:Long, val c:Long, val ip:Int, val output:String) {

    val comboMap:Map<Int, Long> = mapOf(4 to a, 5 to b, 6 to c )

    fun shouldHalt() = ip > instructions.lastIndex

    fun getCombo(combo:Int) = comboMap.getOrDefault(combo, combo).toInt()

    fun adv(operand:Int) = copy(a = (a/2.0.pow(getCombo(operand)).toLong()), ip = ip + 2)

    fun bxl(operand: Int) = copy (b = b.xor(operand.toLong()), ip = ip + 2)

    fun bst(operand: Int) = copy (b = (getCombo(operand) % 8).toLong(), ip = ip + 2)

    fun jnz(operand: Int) = if (a == 0L) copy(ip = ip + 2 ) else copy (ip = operand)

    fun bxc(operand: Int) = copy(b = b.xor(c), ip = ip + 2)

    fun out(operand: Int) = copy(output = (output + ",${getCombo(operand) % 8}").removePrefix(","), ip = ip + 2)

    fun bdv(operand:Int) = copy(b = (a/2.0.pow(getCombo(operand)).toLong()), ip = ip + 2)

    fun cdv(operand:Int) = copy(c = (a/2.0.pow(getCombo(operand)).toLong()), ip = ip + 2)

    fun process() = Status.operatorMap.getValue(instructions[ip])(instructions[ip + 1])

    companion object {
        val operatorMap:Map<Int, Status.(Int)->Status> = mapOf(0 to Status::adv, 1 to Status::bxl, 2 to Status::bst, 3 to Status::jnz,
            4 to Status::bxc, 5 to Status::out, 6 to Status::bdv, 7 to Status::cdv)
        var instructions:List<Int> = listOf()
    }
}

fun partOne(data:Status, program:List<Int>): Status {
    var status = data
    Status.instructions = program
    while (!status.shouldHalt()) {
        status = status.process()
    }
    return status
}

fun partTwo(data:List<String>): Int {
    return 0
}