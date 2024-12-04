package lib

data class Position(val row: Int, val col: Int) {
    operator fun plus(other: Position) = Position(this.row + other.row, this.col + other.col)
    operator fun times(scalar: Int) = Position(this.row * scalar, this.col * scalar)

    companion object {
        val up = Position(-1, 0)
        val down = Position(+1, 0)
        val left = Position(0, -1)
        val right = Position(0, +1)
        val  upLeft = up + left
        val  upRight = up + right
        val  downLeft = down + left
        val  downRight = down + right
    }
}

