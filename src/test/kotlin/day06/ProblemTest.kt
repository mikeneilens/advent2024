package day06

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import lib.Direction
import lib.Position

class ProblemTest:WordSpec ({
    val sampleData = """
....#.....
.........#
..........
..#.......
.......#..
..........
.#..^.....
........#.
#.........
......#...        
    """.trimIndent().split("\n")

    "With part one" should {
        "start position in sample data is " {
            sampleData.startPostion() shouldBe Position(6, 4)
        }
        "part one with sample data is 41" {
            partOne(sampleData) shouldBe 41
        }
        "answer to part one is 5145 " {
            partOne(puzzleInput) shouldBe 5145
        }
    }
    "With part two" should {
        "moving on sample data with no obstructions should not be a move in a loop" {
            val startPosition = sampleData.startPostion()
            sampleData.moveIsLoop(startPosition, Direction.up, Position(-2,-2)) shouldBe false
        }
        "moving on sample data with obstruction at (6,3) should a move in a loop" {
            val startPosition = sampleData.startPostion()
            sampleData.moveIsLoop(startPosition, Direction.up, Position(6,3)) shouldBe true
        }
        "moving on sample data with obstruction at (7,6) should a move in a loop" {
            val startPosition = sampleData.startPostion()
            sampleData.moveIsLoop(startPosition, Direction.up, Position(7,6)) shouldBe true
        }
        "part two with sample data is 6" {
            partTwo(sampleData) shouldBe 6
        }
        "answer to part two is 1523" {
            partTwo(puzzleInput) shouldBe 1523        }
    }
})

fun List<String>.startPostion():Position
    = indexOfFirst { it.contains("^") }.let{row ->
        Position(row, get(row).indexOfFirst{it == '^'})
    }
