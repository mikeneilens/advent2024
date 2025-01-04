package day22

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.shouldBe

class ProblemTest:WordSpec ({
    val sampleData = """
1
10
100
2024
    """.trimIndent().split("\n")

    "With part one" should {
        "mixing value of 15 into secret number 42 gives 37" {
            mix(value = 15L, secretNumber = 42L) shouldBe 37L
        }
        "pruning secret number of 100000000 gives 16113920" {
            prune(secretNumber = 100000000L) shouldBe 16113920L
        }
        "evolving 123 once gives 15887950" {
            evolve(123L) shouldBe 15887950L
        }
        "processing 1 2000 times gives 8685429" {
            1L.process() shouldBe 8685429
        }
        "part one using sample data is 37327623" {
            partOne(sampleData) shouldBe 37327623L
        }
        "answer to part one is 18941802053L " {
            partOne(puzzleInput) shouldBe 18941802053L
        }
    }
    "With part two" should {
        val sampleData = """
            1
            2
            3
            2024
        """.trimIndent().split("\n")
        "prices for 123 after 10 cycles" {
            123L.pricesAndChanges(10) shouldBe listOf(
                Pair(0L, -3L), Pair(6L, 6L), Pair(5L, -1L), Pair(4L, -1L),
                Pair(4L, 0L), Pair(6L, 2L), Pair(4L, -2L), Pair(4L, 0L), Pair(2L, -2L), Pair(4L, 2L)
            )
        }
        " [Pair(0L, -3L), Pair(6L, 6L), Pair(5L, -1L), Pair(4L, -1L)] has sequence of [-3, 6, 1 , 1]" {
            listOf(Pair(0L, -3L), Pair(6L, 6L), Pair(5L, -1L), Pair(4L, -1L)).changeSequence() shouldBe listOf(-3L, 6L, - 1L, -1L)
        }
        "unique sequnces for sample data includes [-2,1,-1,3]" {
            val numbers = sampleData.map{it.toLong()}
            val maps = numbers.map{ it.pricesAndChanges().windowed(4, 1).createMapOfChangeSequences()}
            maps.flatMap{it.keys}.toSet() shouldContain listOf(-2,1,-1,3)
            maps[0][listOf(-2,1,-1,3)]?.last()?.first shouldBe 7
            maps[1][listOf(-2,1,-1,3)]?.last()?.first shouldBe 7
            maps[2][listOf(-2,1,-1,3)]?.last()?.first shouldBe null
            maps[3][listOf(-2,1,-1,3)]?.last()?.first shouldBe 9
        }
        "part two with sample data is 23L" {
            partTwo(sampleData) shouldBe 23L
        }
        "part two with puzzle input is 2218L" {
            partTwo(puzzleInput) shouldBe 2218L
        }
     }
})