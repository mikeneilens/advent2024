package lib

import day12.getPlotsAndBoundaries

interface Vector {
    val row: Int
    val col: Int
    operator fun times(scalar: Int) = Position(this.row * scalar, this.col * scalar)

}

data class Position(override val row: Int, override val col: Int):Vector {
    operator fun plus(other: Vector) = Position(this.row + other.row, this.col + other.col)
    operator fun minus(other: Vector) = Position(this.row - other.row, this.col - other.col)
    fun isInRange(maxRow:Int, maxCol:Int):Boolean  = row >= 0 && row <= maxRow && col >= 0 && col <= maxCol

}

data class Direction(override val row: Int, override val col: Int): Vector {
    operator fun plus(other: Vector) = Direction(this.row + other.row, this.col + other.col)
    override operator fun times(scalar: Int) = Position(this.row * scalar, this.col * scalar)

    companion object {
        val up = Direction(-1, 0)
        val down = Direction(+1, 0)
        val left = Direction(0, -1)
        val right = Direction(0, +1)
        val  upLeft = up + left
        val  upRight = up + right
        val  downLeft = down + left
        val  downRight = down + right
    }
}

data class Velocity(override val row: Int, override val col: Int): Vector

fun List<String>.charAt(position: Position):String = if (position.row in indices && position.col in get(position.row).indices) this[position.row][position.col].toString() else ""

fun List<String>.positionsOf(s:String) = indices.flatMap { row -> this[row].indices.map{col -> Position(row, col) }}.filter{ charAt(it) == s}

fun List<String>.allPositions() = indices.flatMap { row -> this[row].indices.map{col -> Position(row, col)} }
