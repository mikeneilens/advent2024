package day07

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ProblemTest:WordSpec ({
    val sampleData = """
        190: 10 19
        3267: 81 40 27
        83: 17 5
        156: 15 6
        7290: 6 8 6 15
        161011: 16 10 13
        192: 17 8 14
        21037: 9 7 18 13
        292: 11 6 16 20
    """.trimIndent().split("\n")

    "With part one" should {
        "190: 10 19 parses to Pair(190, [10,19])" {
            "190: 10 19".parseInput() shouldBe Pair(190L, listOf(10L, 19L))
        }
        "combinations of size 1 should be [['+'],['*']]" {
            buildCombinations(1, listOf('+','*')) shouldBe listOf(listOf('+'), listOf('*'))
        }
        "combinations of size 2 should be [['+', '+'], ['*', '+'], ['+', '*'], ['*', '*']]" {
            buildCombinations(2, listOf('+','*')) shouldBe listOf(
                listOf('+','+'),
                listOf('*','+'),
                listOf('+','*'),
                listOf('*','*'))
        }
        "create evaluators up to a size of 2 " {
            val evaluators = createEvaluators(2)
            evaluators.getValue(1).size shouldBe 2
            evaluators.getValue(1).first()[0](3L,4L) shouldBe 7L
            evaluators.getValue(1)[1][0](3L,4L) shouldBe 12L
            evaluators.getValue(2).size shouldBe 4
        }
        "evaluating 10,19 gives answer of 190 and 29" {
            val evaluators = createEvaluators(1)
            listOf(10L,19L).evaluate(evaluators) shouldBe listOf(29L, 190L)
        }
        "answer using sample data is 3749" {
            partOne(sampleData) shouldBe 3749L
        }
        "answer to part one is 5540634308362" {
            partOne(puzzleInput) shouldBe 5540634308362L
        }
    }
    "With part two" should {
        "answer using sample data is 11387" {
            partTwo(sampleData) shouldBe 11387
        }
        "answer to part two is 472290821152397" {
            partTwo(puzzleInput) shouldBe 472290821152397L
        }
    }
})