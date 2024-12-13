package day12

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import lib.Position
import lib.charAt

class ProblemTest:WordSpec ({
    val sampleData = """
        RRRRIICCFF
        RRRRIICCCF
        VVRRRCCFFF
        VVRCCCJFFF
        VVVVCJJCFE
        VVIVCCJJEE
        VVIIICJJEE
        MIIIIIJJEE
        MIIISIJEEE
        MMMISSJEEE
    """.trimIndent().split("\n")

    "With part one" should {
        "plot at (0,0) contains 12 positions " {
            val plot = sampleData.getPlot("R",setOf(Position(0,0)), mutableSetOf())
            plot.size shouldBe 12
            plot shouldBe setOf(
                Position(0,0),Position(0,1),Position(0,2),Position(0,3),
                Position(1,0),Position(1,1),Position(1,2),Position(1,3),
                Position(2,2),Position(2,3),Position(2,4),
                Position(3,2)
            )
        }
        "plot at (0,0) has a boundary size of 18" {
            val plot = sampleData.getPlot("R",setOf(Position(0,0)), mutableSetOf())
            sampleData.plotBoundarySize(plot) shouldBe 18
        }
        "plots and boundaries for sample data" {
            sampleData.getPlotsAndBoundaries() shouldBe listOf(
                Pair(12, 18), Pair(4, 8), Pair(14, 28), Pair(10, 18), Pair(13, 20), Pair(11, 20), Pair(1, 4), Pair(13, 18), Pair(14, 22), Pair(5, 12), Pair(3, 8)
            )
        }
        "part one using sample data is 1930" {
            partOne(sampleData) shouldBe 1930
        }
        "answer to part one is 1483212 " {
            partOne(puzzleInput) shouldBe 1483212
        }
    }
    "With part two" should {
        "first plot in sample data has 10 sides" {
            val plot = sampleData.getPlot("R",setOf(Position(0,0)), mutableSetOf())
            plotSides(plot) shouldBe 10
        }
        "3rd plot in sample data has 22 sides" {
            val plot = sampleData.getPlot("C",setOf(Position(0,6)), mutableSetOf())
            plotSides(plot) shouldBe 22
        }
        "part two using sample data is 1206" {
            partTwo(sampleData) shouldBe 1206
        }
        "answer to part two is 897062" {
            partTwo(puzzleInput) shouldBe 897062
        }
    }
})