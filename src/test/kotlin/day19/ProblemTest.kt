package day19

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ProblemTest:WordSpec ({
    val sampleDataPatterns = "r, wr, b, g, bwu, rb, gb, br"
    val sampleDataDesigns = """
        brwrr
        bggr
        gbbr
        rrbgbr
        ubwu
        bwurrg
        brgr
        bbrgwb
    """.trimIndent().split("\n")

    "With part one" should {
        "part one using sample data is 6" {
            partOne(sampleDataPatterns, sampleDataDesigns) shouldBe 6
        }
        "answer to part one is 327" {
            partOne(puzzleInputPatterns, puzzleInputDesigns) shouldBe 327
        }
    }
    "With part two" should {
        "part two using sample data is 16" {
            partTwo(sampleDataPatterns, sampleDataDesigns) shouldBe 16
        }
        "answer to part two is" {
            partTwo(puzzleInputPatterns, puzzleInputDesigns) shouldBe 0
        }
    }
})