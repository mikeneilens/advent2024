package day09

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ProblemTest:WordSpec ({
    val sampleData = """
        2333133121414131402
    """.trimIndent()

    "With part one" should {
        "2333133121414131402 parses to 00...111...2...333.44.5555.6666.777.888899" {
            parse("2333133121414131402").map{ if (it is Block) "${it.num}" else "." }.joinToString("")  shouldBe "00...111...2...333.44.5555.6666.777.888899"
        }
        "00...111...2...333.44.5555.6666.777.888899 after moving blocks is 0099811188827773336446555566" {
            val input = parse(sampleData)
            println(input.toMutableList().moveBlock())
            input.toMutableList().moveBlock().map{ if (it is Block) "${it.num}" else "." }.joinToString("") shouldBe "0099811188827773336446555566.............."
        }
        "checksum of 0099811188827773336446555566 is 1928 " {
            val input = parse(sampleData)
            input.toMutableList().moveBlock().filter { it is Block }.checksum() shouldBe 1928
        }
        "part one using sample data is 1928" {
            partOne(sampleData) shouldBe 1928
        }
        "answer to part one is " {
            //90192861055 too low
            partOne(puzzleInput) shouldBe 1928
        }
    }
    "With part two" should {
        "parse sample data into BigBlockType" {
            parse2(sampleData) shouldBe listOf(
                BigBlock(size=2, num=0, id=0),
                BigNone(size=3), BigBlock(size=3, num=1, id=1),
                BigNone(size=3), BigBlock(size=1, num=2, id=2),
                BigNone(size=3), BigBlock(size=3, num=3, id=3),
                BigNone(size=1), BigBlock(size=2, num=4, id=4),
                BigNone(size=1), BigBlock(size=4, num=5, id=5),
                BigNone(size=1), BigBlock(size=4, num=6, id=6),
                BigNone(size=1), BigBlock(size=3, num=7, id=7),
                BigNone(size=1), BigBlock(size=4, num=8, id=8),
                BigNone(size=0), BigBlock(size=2, num=9, id=9)
            )
        }
        "00...111...2...333.44.5555.6666.777.888899 after moving blocks is 00992111777.44.333....5555.6666.....8888.." {
            parse2(sampleData).toMutableList().moveBlock2()
                .map{block -> List(block.size){if (block is BigBlock) "${block.num}" else "."  }.joinToString("")  }.joinToString("") shouldBe "00992111777.44.333....5555.6666.....8888.."
        }
        "part two using sample data is 2858" {
            partTwo(sampleData) shouldBe 2858
        }
        "answer to part two is " {
            partTwo(puzzleInput) shouldBe 6347435485773
        }
    }
})