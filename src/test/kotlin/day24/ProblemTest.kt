package day24

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.beInstanceOf

class ProblemTest:WordSpec ({
    val sampleVariableData = """
        x00: 1
        x01: 0
        x02: 1
        x03: 1
        x04: 0
        y00: 1
        y01: 1
        y02: 1
        y03: 1
        y04: 1
    """.trimIndent().split("\n")
    val sampleGateData = """
        ntg XOR fgs -> mjb
        y02 OR x01 -> tnw
        kwq OR kpj -> z05
        x00 OR x03 -> fst
        tgd XOR rvg -> z01
        vdt OR tnw -> bfw
        bfw AND frj -> z10
        ffh OR nrd -> bqk
        y00 AND y03 -> djm
        y03 OR y00 -> psh
        bqk OR frj -> z08
        tnw OR fst -> frj
        gnj AND tgd -> z11
        bfw XOR mjb -> z00
        x03 OR x00 -> vdt
        gnj AND wpb -> z02
        x04 AND y00 -> kjc
        djm OR pbm -> qhw
        nrd AND vdt -> hwm
        kjc AND fst -> rvg
        y04 OR y02 -> fgs
        y01 AND x02 -> pbm
        ntg OR kjc -> kwq
        psh XOR fgs -> tgd
        qhw XOR tgd -> z09
        pbm OR djm -> kpj
        x03 XOR y03 -> ffh
        x00 XOR y04 -> ntg
        bfw OR bqk -> z06
        nrd XOR fgs -> wpb
        frj XOR qhw -> z04
        bqk OR frj -> z07
        y03 OR x01 -> nrd
        hwm AND bqk -> z03
        tgd XOR rvg -> z12
        tnw OR pbm -> gnj
    """.trimIndent().split("\n")

    "With part one" should {
        "parse variables" {
            val variables = parseToVariables(sampleVariableData)
            variables["x00"] shouldBe true
            variables["x01"] shouldBe false
        }
        "parse gates" {
            val variables = parseToVariables(sampleVariableData)
            val gates= parseToGates(sampleGateData, variables)
            gates[0] should beInstanceOf<XOrGate>()
            gates[0].input1 shouldBe "ntg"
            gates[0].input2 shouldBe "fgs"
            gates[0].output shouldBe "mjb"
        }
        "process gates" {
            val variables = parseToVariables(sampleVariableData)
            val gates= parseToGates(sampleGateData, variables)
            processGates(gates)
            variables["bfw"] shouldBe true
            variables["bqk"] shouldBe true
            variables["djm"] shouldBe true
            variables["ffh"] shouldBe false
            variables["z00"] shouldBe false
            variables["z01"] shouldBe false
            variables["z02"] shouldBe false
            variables["z03"] shouldBe true
            variables["z04"] shouldBe false
            variables["z05"] shouldBe true
            variables["z06"] shouldBe true
            variables["z07"] shouldBe true
            variables["z08"] shouldBe true
            variables["z09"] shouldBe true
            variables["z10"] shouldBe true
            variables["z11"] shouldBe false
            variables["z12"] shouldBe false
        }
        "convert map to boolean" {
            val variables = mapOf("z01" to true, "z02" to false, "z03" to true, "abc" to true)
            variables.toValue() shouldBe 5
        }

        "part one with sample data is 2024" {
            partOne(sampleVariableData, sampleGateData) shouldBe 2024L
        }
        "answer to part one is 66055249060558" {
            partOne(puzzleVariablesInput, puzzleGatesInput) shouldBe 66055249060558L
        }
    }
    "With part two" should {
        "return 0" {
            partTwo(sampleVariableData, sampleGateData) shouldBe 0
        }
    }
})