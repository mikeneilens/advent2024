package day02

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ProblemTest:WordSpec ({
    val sampleData = """
        7 6 4 2 1
        1 2 7 8 9
        9 7 6 2 1
        1 3 2 4 5
        8 6 4 4 1
        1 3 6 7 9
    """.trimIndent().split("\n")

    "With part one" should {
        "parse sample data correctly" {
            sampleData.parse() shouldBe listOf(
                listOf(7,6,4,2,1),
                listOf(1,2,7,8,9),
                listOf(9,7,6,2,1),
                listOf(1,3,2,4,5),
                listOf(8,6,4,4,1),
                listOf(1,3,6,7,9)
            )
        }
        "diffs for [7,6,4,2,1] should be [1,2,2,1]" {
            listOf(7,6,4,2,1).diffs() shouldBe listOf(1,2,2,1)
        }
        "[1,2,2,1] is valid" {
            listOf(1,2,2,1).areValid() shouldBe true
        }
        "[-1,-2,-3,-1] is valid" {
            listOf(-1,-2,-3,-1).areValid() shouldBe true
        }
        "[-1,-2,-4,-1] is not valid" {
            listOf(-1,-2,-4,-1).areValid() shouldBe false
        }
        "with sample data 2 reports are valid" {
            partOne(sampleData) shouldBe 2
        }
        "the answer for part one is 663" {
            partOne(puzzleInput) shouldBe 663
        }
    }
    "With part two" should {
        "return 0" {
            partTwo(sampleData) shouldBe 0
        }
    }
})