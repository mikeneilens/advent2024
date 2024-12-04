package day04


data class Position(val row: Int, val col: Int) {
    operator fun plus(other: Position) = Position(this.row + other.row, this.col + other.col)
    operator fun times(scalar: Int) = Position(this.row * scalar, this.col * scalar)

    fun lines(length: Int) = listOf(lineR(length),lineL(length),lineU(length), lineD(length),
        lineUL(length), lineUR(length),lineDL(length), lineDR(length),
        )

    fun createLine(direction:Position, length:Int) = (0 until length).map { Position(this.row, this.col) + direction * it }

    fun lineR(length:Int) =  createLine(direction = Position(0,1), length)
    fun lineL(length:Int) =  createLine(direction = Position(0,-1), length)
    fun lineU(length:Int) =  createLine(direction = Position(-1,0), length)
    fun lineD(length:Int) =  createLine(direction = Position(1,0), length)
    fun lineUL(length:Int) =  createLine(direction = Position(-1,-1), length)
    fun lineUR(length:Int) =  createLine(direction = Position(-1,1), length)
    fun lineDL(length:Int) =  createLine(direction = Position(1,-1), length)
    fun lineDR(length:Int) =  createLine(direction = Position(1,1), length)

    fun masLines(length: Int) = listOf(
        lineDR(length) + (this + Position(length - 1,0)).lineUR(length),
        lineDR(length) + (this + Position(0,length - 1)).lineDL(length),
        (this + Position(length - 1, length - 1)).lineUL(length) + (this + Position(length - 1,0)).lineUR(length) ,
        (this + Position(length - 1, length - 1)).lineUL(length) + (this + Position(0,length - 1)).lineDL(length)
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


