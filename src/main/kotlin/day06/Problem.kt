package day06

import lib.Position

fun partOne(data:List<String>): Int {
    val start = data.startPostion()
    val visited = data.move(start, Position.up)
    return visited.count()
}

val nextDirection = mapOf(Position.up to Position.right, Position.right to Position.down, Position.down to Position.left, Position.left to Position.up)

fun List<String>.move(position:Position, direction:Position, visited:MutableSet<Position> = mutableSetOf()): Set<Position> {
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
    val obstacles = data.flatMapIndexed { row, s -> s.indices.map { col -> Position(row, col) }  }
    return obstacles.count{data.moveIsLoop(start, Position.up, it)}
}

fun List<String>.moveIsLoop(position:Position, direction:Position, obstruction:Position, visited:MutableSet<Pair<Position,Position>> = mutableSetOf()): Boolean {
    if(visited.contains(Pair(position,direction))) return true
    visited.add(Pair(position,direction))
    if (char(position + direction).isEmpty()) return false
    val newDirection = newDirection(position, direction, obstruction)
    return moveIsLoop(position + newDirection, newDirection, obstruction, visited)
}

fun List<String>.newDirection(position:Position, direction:Position, obstruction:Position):Position =
    (position + direction).let{newPosition -> if (char(newPosition) == "#" || newPosition == obstruction)
        newDirection(position, nextDirection.getValue(direction),obstruction)
    else direction }

