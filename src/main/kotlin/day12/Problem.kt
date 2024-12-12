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

fun partTwo(data:List<String>): Int {
    return 0
}