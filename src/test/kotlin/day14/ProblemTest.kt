package day14

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import lib.Position
import lib.Velocity

class ProblemTest:WordSpec ({
    val sampleData = """
p=0,4 v=3,-3
p=6,3 v=-1,-3
p=10,3 v=-1,2
p=2,0 v=2,-1
p=0,0 v=1,3
p=3,0 v=-2,-2
p=7,6 v=-1,-3
p=3,0 v=-1,-2
p=9,3 v=2,3
p=7,3 v=-1,2
p=2,4 v=2,-3
p=9,5 v=-3,-3        
    """.trimIndent().split("\n")

    "With part one" should {
        "parse p=54,45 v=-37,75 into Robot " {
            "p=54,45 v=-37,75".parse() shouldBe Robot(Position(row = 45, col = 54), Velocity(row = 75, col = -37))
        }
        "p=2,4 v=2,-3 in 11 wide and 7 tall room after 1 moves is at position(1,4)" {
            "p=2,4 v=2,-3".parse().positionAfterMove(1,11,7) shouldBe Position(row = 1, col =4)
        }
        "p=2,4 v=2,-3 in 11 wide and 7 tall room after 2 moves is at position(5,6)" {
            "p=2,4 v=2,-3".parse().positionAfterMove(2,11,7) shouldBe Position(row = 5, col =6)
        }
        "p=2,4 v=2,-3 in 11 wide and 7 tall room after 5 moves is at position(4,1)" {
            "p=2,4 v=2,-3".parse().positionAfterMove(5,11,7) shouldBe Position(row = 3, col =1)
        }
        "p=0,4, v=0,-3 in 11 wide and 7 tall room after 2 moves is at position()" {
            "p=0,4 v=0,-3".parse().positionAfterMove(2,77,7) shouldBe Position(5,0)
        }
        "positions with sample data after 100 moves" {
            sampleData.parse().map{it.positionAfterMove(100,11,7)}.sortedBy { it.row * 100 + it.col } shouldBe listOf(
                Position(row=0, col=6),
                Position(row=0, col=6),
                Position(row=0, col=9),
                Position(row=2, col=0),
                Position(row=3, col=1),
                Position(row=3, col=2),
                Position(row=4, col=5),
                Position(row=5, col=3),
                Position(row=5, col=4),
                Position(row=5, col=4),
                Position(row=6, col=1),
                Position(row=6, col=6),
            )
        }
        "quadrants for cols 11 by 7 rows is 0..2 X 0..4, 0..2, 0.. 6..10, 4..6 X 0..4, 4..6 X 6..10 " {
            quadrants(11, 7) shouldBe setOf(
                Pair(0..2, 0..4), Pair(4..6, 0..4), Pair(0..2, 6..10),Pair(4..6, 6..10)
            )
        }
        "part one with sample data and width 11 and height 7 is 12" {
            partOne(sampleData, 11,7 ) shouldBe 12
        }
        "answer to part one is" {
            partOne(puzzleInput, 101, 103) shouldBe 214109808
        }
    }
    "With part two" should {
        "return 0" {
            partTwo(sampleData) shouldBe 0
        }
    }
})