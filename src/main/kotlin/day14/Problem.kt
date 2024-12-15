package day14

import lib.Position
import lib.Velocity

data class Robot(val position: Position, val velocity: Velocity) {
    fun positionAfterMove(moves:Int,maxWidth:Int,maxHeight:Int) =
        (position + (velocity * moves)).let{p -> Position( p.row modulus maxHeight, p.col modulus  maxWidth )}
}

infix fun Int.modulus(other:Int) = if (this >= 0)   this % other else (other + (this % other)) % other

fun partOne(data:List<String>, maxWidth:Int,maxHeight:Int ): Int {
    val positions = data.parse().map{it.positionAfterMove(100, maxWidth, maxHeight)}
    val qtyPerQuadrant =  quadrants(maxWidth, maxHeight).map{ q-> positions.count{ position -> position.row in q.first && position.col in q.second}}
    return qtyPerQuadrant.fold(1, Int::times)
}

fun quadrants(maxWidth:Int,maxHeight:Int) = setOf(
    Pair(0 until(maxHeight/2), 0 until(maxWidth/2)),
    Pair((maxHeight/2 + 1)until maxHeight, 0 until(maxWidth/2)),
    Pair(0 until(maxHeight/2), (maxWidth/2 + 1) until maxWidth),
    Pair((maxHeight/2 + 1)until maxHeight, (maxWidth/2 + 1) until maxWidth)
)

fun List<String>.parse() = map(String::parse)

fun String.parse():Robot {
    val positionInts = split(" ")[0].split("=")[1].split(",").map{it.toInt()}
    val velocityInts = split(" ")[1].split("=")[1].split(",").map{it.toInt()}
    return Robot(Position(positionInts.last(),positionInts.first()),Velocity(velocityInts.last(),velocityInts.first()))
}

fun partTwo(data:List<String>): Int {
    return 0
}