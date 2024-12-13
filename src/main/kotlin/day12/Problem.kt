package day12

import lib.Direction
import lib.Position
import lib.allPositions
import lib.charAt

fun partOne(data:List<String>) =
    data.getPlotsAndBoundaries().sumOf { it.first * it.second }

fun List<String>.getPlotsAndBoundaries():List<Pair<Int, Int>> {
    val visited = mutableSetOf<Position>()
    val plots = allPositions().mapNotNull{position ->
      if (position !in visited) {
            getPlot(charAt(position), setOf(position),visited)
      } else null
    }
    return plots.map{ Pair(it.size, plotBoundarySize(it) ) }
}

fun List<String>.getPlot(type:String, frontier:Set<Position>, visited:MutableSet<Position>, plot:Set<Position> = frontier.toSet()):Set<Position> {
    if (frontier.isEmpty()) return plot
    visited.addAll(frontier)
    val newFrontier = frontier.flatMap { position -> position.adjacentPositions()}.filter{ position -> position !in plot && charAt(position) == type }.toSet()
    return getPlot(type, newFrontier, visited, plot + newFrontier)
}

fun List<String>.plotBoundarySize(plot: Set<Position>) =
    plot.sumOf{ position -> position.adjacentPositions().count{adjacentPosition -> charAt(adjacentPosition) != charAt(position)}  }

fun Position.adjacentPositions() = setOf(plus(Direction.up), plus(Direction.right), plus(Direction.down), plus(Direction.left))

fun partTwo(data:List<String>): Int =
    data.getPlotsAndSides().sumOf { it.first * it.second }

fun List<String>.getPlotsAndSides():List<Pair<Int, Int>> {
    val visited = mutableSetOf<Position>()
    val plots = allPositions().mapNotNull{position ->
        if (position !in visited) {
            getPlot(charAt(position), setOf(position),visited)
        } else null
    }
    return plots.map{ Pair(it.size, plotSides(it) ) }
}

fun List<String>.plotSides(plot: Set<Position>):Int {
    val rows = plot.rows()
    val columns = plot.columns()
    return rows.sumOf{row -> boundary(plot, row, Direction.up)} + rows.sumOf{row -> boundary(plot, row, Direction.down)} +
            columns.sumOf{column -> boundary(plot, column, Direction.left)} + columns.sumOf{column -> boundary(plot, column, Direction.right)}
}

fun Set<Position>.columns() =  (minOf { it.col }..maxOf { it.col }).map{col ->  (minOf { it.row }..maxOf { it.row }).map{row-> Position(row, col)}}
fun Set<Position>.rows() =  (minOf { it.row }..maxOf { it.row }).map{row ->  (minOf { it.col }..maxOf { it.col }).map{col-> Position(row, col)}}

fun List<String>.boundary(plot:Set<Position>, positions:List<Position>,direction:Direction) = positions.fold(Pair(0, false)){ output, position ->
    if (position in plot &&  charAt(position + direction) != charAt(position))
        if (output.second) Pair(output.first, true) else Pair(output.first + 1, true)
    else Pair(output.first, false)
}.first
