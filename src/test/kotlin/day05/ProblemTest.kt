package day05

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ProblemTest:WordSpec ({
    val sampleRulesData = """
        47|53
        97|13
        97|61
        97|47
        75|29
        61|13
        75|53
        29|13
        97|29
        53|29
        61|53
        97|53
        61|29
        47|13
        75|47
        97|75
        47|61
        75|61
        47|29
        75|13
        53|13
    """.trimIndent().split("\n")
    val sampleUpdatesData = """
        75,47,61,53,29
        97,61,53,29,13
        75,29,13
        75,97,47,61,53
        61,13,29
        97,13,75,29,47
    """.trimIndent().split("\n")

    "With part one" should {
        "parse rules into two maps" {
            val mustBeBefore = parseToBeforeMap(sampleRulesData)
            mustBeBefore["47"] shouldBe setOf("53", "13", "61", "29")
        }
        "part one with sample data is 143 " {
            partOne(sampleUpdatesData, sampleRulesData) shouldBe 143
        }
        "answer to part one is 4905" {
            partOne(puzzleInput, puzzleRule) shouldBe 4905
        }
    }
    "With part two" should {
        "75,97,47,61,53 can be fixed to become 97,75,47,61,53" {
            val mustBeBefore = parseToBeforeMap(sampleRulesData)
            listOf("75","97","47","61","53").correctOrder(mustBeBefore) shouldBe listOf("97","75","47","61","53")
        }
        "61,13,29 can be fixed to become 61,29,13" {
            val mustBeBefore = parseToBeforeMap(sampleRulesData)
            listOf("61","13","29").correctOrder(mustBeBefore) shouldBe listOf("61","29","13")
        }
        "97,13,75,29,47 can be fixed to become 97,75,47,29,13" {
            val mustBeBefore = parseToBeforeMap(sampleRulesData)
            listOf("97","13","75","29","47").correctOrder(mustBeBefore) shouldBe listOf("97","75","47","29","13")
        }
        "part two with sample data is 123" {
            partTwo(sampleUpdatesData, sampleRulesData) shouldBe 123
        }
        "answer to part two is " {
            partTwo(puzzleInput, puzzleRule) shouldBe 6204
        }
    }
})
