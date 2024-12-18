package day18

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.shouldBe
import lib.Chart
import lib.Position

class ProblemTest:WordSpec ({
    val sampleData = """
        5,4
        4,2
        4,5
        3,0
        2,1
        6,3
        2,4
        1,5
        0,6
        3,3
        2,6
        5,1
        1,2
        5,5
        2,5
        6,5
        1,4
        0,4
        6,4
        1,1
        6,1
        1,0
        0,5
        1,6
        2,0
    """.trimIndent().split("\n")

    "With part one" should {
        "with sample data as bytes" {
            val bytes = sampleData.take(12).toBytes(6,6)
            bytes shouldContain Position(4,5)
            bytes shouldContain Position(2,4)
            bytes shouldContain Position(5,4)
            bytes shouldContain Position(0,3)
        }

        "part one with sample data should be 22" {
            partOne(sampleData, qty = 12) shouldBe 22
        }
        "answer to part one with puzzle input is 310" {
            partOne(puzzleInput, 70,70, qty = 1024) shouldBe 310
        }
    }
    "With part two" should {
        "first byte to block the exit with sample data is (1,6)" {
            partTwo(sampleData, qty = 12) shouldBe "6,1"
        }
        "return 0" {
            partTwo(puzzleInput,70,70,1024) shouldBe "16,46"
        }
    }
})