package day22

fun partOne(data:List<String>): Long {
 return data.sumOf{it.toLong().process()}
}

fun Long.process(times:Int = 2000) = (1..times).fold(this){result, _ -> evolve(result)}

fun evolve(secretNumber: Long):Long = secretNumber.evolve { it * 64L }.evolve{ it / 32L }.evolve { it * 2048L }

fun Long.evolve(f:(Long)->Long) = prune(mix(f(this), this))

fun mix(value:Long, secretNumber:Long) = value.xor(secretNumber)

fun prune(secretNumber: Long) = secretNumber % 16777216

fun partTwo(data:List<String>): Long {
    val numbers = data.map{it.toLong()}
    val maps = numbers.map{ it.pricesAndChanges().windowed(4, 1).createMapOfChangeSequences()}
    val uniqueSequences:Set<List<Long>> = maps.flatMap{it.keys}.toSet()
    return uniqueSequences.maxOf{sequence -> maps.sumOf { m -> m.get(sequence)?.last()?.first ?: 0  }  }
}

fun Long.pricesAndChanges(times:Int = 2000) = (1..times).fold(listOf(Pair(this, 0L))){result, _ ->
    val evolved = evolve(result.last().first)
    result + Pair(evolved, ((evolved % 10L) - result.last().first % 10L)) }.map{Pair(it.first % 10L, it.second)}.drop(1)

fun List<List<Pair<Long, Long>>>.createMapOfChangeSequences():Map<List<Long>, List<Pair<Long, Long>>> {
    val sequenceMap = mutableMapOf<List<Long>, List<Pair<Long, Long>>>()
    forEach{ if (it.changeSequence() !in sequenceMap) sequenceMap[it.changeSequence()] = it }
    return sequenceMap
}

fun List<Pair<Long, Long>>.changeSequence() = map{it.second}

