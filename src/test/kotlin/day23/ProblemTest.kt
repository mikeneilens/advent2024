package day23

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ProblemTest:WordSpec ({
    val sampleData = """
kh-tc
qp-kh
de-cg
ka-co
yn-aq
qp-ub
cg-tb
vc-aq
tb-ka
wh-tc
yn-cg
kh-ub
ta-co
de-co
tc-td
tb-wq
wh-td
ta-ka
td-qp
aq-cg
wq-ub
ub-vc
de-ta
wq-aq
wq-vc
wh-yn
ka-de
kh-ta
co-tc
wh-qp
tb-vc
td-yn
    """.trimIndent().split("\n")

    "With part one" should {
        "parse data into map" {
            val map = mutableMapOf<String, Set<String>>().apply { updateWithPair("a", "b") }
            map shouldBe mutableMapOf("a" to listOf("b"), "b" to listOf("a"))
            map.updateWithPair("a", "c")
            map.updateWithPair("b", "d")
            map shouldBe mutableMapOf("a" to setOf("b","c"), "b" to setOf("a","d"), "c" to setOf("a"), "d" to setOf("b"))
        }
        "create map from sample data" {
            val map = sampleData.createMap()
            map["kh"] shouldBe setOf("tc", "qp", "ub", "ta")
            map["tc"] shouldBe setOf("kh", "wh", "td", "co")
            map["qp"] shouldBe setOf("kh", "ub", "td", "wh")
            setOf("tc", "qp", "ub", "ta") intersect setOf("kh", "ub", "td", "wh") shouldBe setOf("ub")
        }
        "get matches with kh" {
            val map = sampleData.createMap()
            map.matchesWith("kh") shouldBe setOf(setOf("ub", "qp", "kh"))
        }
        "get matches with aq" {
            val map = sampleData.createMap()
            map.matchesWith("aq") shouldBe setOf(setOf("aq", "yn", "cg"),setOf("aq", "vc", "wq"))
        }
        "get matches with de" {
            val map = sampleData.createMap()
            map.matchesWith("de") shouldBe setOf(setOf("de", "co", "ka"),setOf("de", "co", "ta"), setOf("de", "ta", "ka"))
        }
        "trios for the sample data" {
            val map = sampleData.createMap()
            getTrios(map) shouldBe setOf(
                setOf("aq","cg","yn"),
                setOf("aq","vc","wq"),
                setOf("co","de","ka"),
                setOf("co","de","ta"),
                setOf("co","ka","ta"),
                setOf("de","ka","ta"),
                setOf("kh","qp","ub"),
                setOf("qp","td","wh"),
                setOf("tb","vc","wq"),
                setOf("tc","td","wh"),
                setOf("td","wh","yn"),
                setOf("ub","vc","wq"),
            )
        }
        "trios for puzzlie input" {
            val map = puzzleInput.createMap()
            val trios = getTrios(map)
            trios.forEach{ set ->
                val strings = set.toList()
                if (strings[0] !in map.getValue(strings[1]) || strings[0] !in map.getValue(strings[2])) println("error with set $set")
                if (strings[1] !in map.getValue(strings[0]) || strings[1] !in map.getValue(strings[2])) println("error with set $set")
                if (strings[2] !in map.getValue(strings[0]) || strings[2] !in map.getValue(strings[1])) println("error with set $set")
            }
        }
        "answer with sample data is 7" {
            partOne(sampleData) shouldBe 7
        }
        "answer to part one is 1306 " {
            partOne(puzzleInput) shouldBe 1306
        }
    }
    "With part two" should {
        "return 0" {
            partTwo(sampleData) shouldBe 0
        }
    }
})