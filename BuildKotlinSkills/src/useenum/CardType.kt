package useenum

enum class CardType(val colour: String) {
    SILVER("grey"),
    GOLD("yellow"),
    PLATINUM("black")
}

fun main(){
    val myChoice = CardType.GOLD.colour
    println(myChoice)
    val content = CardType.GOLD.name
    println(content)
}