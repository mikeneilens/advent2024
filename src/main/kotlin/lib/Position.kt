package lib

interface Vector<T> {
    val row: T
    val col: T
}

data class Position(override val row: Int, override val col: Int):Vector<Int> {
    operator fun plus(other: Vector<Int>) = Position(this.row + other.row, this.col + other.col)
    operator fun times(scalar: Int) = Position(this.row * scalar, this.col * scalar)

    fun isInRange(maxRow:Int, maxCol:Int):Boolean  = row >= 0 && row <= maxRow && col >= 0 && col <= maxCol

}

data class Direction(override val row: Int, override val col: Int): Vector<Int> {
    operator fun plus(other: Vector<Int>) = Direction(this.row + other.row, this.col + other.col)
    operator fun times(scalar: Int) = Position(this.row * scalar, this.col * scalar)

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

fun List<String>.charAt(position: Position):String = if (position.row in indices && position.col in get(position.row).indices) this[position.row][position.col].toString() else ""

fun List<String>.positionsOf(s:String) = indices.flatMap { row -> this[row].indices.map{col -> Position(row, col) }}.filter{ charAt(it) == s}

data class PositionD(override val row: Double, override val col: Double):Vector<Double> {
    operator fun plus(other: Vector<Double>) = PositionD(this.row + other.row, this.col + other.col)
    operator fun times(scalar: Int) = PositionD(this.row * scalar, this.col * scalar)

    fun isInRange(maxRow:Int, maxCol:Int):Boolean  = row >= 0 && row <= maxRow && col >= 0 && col <= maxCol
}
