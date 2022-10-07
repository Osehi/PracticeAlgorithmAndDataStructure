package techniques

fun main() {
    val word = "He is a rich man!!"
    getCharacterFrequencyTest(word)
}

// get character frequency
fun getCharacterFrequencyTest(str: String) {
    val output = str.lowercase()
    println("print the output: ${output}")
    val isFiltered = output.filter { it.isLetterOrDigit() }
    println("print the result of isFiltered: ${isFiltered}")
    val isGrouped = isFiltered.groupBy { it }
    println("print the result of groupBy: ${isGrouped}")
}