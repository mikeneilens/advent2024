package day13

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ProblemTest:WordSpec ({
    val sampleData = """
        Button A: X+94, Y+34
        Button B: X+22, Y+67
        Prize: X=8400, Y=5400
        
        Button A: X+26, Y+66
        Button B: X+67, Y+21
        Prize: X=12748, Y=12176
        
        Button A: X+17, Y+86
        Button B: X+84, Y+37
        Prize: X=7870, Y=6450
        
        Button A: X+69, Y+23
        Button B: X+27, Y+71
        Prize: X=18641, Y=10279
    """.trimIndent().split("\n").chunked(4)

    "With part one" should {
        "parse sampleData " {
            sampleData.parse() shouldBe listOf(
                Game(buttonAX=94, buttonAY=34, buttonBX=22, buttonBY=67, prizeX=8400, prizeY=5400),
                Game(buttonAX=26, buttonAY=66, buttonBX=67, buttonBY=21, prizeX=12748, prizeY=12176),
                Game(buttonAX=17, buttonAY=86, buttonBX=84, buttonBY=37, prizeX=7870, prizeY=6450),
                Game(buttonAX=69, buttonAY=23, buttonBX=27, buttonBY=71, prizeX=18641, prizeY=10279)
            )
        }
        "with first game, pushing the a button 80 times gives an answer of 280" {
            sampleData.parse().first().costOfPresses(80) shouldBe 280
        }
        "min cost of all games in sample data" {
            sampleData.parse().minCostOfPresses() shouldBe listOf(listOf(280),listOf(200))
        }
        "answer to part one using sample data is 480" {
            partOne(sampleData) shouldBe 480
        }
        "answer to part one is 39478 "{
            partOne(puzzleInput) shouldBe 39748
        }
    }
    "With part two" should {
        "when b presses is 40 a presses is 80" {
            sampleData.parse()[0].bPresses(80) shouldBe 40
            sampleData.parse()[0].aPresses(40) shouldBe 80
        }
        "valid apresses for first game in sample data is 80" {
            sampleData.parse()[2].bPresses() shouldBe 40
        }
        "sample data using new approach" {
            sampleData.parse().mapNotNull{
                val aPresses = it.aPresses()
                if (aPresses != null) Pair(aPresses, it.bPresses(aPresses)) else null
            }.sumOf{it.first * 3 + it.second } shouldBe 480
        }
        "return 0" {
            //35916772964551 is too low
            //72253417026448 is too low
            partTwo(puzzleInput) shouldBe 0
        }
    }
})