package lib

interface Vector {
    val row: Int
    val col: Int
}

data class Position(override val row: Int, override val col: Int):Vector {
    operator fun plus(other: Vector) = Position(this.row + other.row, this.col + other.col)
    operator fun times(scalar: Int) = Position(this.row * scalar, this.col * scalar)
}

data class Direction(override val row: Int, override val col: Int): Vector {
    operator fun plus(other: Vector) = Direction(this.row + other.row, this.col + other.col)
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
