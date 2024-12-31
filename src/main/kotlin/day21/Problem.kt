package day21

import lib.Position

fun partOne(data:List<String>, noOfRobots:Int = 2): Int {
    val results = data.map{ sequence ->
        (1..noOfRobots).fold(numericKeypad.getValue('A').routeToTarget(sequence, numericKeypad)) {
            s, _ -> directionalKeypad.getValue('A').routeToTarget(s, directionalKeypad)
        }
    }
    return data.map{it.removeSuffix("A").toInt()}.zip(results).map{it.first * it.second.length}.sum()
}

val numericKeypad = mapOf(
    '7' to Position(0,0), '8' to Position(0,1), '9' to Position(0,2),
    '4' to Position(1,0), '5' to Position(1,1), '6' to Position(1,2),
    '1' to Position(2,0), '2' to Position(2,1), '3' to Position(2,2),
    '0' to Position(3,1), 'A' to Position(3,2),
)
val directionalKeypad = mapOf(
    '^' to Position(0,1), 'A' to Position(0,2),
    '<' to Position(1,0), 'v' to Position(1,1),'>' to Position(1,2)
)

tailrec fun Position.routeToTarget(target:String, keypad:Map<Char, Position>, result:String = ""):String {
    if (target.isEmpty()) return result
    else {
        val nextPosition = keypad.getValue(target.first())
        val nextRoute = routeToTarget(target.first(),keypad)
        return nextPosition.routeToTarget(target.drop(1), keypad, result + nextRoute)
    }
}

fun Position.routeToTarget(target:Char, keypad:Map<Char, Position>):String {
    val targetPosition = keypad.getValue(target)
    return (
        if (this.col == 0 || this == Position(2,2) ) horizontals(targetPosition) + verticals(targetPosition) + "A"
        else verticals(targetPosition) + horizontals(targetPosition) +  "A"
    )
}

fun Position.verticals(targetPosition:Position) =
    if (targetPosition.row < row) List(row - targetPosition.row){'^'}.joinToString("")
    else List(targetPosition.row - row){'v'}.joinToString("")

fun Position.horizontals(targetPosition:Position) =
    if (targetPosition.col < col) List(col - targetPosition.col){'<'}.joinToString("")
    else List(targetPosition.col - col){'>'}.joinToString("")

fun partTwo(data:List<String>): Int {
    return partOne(data, noOfRobots = 25) //this won't work as the length of key inputs is too large
}