package day18

import lib.*

fun partOne(data:List<String>, width:Int = 6, depth:Int = 6, qty:Int): Int {
    val bytes = data.take(qty).toBytes(depth,width)
    val cameFrom = Route()
    expandFrontierUntilEnd(setOf(Position(0,0)), cameFrom, bytes, Position(depth, width))
    return cameFrom.routeToStart(Position(depth, width), Position(0,0)).size
}

fun createNewFrontier(frontier:Set<Position>, cameFrom:Route, bytes:Set<Position>):Set<Position> =
    frontier.flatMap {position ->
        position.neighbours(bytes).mapNotNull{ neighbour -> neighbour.addToCameFrom(position, cameFrom) }
    }.toSet()

fun Position.neighbours(bytes:Set<Position>)  = setOf(Direction.up, Direction.down, Direction.left, Direction.right)
    .map{this + it}.filter{it !in bytes}

fun Position.addToCameFrom(originalPosition:Position, cameFrom: Route):Position? =
    if (this !in cameFrom) {
        cameFrom[this] = originalPosition
        this
    } else null

tailrec fun expandFrontierUntilEnd(frontier:Set<Position>, cameFrom:Route, bytes:Set<Position>, end:Position):Set<Position> {
    if (end in cameFrom || frontier.isEmpty()) return frontier
    val newFrontier = createNewFrontier(frontier, cameFrom, bytes)
    return expandFrontierUntilEnd(newFrontier, cameFrom, bytes, end)
}

fun partTwo(data:List<String>, width:Int = 6, depth:Int = 6, qty:Int): String{
    val lastQty = (qty + 1..data.size).first { qtyToTry ->
        val bytes = data.take(qtyToTry).toBytes(depth,width)
        val cameFrom = Route()
        expandFrontierUntilEnd(setOf(Position(0, 0)), cameFrom, bytes, Position(depth, width))
        Position(depth, width) !in cameFrom
    }
    return data[lastQty - 1]
}

fun List<String>.toBytes(depth:Int, width:Int) = (map(String::toPosition) +
        (-1..width + 1).map{col -> Position(-1, col)} +
        (-1..width + 1).map{col -> Position(depth + 1, col)} +
        (-1..depth + 1).map{row -> Position(row, -1)} +
        (-1..depth + 1).map{row -> Position(row, width + 1)}).toSet()

fun String.toPosition() = Position(split(",")[1].toInt(),split(",")[0].toInt())

