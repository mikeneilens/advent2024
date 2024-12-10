package day10

import lib.Direction
import lib.Position
import lib.charAt
import lib.positionsOf

fun partOne(data:List<String>) = data.trailHeads().sumOf{data.paths(it).distinct().size}

fun List<String>.trailHeads() = positionsOf("0")

fun List<String>.paths(currentPosition:Position):List<Position> =
    if (charAt(currentPosition) == "9") listOf(currentPosition) else nextPosition(currentPosition).flatMap { paths(it)}

fun List<String>.nextPosition(position: Position) =
    listOf(Direction.up, Direction.down, Direction.left, Direction.right).map{position + it}.filter{ newPosition ->
        newPosition.isInRange(lastIndex,first().lastIndex) && charAt(newPosition).value() - charAt(position).value() == 1
    }

fun String.value() = toIntOrNull() ?: Int.MIN_VALUE

fun partTwo(data:List<String>)= data.trailHeads().sumOf{data.paths(it).size}
