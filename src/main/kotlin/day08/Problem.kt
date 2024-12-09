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

fun Set<Position>.removeOutOfRange(rows:IntRange, cols:IntRange) = filter {it.isInRange(rows.last, cols.last)}.toSet()

fun createAntiNodes(a: Position, b:Position): Set<Position> =
    setOf(Position( 2 * a.row - b.row, 2 * a.col - b.col),
        Position( 2 * b. row  - a.row, 2 * b.col - a.col))

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
        .flatMap{ antennas -> positionsOnLine(antennas.first(),antennas.last(),data.lastIndex, data.first().lastIndex)}
        .toSet().size

fun positionsOnLine(a:Position, b:Position,maxRow: Int, maxCol: Int) =
    (positionsOnLine(a, b, maxRow, maxCol, -1) + positionsOnLine(a, b, maxRow, maxCol, +1) + setOf(Position(a.row, a.col)))

fun positionsOnLine(a:Position, b:Position, maxRow:Int, maxCol:Int, inc:Int):Set<Position> {
    val step = reduceFraction( b.row - a.row, b.col - a.col )
    var i = inc
    val result = mutableSetOf<Position>()
    while ((a + step * i).isInRange(maxRow, maxCol) ) {
        result.add(a + step * i)
        i+=inc
    }
    return result
}

fun reduceFraction(x: Int, y: Int) = gcd(x,y).let{ gcd -> Position(x, y)}

fun gcd(a: Int, b: Int): Int = if (b == 0)  a else gcd(b, a % b)
