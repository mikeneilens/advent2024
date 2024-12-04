package day04


data class Position(val row: Int, val col: Int) {
    operator fun plus(other: Position) = Position(this.row + other.row, this.col + other.col)
    operator fun times(scalar: Int) = Position(this.row * scalar, this.col * scalar)

    fun lines(length: Int) = listOf(lineR(length),lineL(length),lineU(length), lineD(length),
        lineUL(length), lineUR(length),lineDL(length), lineDR(length),
        )

    fun lineR(length:Int) = (0 until length).map { Position(this.row, this.col) + Position(0,1) * it }
    fun lineL(length:Int) = (0 until length).map { Position(this.row, this.col) + Position(0,-1) * it }
    fun lineU(length:Int) = (0 until length).map { Position(this.row, this.col) + Position(-1,0) * it }
    fun lineD(length:Int) = (0 until length).map { Position(this.row, this.col) + Position(1,0) * it }
    fun lineUL(length:Int) = (0 until length).map { Position(this.row, this.col) + Position(-1,-1) * it }
    fun lineUR(length:Int) = (0 until length).map { Position(this.row, this.col) + Position(-1,1) * it }
    fun lineDL(length:Int) = (0 until length).map { Position(this.row, this.col) + Position(1,-1) * it }
    fun lineDR(length:Int) = (0 until length).map { Position(this.row, this.col) + Position(1,1) * it }

    fun masLines(length: Int) = listOf(
        lineDR(length) + (this + Position(length - 1,0)).lineUR(length  ),
        lineDR(length) + (this + Position(0,length - 1)).lineDL(length  ),
        (this + Position(length - 1, length - 1)).lineUL(length  ) + (this + Position(length - 1,0)).lineUR(length  ) ,
        (this + Position(length - 1, length - 1)).lineUL(length  ) + (this + Position(0,length - 1)).lineDL(length  )
    )
}

fun partOne(data:List<String>) =
    data.flatMapIndexed{row, line -> line.indices.map{col -> data.wordsAt(Position(row, col))}}.sumOf { it.size }

fun List<String>.wordsAt(position: Position, word:String = "XMAS") =
    position.lines(word.length).map{line -> word(line)}.filter { it == word }

fun List<String>.word(positions:List<Position>) = positions.map{char(it)}.joinToString("")

fun List<String>.char(position: Position) = if (position.row in indices && position.col in get(position.row).indices) this[position.row][position.col] else ""

fun partTwo(data:List<String>) =
    data.flatMapIndexed{row, line -> line.indices.map{col -> data.masWordsAt(Position(row, col))}}.sumOf { it.size }

fun List<String>.masWordsAt(position: Position, word:String = "MASMAS") =
    position.masLines(word.length/2).map{line -> word(line)}.filter { it == word }


