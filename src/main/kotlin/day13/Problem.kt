package day13

fun partOne(data:List<List<String>>): Int {
    return data.parse().minCostOfPresses().sumOf{ it.min() }
}

data class Game(val buttonAX:Int, val buttonAY:Int, val buttonBX:Int, val buttonBY:Int, val prizeX:Int, val prizeY:Int) {
    fun costOfPresses(aPresses:Int):Int? {
        val bPresses = ((prizeX + prizeY) - aPresses * (buttonAX + buttonAY)) / (buttonBX + buttonBY)
        if (aPresses <= 100 && bPresses <= 100 && (buttonAX * aPresses + buttonBX * bPresses) == prizeX && (buttonAY * aPresses + buttonBY * bPresses) == prizeY)
            return aPresses * 3 + bPresses
        else return null
    }
}

fun List<Game>.minCostOfPresses() = map{ game ->  (1..100).mapNotNull{n -> game.costOfPresses(n)}}.filter { it.isNotEmpty() }

fun List<List<String>>.parse():List<Game> =
    map{ s-> Game( s[0].toButtonX(),s[0].toButtonY(), s[1].toButtonX(),s[1].toButtonY(), s[2].toPrizeX(),s[2].toPrizeY()) }

fun String.toButtonX() = split("X")[1].split(",")[0].toInt()
fun String.toButtonY() = split("Y")[1].toInt()
fun String.toPrizeX() = split("X=")[1].split(",")[0].toInt()
fun String.toPrizeY() = split("Y=")[1].toInt()

fun partTwo(data:List<List<String>>): Int {
    return 0
}