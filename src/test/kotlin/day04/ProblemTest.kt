package day04

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ProblemTest:WordSpec ({
    val sampleData = """
MMMSXXMASM
MSAMXMSMSA
AMXSXMAAMM
MSAMASMSMX
XMASAMXAMM
XXAMMXXAMA
SMSMSASXSS
SAXAMASAAA
MAMMMXMMMM
MXMXAXMASX        
    """.trimIndent().split("\n")

    "With part one" should {
        "line of length 4 to right of (5,4) is (5,4), (5,5), (5,6), (5,7)" {
            Position(5,4).lineR(4) shouldBe listOf(
                Position(5,4),
                Position(5,5),
                Position(5,6),
                Position(5,7),
            )
        }
        "words at position(9,9_ in sample are [XMAS,XMAS]" {
            sampleData.wordsAt(Position(9,9)) shouldBe listOf("XMAS","XMAS")
        }
        "part one using sample data should be 18" {
            partOne(sampleData) shouldBe 18
        }
        "answer to part one is 2543" {
            partOne(puzzleInput) shouldBe 2543
        }
    }
    "With part two" should {
        "mas lines at position (1,1) are " {
            Position(1,1).crossedLines(3) shouldBe listOf(
                listOf(Position(row=1, col=1), Position(row=2, col=2), Position(row=3, col=3), Position(row=3, col=1), Position(row=2, col=2), Position(row=1, col=3)),
                listOf(Position(row=1, col=1), Position(row=2, col=2), Position(row=3, col=3), Position(row=1, col=3), Position(row=2, col=2), Position(row=3, col=1)),
                listOf(Position(row=3, col=3), Position(row=2, col=2), Position(row=1, col=1), Position(row=3, col=1), Position(row=2, col=2), Position(row=1, col=3)),
                listOf(Position(row=3, col=3), Position(row=2, col=2), Position(row=1, col=1), Position(row=1, col=3), Position(row=2, col=2), Position(row=3, col=1)),
                )
        }
        "words at position(1,5) are (MASMAS)" {
            sampleData.crossedWordsAt(Position(1,5)) shouldBe listOf("MASMAS")
        }
        "part two using sample data should be 9" {
            partTwo(sampleData) shouldBe 9
        }
        "answer to part two is 1930 " {
            partTwo(puzzleInput) shouldBe 1930
        }
    }
})