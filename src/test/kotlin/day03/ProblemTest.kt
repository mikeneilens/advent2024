package day03

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import java.io.File

class ProblemTest:WordSpec ({
    val sampleData = """
        xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))
    """.trimIndent()

    "With part one" should {
        "2,4)%& as number string is 2,4"{
            listOf("2,4)%&").toNumberStrings() shouldBe listOf("2,4")
        }
        "2,4!%& as number string is 2,4!%&"{
            listOf("2,4!%&").toNumberStrings() shouldBe listOf("2,4!%&")
        }
        "2,4 as digits is (2,4)" {
            "2,4".toDigits() shouldBe Pair(2,4)
        }
        "2,4!%& as digits is (2,0)" {
            "2,4!%&".toDigits() shouldBe Pair(2,0)
        }
        "gds,4!%& as digits is (2,0)" {
            "gds,4!%&".toDigits() shouldBe Pair(0,0)
        }
        "'abc' as digits is (0,0)" {
            "abc".toDigits() shouldBe Pair(0,0)
        }
        "sample data as pairs of digits is" {
            sampleData.split("mul(").toNumberStrings().map{it.toDigits()} shouldBe listOf(
                Pair(0, 0), Pair(2, 4), Pair(5, 5), Pair(32, 0), Pair(11, 8), Pair(8, 5)
            )
        }
        "part one with sample data is 161" {
            partOne(sampleData) shouldBe 161
        }
        "part one answer is 189600467" {
            partOne(puzzleInput) shouldBe 189600467
        }
    }
    "With part two" should {
        "filter out data which is after do() and before don't()" {
            "xmul(2,4)&mul[3,7]!^don't()_mul(5,5)+mul(32,64](mul(11,8)undo()?mul(8,5))".removeDont() shouldBe
                    "xmul(2,4)&mul[3,7]!^?mul(8,5))"
        }
        "part two with sample data" {
            partTwo("xmul(2,4)&mul[3,7]!^don't()_mul(5,5)+mul(32,64](mul(11,8)undo()?mul(8,5))") shouldBe 48
        }
        "part two answer is 107069718" {
            partTwo(puzzleInput) shouldBe 107069718
        }
    }
})