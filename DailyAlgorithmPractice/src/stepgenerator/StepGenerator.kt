package stepgenerator

fun main() {
    val result = generateSteps(2)
    println(result)
}

fun generateSteps(n: Int): MutableList<String> {
    val list = mutableListOf<String>()
    (1..n).forEach { row ->
        var item = ""
        (1..n).forEach{ column ->
            val char = if(column <= row) "#" else " "
            item += char
        }
        list.add(item)
    }
    return list
}