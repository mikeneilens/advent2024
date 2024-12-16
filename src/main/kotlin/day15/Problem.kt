package day15

import lib.Direction
import lib.Position

fun partOne(dataMap:List<String>, dataMoves:String): Int {
    val warehouseMap = dataMap.parse()
    val moves = dataMoves.parse()
    moves.fold(warehouseMap.start()){ p, move ->
        warehouseMap.move(setOf(p), move)
    }
    return warehouseMap.toList().filter { it.second == 'O' }.sumOf { it.first.row * 100 + it.first.col }
}

val directions = mapOf('^' to Direction.up, 'v' to Direction.down, '<' to Direction.left, '>' to Direction.right)

fun List<String>.parse(transform:Map<Char, List<Char>> = mapOf(), size:Int = 1) = mutableMapOf<Position, Char>().apply {
    forEachIndexed{row, s -> s.forEachIndexed {col, char ->
        this[Position(row,col * size)] = transform.get(char)?.get(0) ?: char
        this[Position(row,col * size + 1)] = transform.get(char)?.get(1) ?: char
    }}
}

fun String.parse() = filter{it in directions.keys}.map{ c -> directions.getValue(c)}

fun MutableMap<Position, Char>.start() = toList().first { it.second == '@'}.first

fun partTwo(dataMap:List<String>, dataMoves:String): Int {
    val warehouseMap = dataMap.parse(transform, size = 2)
    val moves = dataMoves.parse()
    moves.fold(warehouseMap.start()){ p, move ->
        warehouseMap.move(setOf(p), move)
    }
    return warehouseMap.toList().filter { it.second == '[' }.sumOf { it.first.row * 100 + it.first.col }
}

fun MutableMap<Position, Char>.move(positions:Set<Position>, direction:Direction):Position {
    if ( anyCannotMove(positions)) return positions.first()
    val newPositions = positions.flatMap{position -> parts.getValue(direction).getValue(getValue(position)).map{ offset-> position + direction + Position(0,offset) } }.toSet()
    if (anyAreNotEmpty(newPositions)) move(newPositions.filter{getValue(it)!= '.'}.toSet(), direction)
    if (allAreEmpty(newPositions)) {
        moveToNewPosition(newPositions, direction)
        return positions.first() + direction
    } else return positions.first()
}

fun MutableMap<Position, Char>.anyCannotMove(positions:Set<Position>) = positions.any{this[it] == '#' || this[it] == '.'}
fun MutableMap<Position, Char>.anyAreNotEmpty(positions:Set<Position>) = positions.any{this[it] != '.'}
fun MutableMap<Position, Char>.allAreEmpty(positions:Set<Position>) = positions.all{this[it] == '.'}

fun MutableMap<Position, Char>.moveToNewPosition(newPositions:Set<Position>, direction:Direction) =
    newPositions.forEach { newPosition ->
        this[newPosition] = getValue(newPosition - direction)
        this[newPosition - direction] = '.'
    }

val transform: Map<Char, List<Char>> = mapOf('#' to listOf('#','#'),'O' to listOf('[',']'), '.' to listOf('.','.'),'@' to listOf('@','.'))

val horizontalParts = mapOf('#' to listOf(0),'[' to listOf(0,1),']' to listOf(0,-1),'.' to listOf(0),'@' to listOf(0), 'O' to listOf(0))
val singleParts = mapOf('#' to listOf(0),'[' to listOf(0),']' to listOf(0),'.' to listOf(0),'@' to listOf(0), 'O' to listOf(0))
val parts = mapOf(Direction.up to horizontalParts, Direction.down to horizontalParts, Direction.left to singleParts, Direction.right to singleParts)

fun MutableMap<Position, Char>.asString() =
    (0..(keys.maxOf{it.row})).map{row ->
        (0..(keys.maxOf{it.col})).map{col ->
            this[Position(row, col)] ?: ' '
        }.joinToString("") + '\n'
    }.joinToString("")
