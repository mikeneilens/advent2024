package day18

import lib.*

fun partOne(data:List<String>, width:Int = 6, depth:Int = 6, qty:Int): Int {
    val chart = data.take(qty).toChart(depth,width)
    val cameFrom = Route()
    expandFrontierUntilEnd(setOf(Position(0,0)), cameFrom, chart, Position(depth, width))
    return cameFrom.routeToStart(Position(depth, width), Position(0,0)).size
}

fun List<String>.toChart(depth:Int, width:Int):Chart {
    val positions =  map(String::toPosition)
    return (0..depth).flatMap{row -> (0..width).map{col -> Pair(Position(row,col), if (Position(row, col) in positions) '#' else '.')}}.toMap()
}
fun String.toPosition() = Position(split(",")[1].toInt(),split(",")[0].toInt())

fun createNewFrontier(frontier:Set<Position>, cameFrom:Route, chart:Chart):Set<Position> =
    frontier.flatMap {position ->
        position.neighbours(chart).mapNotNull{ neighbour -> neighbour.addToCameFrom(position, cameFrom) }
    }.toSet()

fun Position.neighbours(chart:Chart)  = setOf(
    Direction.up, Direction.down, Direction.left, Direction.right
).map{this + it}.filter{it in chart && chart[it] != '#'}

fun Position.addToCameFrom(originalPosition:Position, cameFrom: Route):Position? =
    if (this !in cameFrom) {
        cameFrom[this] = originalPosition
        this
    } else null

tailrec fun expandFrontierUntilEnd(frontier:Set<Position>, cameFrom:Route, chart:Chart, end:Position):Set<Position> {
    if (end in cameFrom || frontier.isEmpty()) return frontier
    val newFrontier = createNewFrontier(frontier, cameFrom, chart)
    return expandFrontierUntilEnd(newFrontier, cameFrom, chart, end)
}

fun partTwo(data:List<String>, width:Int = 6, depth:Int = 6, qty:Int): String{
    val lastQty = (qty + 1..data.size).first {
        val chart = data.take(it).toChart(depth,width)
        val cameFrom = Route()
        expandFrontierUntilEnd(setOf(Position(0, 0)), cameFrom, chart, Position(depth, width))
        Position(depth, width) !in cameFrom
    }
    return data[lastQty - 1]
}