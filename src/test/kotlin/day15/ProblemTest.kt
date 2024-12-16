package day15

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe
import lib.Direction
import lib.Position

class ProblemTest:WordSpec ({
    val sampleDataMap = """
        ##########
        #..O..O.O#
        #......O.#
        #.OO..O.O#
        #..O@..O.#
        #O#..O...#
        #O..O..O.#
        #.OO.O.OO#
        #....O...#
        ##########
    """.trimIndent().split("\n")

    val sampleDataMoves = """
        <vv>^<v^>v>^vv^v>v<>v^v<v<^vv<<<^><<><>>v<vvv<>^v^>^<<<><<v<<<v^vv^v>^
        vvv<<^>^v^^><<>>><>^<<><^vv^^<>vvv<>><^^v>^>vv<>v<<<<v<^v>^<^^>>>^<v<v
        ><>vv>v^v^<>><>>>><^^>vv>v<^^^>>v^v^<^^>v^^>v^<^v>v<>>v^v^<v>v^^<^^vv<
        <<v<^>>^^^^>>>v^<>vvv^><v<<<>^^^vv^<vvv>^>v<^^^^v<>^>vvvv><>>v^<<^^^^^
        ^><^><>>><>^^<<^^v>>><^<v>^<vv>>v>>>^v><>^v><<<<v>>v<v<v>vvv>^<><<>^><
        ^>><>^v<><^vvv<^^<><v<<<<<><^v<<<><<<^^<v<^^^><^>>^<v^><<<^>>^v<v^v<v^
        >^>>^v>vv>^<<^v<>><<><<v<<v><>v<^vv<<<>^^v^>^^>>><<^v>>v^v><^^>>^<>vv^
        <><^^>^^^<><vvvvv^v<v<<>^v<v>v<<^><<><<><<<^^<<<^<<>><<><^^^>^^<>^>v<>
        ^^>vv<^v^v<vv>^<><v<^v>^^^>>>^^vvv^>vvv<>>>^<^>>>>>^<<^v>^vvv<>^<><<v>
        v^^>>><<^^<>>^v^<v^vv<>v^<<>^<^v^v><^<<<><<^<v><v<>vv>>v><v^<vv<>v^<<^
    """.trimIndent()

    "With part one" should {
        "parse mapData into a map" {
            val warehouseMap = sampleDataMap.parse()
            warehouseMap.size shouldBe 100
            warehouseMap[Position(1,3)] shouldBe 'O'
            warehouseMap[Position(4,4)] shouldBe '@'
        }
        "parse moves data into list" {
            val moves = sampleDataMoves.parse()
            moves.size shouldBe 700
            moves[0] shouldBe Direction.left
            moves[1] shouldBe Direction.down
            moves[3] shouldBe Direction.right
            moves[4] shouldBe Direction.up
        }
        "moving item at [4,4] right" {
            val warehouseMap = sampleDataMap.parse()
            warehouseMap.move(Position(4,4), Direction.right)
            warehouseMap[Position(4,4)] shouldBe '.'
            warehouseMap[Position(4,5)] shouldBe '@'
        }
        "moving item at [4,4] left" {
            val warehouseMap = sampleDataMap.parse()
            warehouseMap.move(Position(4,4), Direction.left)
            warehouseMap[Position(4,1)] shouldBe '.'
            warehouseMap[Position(4,2)] shouldBe 'O'
            warehouseMap[Position(4,3)] shouldBe '@'
            warehouseMap[Position(4,4)] shouldBe '.'
        }
        "moving item at [5,3] up twice" {
            val warehouseMap = sampleDataMap.parse()
            warehouseMap[Position(5,3)] = '@'
            warehouseMap.move(Position(5,3), Direction.up)
            warehouseMap.move(Position(5,2), Direction.up)
            warehouseMap[Position(5,3)] shouldBe '.'
            warehouseMap[Position(4,3)] shouldBe '@'
            warehouseMap[Position(3,3)] shouldBe 'O'
            warehouseMap[Position(2,3)] shouldBe 'O'
            warehouseMap[Position(1,3)] shouldBe 'O'
            warehouseMap[Position(0,3)] shouldBe '#'
        }
        "answer for part one using sample data is 10092" {
            partOne(sampleDataMap, sampleDataMoves) shouldBe 10092
        }
        "answer for part one is 1509863" {
            partOne(puzzleInputMap, puzzleInputMoves) shouldBe 1509863
        }
    }
    "With part two" should {
        val sample2DataMap = """
            #######
            #...#.#
            #.....#
            #..OO@#
            #..O..#
            #.....#
            #######
        """.trimIndent().split("\n")
        val sample2Moves = """
            <vv<<^^<<^^
        """.trimIndent()
        "parse mapData into a map" {
            val warehouseMap = sampleDataMap.parse2()
            warehouseMap.size shouldBe 200
            warehouseMap[Position(1,6)] shouldBe '['
            warehouseMap[Position(1,7)] shouldBe ']'
        }
        "move (4,8) left" {
            val warehouseMap = sampleDataMap.parse2()
            warehouseMap.move(setOf(Position(4,8)), Direction.left )
            warehouseMap[Position(4,8)] shouldBe '.'
            warehouseMap[Position(4,7)] shouldBe '@'
            warehouseMap[Position(4,6)] shouldBe ']'
            warehouseMap[Position(4,5)] shouldBe '['
            warehouseMap[Position(4,4)] shouldBe '.'
        }
        "move (5,6) up" {
            val warehouseMap = sampleDataMap.parse2()
            warehouseMap[Position(4,8)] = '.'
            warehouseMap[Position(5,6)] = '@'
            warehouseMap.move(setOf(Position(5,6)), Direction.up )
            warehouseMap[Position(5,6)] shouldBe '.'
            warehouseMap[Position(4,6)] shouldBe '@'
            warehouseMap[Position(3,6)] shouldBe '['
            warehouseMap[Position(3,7)] shouldBe ']'
            warehouseMap[Position(2,6)] shouldBe '['
            warehouseMap[Position(2,7)] shouldBe ']'
            println(warehouseMap.asString())
        }
        val sampleMap3 = """
            ####################
            ##[]..[]......[][]##
            ##[]...........[].##
            ##..........[].@[]##
            ##............[]..##
            ##..##[]..[].[][].##
            ##...[]...[]..[]..##
            ##.....[]..[].[][]##
            ##........[]......##
            ####################
        """.trimIndent().split("\n")
        "move (3,15) down1" {
            val warehouseMap = sampleMap3.parse()
            warehouseMap[Position(3,15)] shouldBe '@'
            warehouseMap.move(setOf(Position(3,15)),Direction.down)
            println(warehouseMap.asString())
        }
        "answer for part two using sample2 data is 9021" {
            partTwo(sample2DataMap, sample2Moves) shouldBe 9021
        }
        "answer for part two using sample data is 9021" {
            partTwo(sampleDataMap, sampleDataMoves) shouldBe 9021
        }
        "answer for part two is 1548815" {
            partTwo(puzzleInputMap, puzzleInputMoves) shouldBe 1548815
        }
    }
})