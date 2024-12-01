package day01

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ProblemTest:WordSpec ({
    val sampleData = """
        3   4
        4   3
        2   5
        1   3
        3   9
        3   3
    """.trimIndent().split("\n")

    "With part one" should {
        "parse input into two lists" {
            parse(sampleData) shouldBe Pair(
                listOf(1,2,3,3,3,4), listOf(3,3,3,4,5,9)
            )
        }
        "matching sample data should give [2,1,0,1,2,5]" {
            parse(sampleData).matchData() shouldBe listOf(2,1,0,1,2,5)
        }
        "with part one test data the answer should be 11" {
            partOne(sampleData) shouldBe 11
        }
        "answer to part one is 1834060" {
            partOne(puzzleInput) shouldBe 1834060
        }
    }
    "With part two" should {
        "4 appears in second list 1 times" {
            val (_, list2) = parse(sampleData)
            4.occurrencesIn(list2) shouldBe 1
        }
        "similarity score of each number in list 1 in list 2 is [3,1,0,0,3,3]" {
            val (list1, list2) = parse(sampleData)
            createSimilarityScore(list1, list2) shouldBe listOf(0, 0, 9, 9, 9, 4)
        }
        "with part two test data the answer is 31" {
            partTwo(sampleData) shouldBe 31
        }
        "answer to part two is " {
            partTwo(puzzleInput) shouldBe 21607792
        }
    }
})