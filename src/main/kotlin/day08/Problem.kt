package day08

import lib.Position
import lib.PositionD
import lib.Step
import kotlin.math.abs

fun partOne(data:List<String>) =
     parse(data).flatMap {(_, antennas) -> antennas.combinations()}.toSet()
        .createAntiNodes(data.indices, data.first().indices).flatten()
        .toSet().size

fun Set<Position>.combinations(): Set<Set<Position>> =
    flatMap{ a-> filter{ b-> a!=b }.map{b -> setOf(a,b)}}.toSet()

fun Set<Set<Position>>.createAntiNodes(rows:IntRange, cols:IntRange) =
    map{ it.toList().let{(a,b) -> createAntiNodes(a,b)}.removeOutOfRange(rows, cols)}.toSet()

fun Set<Position>.removeOutOfRange(rows:IntRange, cols:IntRange) = filter { position ->  (position.row in rows) && (position.col in cols) }

fun createAntiNodes(a: Position, b:Position): Set<Position> =
    setOf(Position( a. row - (b.row - a.row), a.col - (b.col - a.col)),
        Position( b. row + (b.row - a.row), b.col + (b.col - a.col))
        )

fun parse(data:List<String>):Map<String,Set<Position>> {
    val antennas = mutableMapOf<String, Set<Position>>()
    data.forEachIndexed{row, line -> line.forEachIndexed{col, value -> if(value != '.') antennas.addToMap(Pair(value.toString(), Position(row, col)))}}
    return antennas
}

fun MutableMap<String,Set<Position>>.addToMap(values: Pair<String, Position>) {
    if (values.first !in this) this[values.first] = setOf(values.second)
    else this[values.first] = getValue(values.first) + values.second
}

fun partTwo(data:List<String>) =
    parse(data).flatMap{ (_, antennas) -> antennas.combinations()}
        .flatMap{ set -> positionsOnLine(set.toList()[0],set.toList()[1],data.lastIndex, data.first().lastIndex)}
        .toSet().size

fun calculateStep(a:Position, b:Position) =
    if (abs(b.row - a.row) > abs(b.col - a.col)) Step(1.0, (b.col - a.col).toDouble()/(b.row - a.row) )
    else Step((b.row - a.row).toDouble()/(b.col - a.col),1.0)

fun positionsOnLine(a:Position, b:Position,maxRow: Int, maxCol: Int) =
    (positionsOnLine(a, b, maxRow, maxCol, -1) + positionsOnLine(a, b, maxRow, maxCol, +1) + setOf(PositionD(a.row.toDouble(), a.col.toDouble())))
        .filter(PositionD::isExactPosition)

fun positionsOnLine(a:Position, b:Position, maxRow:Int, maxCol:Int,inc:Int):Set<PositionD> {
    val step = calculateStep(a, b)
    var i = inc
    val result = mutableSetOf<PositionD>()
    while ((a.toPositionD() + step * i).isInRange(maxRow, maxCol)) {
        result.add(a.toPositionD() + step * i)
        i+= inc
    }
    return result
}