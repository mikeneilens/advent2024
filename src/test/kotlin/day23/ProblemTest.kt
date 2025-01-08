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
        "answer with sample data is 7" {
            partOne(sampleData) shouldBe 7
        }
        "answer to part one is 1306 " {
            partOne(puzzleInput) shouldBe 1306
        }
    }
    "With part two" should {
        "combinations of a, b and c" {
            combinations(setOf("a","b","c")) shouldBe setOf(
                setOf(),setOf("a"),setOf("b"),setOf("a","b"),
                setOf("c"),setOf("a","c"),setOf("b","c"),setOf("a","b","c"))
        }
        "co,de,ka,ta all connect" {
            val map = sampleData.createMap()
            setOf("co","de","ka","ta").allConnected(map) shouldBe true
        }
        "co,de,ka,ta,tc do not all connect" {
            val map = sampleData.createMap()
            setOf("co","de","ka","ta","tc").allConnected(map) shouldBe false
        }
        "part two with sampledata is co,ta,ka,de" {
            partTwo(sampleData) shouldBe "co,de,ka,ta"
        }
        "answer to part two is" {
            partTwo(puzzleInput) shouldBe "bd,dk,ir,ko,lk,nn,ob,pt,te,tl,uh,wj,yl"
        }
    }
})