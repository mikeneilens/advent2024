package day06

import lib.Direction
import lib.Position

fun partOne(data:List<String>): Int {
    val start = data.startPostion()
    val visited = data.move(start, Direction.up, Position(-100,-100))
    return visited.map{it.first}.distinct().count()
}

val nextDirection = mapOf<Direction, Direction>(Direction.up to Direction.right, Direction.right to Direction.down, Direction.down to Direction.left, Direction.left to Direction.up)

fun List<String>.move(position:Position, direction:Direction, obstruction:Position, visited:MutableSet<Pair<Position,Direction>> = mutableSetOf()): Set<Pair<Position,Direction>> {
    if(visited.contains(Pair(position,direction))) return emptySet()
    visited.add(Pair(position,direction))
    if (char(position + direction).isEmpty()) return visited
    val newDirection = newDirection(position, direction, obstruction)
    return move(position + newDirection, newDirection, obstruction, visited)
}

fun List<String>.newDirection(position:Position, direction:Direction, obstruction:Position):Direction =
    (position + direction).let{newPosition -> if (char(newPosition) == "#" || newPosition == obstruction)
        newDirection(position, nextDirection.getValue(direction),obstruction)
    else direction }

fun List<String>.startPostion(): Position
        = indexOfFirst { it.contains("^") }.let{row ->
    Position(row, get(row).indexOfFirst{it == '^'})
}

fun List<String>.char(position: Position) = if (position.row in indices && position.col in get(position.row).indices) this[position.row][position.col].toString() else ""

fun partTwo(data:List<String>): Int {
    val start = data.startPostion()
    val obstacles = data.flatMapIndexed { row, s -> s.indices.map { col -> Position(row, col) }}.filter{data.char(it) == "." }
    return obstacles.count{data.move(start, Direction.up, it) == emptySet<Pair<Position, Direction>>()}
}


