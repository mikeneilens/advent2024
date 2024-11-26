package day20

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ProblemTest:WordSpec ({
    val sampleData = """
        
    """.trimIndent().split("\n")

    "With part one" should {
        "return 0" {
            partOne(sampleData) shouldBe 0
        }
    }
    "With part two" should {
        "return 0" {
            partTwo(sampleData) shouldBe 0
        }
    }
})