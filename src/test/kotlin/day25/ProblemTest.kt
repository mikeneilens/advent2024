package day25

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ProblemTest:WordSpec ({
    val sampleData = """
        #####
        .####
        .####
        .####
        .#.#.
        .#...
        .....

        #####
        ##.##
        .#.##
        ...##
        ...#.
        ...#.
        .....

        .....
        #....
        #....
        #...#
        #.#.#
        #.###
        #####

        .....
        .....
        #.#..
        ###..
        ###.#
        ###.#
        #####

        .....
        .....
        .....
        #....
        #.#..
        #.#.#
        #####
    """.trimIndent().split("\n\n").map{it.split("\n")}

    "With part one" should {
        "first schematic is lock with [0,5,3,4,3]" {
            sampleData.first().parse() shouldBe Lock(listOf(0,5,3,4,3))
        }
        "third schematic is key with [0,5,3,4,3]" {
            sampleData[2].parse() shouldBe Key(listOf(5,0,2,1,3))
        }
        "part one with sample data is 3" {
            partOne(sampleData) shouldBe 3
        }
        "answer for part one is" {
            partOne(puzzleInput) shouldBe 2835
        }
    }
})