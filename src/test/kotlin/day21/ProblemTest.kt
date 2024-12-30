package day21

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import lib.Position

class ProblemTest:WordSpec ({
    val sampleData = """
        029A
        980A
        179A
        456A
        379A
    """.trimIndent().split("\n")

    "With part one" should {
        "starting at position A on the numeric keypad direction to 7 is 3 up, two left " {
            Position(3,2).routeToTarget('7', numericKeypad) shouldBe "^^^<<A"
        }
        "way to type 379A is " {
            Position(3,2).routeToTarget("379A", numericKeypad) shouldBe "^A^^<<A>>AvvvA"
        }
        "way to type 029A is " {
            Position(3,2).routeToTarget("029A", numericKeypad) shouldBe "<A^A^^>AvvvA"
        }
        "way to type 029A via a numeric keypad and two robots is length 68 " {
            val numericSequence = Position(3,2).routeToTarget("029A", numericKeypad)
            val robot1Sequence = directionalKeypad.getValue('A').routeToTarget(numericSequence, directionalKeypad)
            val robot2Sequence = directionalKeypad.getValue('A').routeToTarget(robot1Sequence, directionalKeypad)
            robot2Sequence.length shouldBe 68
        }
        "way to type 980A via a numeric keypad and two robots is length 60" {
            val numericSequence = numericKeypad.getValue('A').routeToTarget("980A", numericKeypad)
            val robot1Sequence = directionalKeypad.getValue('A').routeToTarget(numericSequence, directionalKeypad)
            val robot2Sequence = directionalKeypad.getValue('A').routeToTarget(robot1Sequence, directionalKeypad)
            robot2Sequence.length shouldBe 60
        }
        "way to type 379A via a numeric keypad and two robots is length 64" {
            val numericSequence = numericKeypad.getValue('A').routeToTarget("379A", numericKeypad)
            val robot1Sequence = directionalKeypad.getValue('A').routeToTarget(numericSequence, directionalKeypad)
            val robot2Sequence = directionalKeypad.getValue('A').routeToTarget(robot1Sequence, directionalKeypad)
            robot2Sequence.length shouldBe 64
        }
        "answer for part one using sample data is 126384" {
            partOne(sampleData) shouldBe 126384
        }
        "answer for part one is 126384" {
            partOne(puzzleInput) shouldBe 126384
        }

    }
    "With part two" should {
        "return 0" {
            partTwo(sampleData) shouldBe 0
        }
    }
})