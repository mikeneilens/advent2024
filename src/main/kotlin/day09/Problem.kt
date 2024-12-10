package day09

sealed interface BlockType

data class Block(val num:Int, val id:Int):BlockType
object None:BlockType

fun partOne(data:String): Long {
    val input = parse(data)
    return input.toMutableList<BlockType>().moveBlock().filter{it is Block}.checksum()
}

fun List<BlockType>.checksum() = foldIndexed(0L) { i, result, block ->
    if (block is Block) result + i * block.num
    else result
}

fun MutableList<BlockType>.moveBlock():MutableList<BlockType> {
    var start = 0
    var end = lastIndex
    while (start < end) {
        if (this[start] is None) {
            if (this[end] is None) {
                end = this.nextEnd(end)
            }
            swap(start, end)
            end--
        }
        start++
    }
    return this
}
fun MutableList<BlockType>.nextEnd(i:Int):Int = if (this[i] is None) nextEnd(i - 1) else i

fun <E>MutableList<E>.swap(a:Int, b:Int) { this[a] = this[b].also { this[b] = this[a] }}

fun parse(data:String):List<BlockType> =
    data.flatMapIndexed { i, c ->
        if (i % 2 == 0)
            List(c.toString().toInt()) { Block(i / 2, i / 2) }
        else
            List(c.toString().toInt()) { None }
    }

sealed interface BigBlockType {
    val size:Int
}

data class BigBlock(override val size:Int, val num:Int, val id:Int):BigBlockType
data class BigNone(override val size:Int):BigBlockType

fun partTwo(data:String): Long {
    val input = parse2(data)
    return input.toMutableList<BigBlockType>().moveBlock2().toBlocks().checksum()
}

fun List<BigBlockType>.toBlocks() = flatMap{block ->  List(block.size){if (block is BigBlock) Block(block.num,0) else None} }

fun parse2(data:String):List<BigBlockType> =
    data.mapIndexed { i, c ->
        if (i % 2 == 0)
            BigBlock(c.toString().toInt(),i / 2, i / 2)
        else
            BigNone(c.toString().toInt())
    }

fun MutableList<BigBlockType>.moveBlock2():MutableList<BigBlockType> {
    var end = lastIndex
    while (end > 0) {
        val start = indexOfFirst{ it is BigNone && it.size >= this[end].size}
        if (start >= 0 && start < end) {
            val startSize = this[start].size
            val endSize  = this[end].size
            if (this[end].size < this[start].size) {
                swap(start, end)
                set(end, BigNone(endSize))
                add(start + 1, BigNone(startSize - endSize))
            } else {
                swap(start, end)
            }
        }
        end = nextEnd2(end - 1)
    }
    return this
}

fun MutableList<BigBlockType>.nextEnd2(i:Int):Int = if (this[i] is BigBlock ) i else nextEnd2(i - 1)
