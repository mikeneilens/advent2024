package day11
import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ProblemTest:WordSpec ({
    val sampleData = """
        0 1 10 99 999
    """.trimIndent()

    "With part one" should {

        "sample data blinking once becomes 1 2024 1 0 9 9 2021976" {
            val stones=sampleData.parseIntoMap()
            val newMap = blink(stones)
            newMap shouldBe mapOf(0L to 1, 1L to 2, 9L to 2, 2024L to 1, 2021976L to 1 )
        }
        "splitting 2024 gives (20,24)" {
            2024L.split() shouldBe listOf(20,24)
        }
        "for part one and 125 17 the answer is 55312" {
            partOne("125 17") shouldBe 55312
        }
        "answer for part one is 186996" {
            partOne(puzzleInput) shouldBe 186996
        }
    }
    "With part two" should {

        "answer for part two is 221683913164898" {
            partTwo(puzzleInput) shouldBe 221683913164898L
        }
    }
})