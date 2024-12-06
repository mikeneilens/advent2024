package day04

import lib.Direction
import lib.Position

fun Position.lines(length: Int) = listOf(
    lineR(length),lineL(length),lineU(length), lineD(length),
    lineUL(length), lineUR(length),lineDL(length), lineDR(length),
)

fun Position.createLine(direction:Direction, length:Int) = (0 until length).map { Position(this.row, this.col) + direction * it }

fun Position.lineR(length:Int) =  createLine(direction = Direction.right, length)
fun Position.lineL(length:Int) =  createLine(direction = Direction.left, length)
fun Position.lineU(length:Int) =  createLine(direction = Direction.up, length)
fun Position.lineD(length:Int) =  createLine(direction = Direction.down, length)
fun Position.lineUL(length:Int) =  createLine(direction = Direction.upLeft, length)
fun Position.lineUR(length:Int) =  createLine(direction = Direction.upRight, length)
fun Position.lineDL(length:Int) =  createLine(direction = Direction.downLeft, length)
fun Position.lineDR(length:Int) =  createLine(direction = Direction.downRight, length)

fun partOne(data:List<String>) =
    data.flatMapIndexed{row, line -> line.indices.map{col -> data.wordsAt(Position(row, col))}}.sumOf { it.size }

fun List<String>.wordsAt(position: Position, word:String = "XMAS") =
    position.lines(word.length).map{line -> word(line)}.filter { it == word }

fun List<String>.word(positions:List<Position>) = positions.map{char(it)}.joinToString("")

fun List<String>.char(position: Position) = if (position.row in indices && position.col in get(position.row).indices) this[position.row][position.col] else ""

fun partTwo(data:List<String>) =
    data.flatMapIndexed{row, line -> line.indices.map{col -> data.crossedWordsAt(Position(row, col))}}.sumOf { it.size }

fun Position.crossedLines(length: Int) = listOf(
    lineDR(length) + (this + Position(length - 1,0)).lineUR(length),
    lineDR(length) + (this + Position(0,length - 1)).lineDL(length),
    (this + Position(length - 1, length - 1)).lineUL(length) + (this + Position(length - 1,0)).lineUR(length) ,
    (this + Position(length - 1, length - 1)).lineUL(length) + (this + Position(0,length - 1)).lineDL(length)
)

fun List<String>.crossedWordsAt(position: Position, word:String = "MASMAS") =
    position.crossedLines(word.length/2).map{ line -> word(line)}.filter { it == word }