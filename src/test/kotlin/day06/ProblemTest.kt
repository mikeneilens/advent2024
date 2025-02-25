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
