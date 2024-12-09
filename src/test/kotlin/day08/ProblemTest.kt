package day08

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.shouldBe
import lib.Position
import lib.PositionD

class ProblemTest:WordSpec ({
    val sampleData = """
        ............
        ........0...
        .....0......
        .......0....
        ....0.......
        ......A.....
        ............
        ............
        ........A...
        .........A..
        ............
        ............
    """.trimIndent().split("\n")

    "With part one" should {
        "antinodes for antennas (3,4) and (5,5) are (1,3) and (7,6)" {
            createAntiNodes(Position(3,4), Position(5,5)) shouldBe setOf(Position(1,3), Position(7,6))
        }
        "combinations for (3,4), (5,5) and (7,2) are ((3,4),(5,5)),((3,4),(7,2)),((5,5),(7,2))" {
            setOf(Position(3,4), Position(5,5), Position(7,2)).combinations() shouldBe setOf(
                setOf(Position(3,4), Position(5,5)),
                setOf(Position(3,4), Position(7,2)),
                setOf(Position(5,5), Position(7,2))
            )
        }
        "sample data parses into a map of antennas" {
            parse(sampleData) shouldBe mapOf(
                "0" to setOf(Position(row=1, col=8), Position(row=2, col=5), Position(row=3, col=7), Position(row=4, col=4)),
                "A" to setOf(Position(row=5, col=6), Position(row=8, col=8), Position(row=9, col=9))
            )
        }
        "create antinodes for all antennas on the sample data" {
            val antinodes = parse(sampleData).flatMap{ (key, antennas) -> antennas.combinations()}.toSet()
                .createAntiNodes(0..11,0..11).flatten()
                .filter{it.row in sampleData.indices && it.col in sampleData.first().indices}.toSet()
            antinodes.size shouldBe 14
            antinodes shouldContain Position(0,6)
            antinodes shouldContain Position(0,11)
            antinodes shouldContain Position(1,3)
            antinodes shouldContain Position(2,4)
            antinodes shouldContain Position(2,10)
            antinodes shouldContain Position(4,9)
            antinodes shouldContain Position(5,1)
            antinodes shouldContain Position(6,3)
            antinodes shouldContain Position(7,0)
            antinodes shouldContain Position(7,7)
            antinodes shouldContain Position(10,10)
            antinodes shouldContain Position(11,10)
        }
        "part one using sample data is 14" {
            partOne(sampleData) shouldBe 14
        }
        "answer to part one is 293" {
            partOne(puzzleInput) shouldBe 293
        }
    }
    "With part two" should {
        " positions on line" {
            positionsOnLine(  Position(2,4),Position(3,6), 12,12).toSet() shouldBe setOf(
                Position(row=0, col=0),
                Position(row=1, col=2),
                Position(row=2, col=4),
                Position(row=3, col=6),
                Position(row=4, col=8),
                Position(row=5, col=10),
                Position(row=6, col=12))
        }
        "part two using sample data is 34" {
            partTwo(sampleData) shouldBe 34
        }
        "answer to part two is 934" {
            partTwo(puzzleInput) shouldBe 934
        }
    }
})