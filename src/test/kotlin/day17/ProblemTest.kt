package day17

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ProblemTest:WordSpec ({
    val sampleData = """
        
    """.trimIndent().split("\n")

    "With part one" should {
        "If register C contains 9, the program 2,6 would set register B to 1." {
            Status.instructions = listOf(2,6)
            val status = Status(a = 0, b = 0, c = 9, ip = 0, output = "")
            val newStatus = status.process()
            newStatus.b shouldBe 1
        }
        "If register A contains 10, the program 5,0,5,1,5,4 would output 0,1,2" {
            Status.instructions = listOf(5,0,5,1,5,4)
            val initialStatus = Status(a = 10, b = 0, c = 0 , ip = 0, output = "")
            val status1 = initialStatus.process()
            val status2 = status1.process()
            val status3 = status2.process()
            status3.output shouldBe "0,1,2"
        }
        "If register A contains 2024, the program 0,1,5,4,3,0 would output 4,2,5,6,7,7,7,7,3,1,0 and leave 0 in register A." {

            val initialStatus = Status(a = 2024, b = 0, c = 0 , ip = 0, output = "")
            val finalStatus = partOne(initialStatus, listOf(0,1,5,4,3,0))
            finalStatus.output shouldBe "4,2,5,6,7,7,7,7,3,1,0"
            finalStatus.a shouldBe 0
        }
        "If register B contains 29, the program 1,7 would set register B to 26." {
            val initialStatus = Status(a = 0, b = 29, c = 0 , ip = 0, output = "")
            val finalStatus = partOne(initialStatus, listOf(1,7))
            finalStatus.b shouldBe 26
        }
        "If register B contains 2024 and register C contains 43690, the program 4,0 would set register B to 44354." {
            val initialStatus = Status(a = 0, b = 2024, c = 43690 , ip = 0, output = "")
            val finalStatus = partOne(initialStatus, listOf(4,0))
            finalStatus.b shouldBe 44354
        }
        "If register A contains 729, the program 0,1,5,4,3,0 would output 4,6,3,5,6,3,5,2,1,0" {
            val initialStatus = Status(a = 729, b = 0, c = 0 , ip = 0, output = "")
            val finalStatus = partOne(initialStatus, listOf(0,1,5,4,3,0))
            finalStatus.output shouldBe "4,6,3,5,6,3,5,2,1,0"
        }

        "answer for part one is 4,1,7,6,4,1,0,2,7" {
            val initialStatus = Status(a = 64854237, b = 0, c = 0 , ip = 0, output = "")
            val finalStatus = partOne(initialStatus, listOf(2,4,1,1,7,5,1,5,4,0,5,5,0,3,3,0))
            finalStatus.output shouldBe "4,1,7,6,4,1,0,2,7"
        }
    }
    "With part two" should {
        "return 0" {
            partTwo(sampleData) shouldBe 0
        }
    }
})