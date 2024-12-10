package day10

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import lib.Position

class ProblemTest:WordSpec ({
    val sampleData = """
        89010123
        78121874
        87430965
        96549874
        45678903
        32019012
        01329801
        10456732
    """.trimIndent().split("\n")

    "With part one" should {
        "trail heads in sample data are" {
            sampleData.trailHeads() shouldBe listOf(
                Position(row=0, col=2),
                Position(row=0, col=4),
                Position(row=2, col=4),
                Position(row=4, col=6),
                Position(row=5, col=2),
                Position(row=5, col=5),
                Position(row=6, col=0),
                Position(row=6, col=6),
                Position(row=7, col=1)
            )
        }
        "there are 5 trails from Position(0,2)" {
            sampleData.paths(Position(0, 2)).distinct().size shouldBe 5
        }
        "part one with sample data gives" {
            partOne(sampleData) shouldBe 36
        }
        "answer to part one is 531" {
            partOne(puzzleInput) shouldBe 531
        }
    }
    "With part two" should {
        "part two with sample data gives 81" {
            partTwo(sampleData) shouldBe 81
        }
        "answer to part two is 1210" {
            partTwo(puzzleInput) shouldBe 1210
        }

    }
})