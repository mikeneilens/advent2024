package day13

fun partOne(data:List<List<String>>): Long {
    return data.parse().minCostOfPresses().sumOf{ it.min() }
}

data class Game(val buttonAX:Long, val buttonAY:Long, val buttonBX:Long, val buttonBY:Long, val prizeX:Long, val prizeY:Long) {
    fun costOfPresses(aPresses:Long):Long? {
        val bPresses = ((prizeX + prizeY) - aPresses * (buttonAX + buttonAY)) / (buttonBX + buttonBY)
        if (aPresses <= 100 && bPresses <= 100 && destinationFound(aPresses, bPresses))
            return aPresses * 3 + bPresses
        else return null
    }

    fun bPresses(aPresses:Long) =
        ((prizeX + prizeY) - aPresses * (buttonAX + buttonAY)) / (buttonBX + buttonBY)

    fun aPresses(bPresses:Long) =
        ((prizeX + prizeY) - bPresses * (buttonBX + buttonBY)) / (buttonAX + buttonAY)

    fun destinationFound(aPresses: Long, bPresses:Long) = (buttonAX * aPresses + buttonBX * bPresses) == prizeX && (buttonAY * aPresses + buttonBY * bPresses) == prizeY
}

fun List<Game>.minCostOfPresses() = map{ game ->  (1L..100L).mapNotNull{n -> game.costOfPresses(n)}}.filter { it.isNotEmpty() }

fun List<List<String>>.parse():List<Game> =
    map{ s-> Game( s[0].toButtonX(),s[0].toButtonY(), s[1].toButtonX(),s[1].toButtonY(), s[2].toPrizeX(),s[2].toPrizeY()) }

fun String.toButtonX() = split("X")[1].split(",")[0].toLong()
fun String.toButtonY() = split("Y")[1].toLong()
fun String.toPrizeX() = split("X=")[1].split(",")[0].toLong()
fun String.toPrizeY() = split("Y=")[1].toLong()

fun partTwo(data:List<List<String>>): Long {
    return data.parse2().mapNotNull{
        if(it.buttonAY/it.buttonAX > it.buttonBY/it.buttonBX ) {
            val aPresses = it.aPresses()
            if (aPresses != null) Pair(aPresses, it.bPresses(aPresses)) else null
        } else {
            val bPresses = it.bPresses()
            if (bPresses != null) Pair(it.aPresses(bPresses), bPresses) else null
        }
    }.sumOf{it.first * 3 + it.second }
}

fun List<List<String>>.parse2():List<Game> =
    map{ s-> Game( s[0].toButtonX(),s[0].toButtonY(), s[1].toButtonX(),s[1].toButtonY(), s[2].toPrizeX() + 10000000000000,s[2].toPrizeY() + 10000000000000) }

fun Game.aPresses():Long? {
    var start = 0L
    var end = maxOf(prizeX,prizeY)
    var aPresses = 0L
    while ((end - start)  > 0L) {
        aPresses = (start + end)/2
        val bPresses = bPresses(aPresses)
        if (destinationFound(aPresses, bPresses))
            return aPresses
        val destinationX = buttonAX * aPresses + buttonBX * bPresses
        val destinationY = buttonAY * aPresses + buttonBY * bPresses
            if (destinationX > prizeX) end = if (end - start == 1L) start else aPresses
            else start = if (end - start == 1L) end else aPresses

    }
    if (destinationFound(aPresses, bPresses(aPresses)))
        return aPresses
    return  null
}
fun Game.bPresses():Long? {
    var start = 0L
    var end = maxOf(prizeX,prizeY)
    var bPresses = 0L
    while ((end - start)  > 0L) {
        bPresses = (start + end)/2
        val aPresses = aPresses(bPresses)
        if (destinationFound(aPresses, bPresses))
            return bPresses
        val destinationX = buttonAX * aPresses + buttonBX * bPresses
        if (destinationX > prizeX) end = if (end - start == 1L) start else bPresses
        else start = if (end - start == 1L) end else bPresses

    }
    if (destinationFound(aPresses(bPresses),bPresses))
        return bPresses
    return  null
}


fun List<Game>.minCostOfPresses2() {

} //= map{ game ->  (1..100).mapNotNull{n -> game.costOfPresses(n)}}.filter { it.isNotEmpty() }
