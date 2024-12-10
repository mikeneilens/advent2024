package day10

import lib.Direction
import lib.Position

fun partOne(data:List<String>) = data.trailHeads().sumOf{data.paths(it).distinct().size}

fun List<String>.trailHeads() = indices.flatMap { row -> this[row].indices.map{col -> Position(row, col) }}.filter{ char(it) == "0"}

fun List<String>.paths(currentPosition:Position):List<Position> =
    if (char(currentPosition) == "9") listOf(currentPosition)
    else nextPosition(currentPosition).flatMap { paths(it)}

fun List<String>.nextPosition(position: Position) =
    listOf(Direction.up, Direction.down, Direction.left, Direction.right).map{position + it}.filter{ newPosition ->
        newPosition.isInRange(lastIndex,first().lastIndex) && char(newPosition).value() - char(position).value() == 1
    }

fun List<String>.char(position: Position):String = if (position.row in indices && position.col in get(position.row).indices) this[position.row][position.col].toString() else ""

fun String.value() = toIntOrNull() ?: Int.MIN_VALUE

fun partTwo(data:List<String>)= data.trailHeads().sumOf{data.paths(it).size}
