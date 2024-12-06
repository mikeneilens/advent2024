package day06

import lib.Direction
import lib.Position

fun partOne(data:List<String>): Int {
    val start = data.startPostion()
    val visited = data.move(start, Direction.up)
    return visited.count()
}

val nextDirection = mapOf<Direction, Direction>(Direction.up to Direction.right, Direction.right to Direction.down, Direction.down to Direction.left, Direction.left to Direction.up)

fun List<String>.move(position:Position, direction:Direction, visited:MutableSet<Position> = mutableSetOf()): Set<Position> {
    visited.add(position)
    val nextSquare = char(position + direction)
    if (nextSquare.isEmpty()) return visited
    val newDirection = if ( nextSquare == "#") nextDirection.getValue(direction) else direction
    return move(position + newDirection, newDirection, visited)
}

fun List<String>.startPostion(): Position
        = indexOfFirst { it.contains("^") }.let{row ->
    Position(row, get(row).indexOfFirst{it == '^'})
}

fun List<String>.char(position: Position) = if (position.row in indices && position.col in get(position.row).indices) this[position.row][position.col].toString() else ""

fun partTwo(data:List<String>): Int {
    val start = data.startPostion()
    val obstacles = data.flatMapIndexed { row, s -> s.indices.map { col -> Position(row, col) }}.filter{data.char(it) == "." }
    return obstacles.count{data.moveIsLoop(start, Direction.up, it)}
}

fun List<String>.moveIsLoop(position:Position, direction:Direction, obstruction:Position, visited:MutableSet<Pair<Position,Direction>> = mutableSetOf()): Boolean {
    if(visited.contains(Pair(position,direction))) return true
    visited.add(Pair(position,direction))
    if (char(position + direction).isEmpty()) return false
    val newDirection = newDirection(position, direction, obstruction)
    return moveIsLoop(position + newDirection, newDirection, obstruction, visited)
}

fun List<String>.newDirection(position:Position, direction:Direction, obstruction:Position):Direction =
    (position + direction).let{newPosition -> if (char(newPosition) == "#" || newPosition == obstruction)
        newDirection(position, nextDirection.getValue(direction),obstruction)
    else direction }

