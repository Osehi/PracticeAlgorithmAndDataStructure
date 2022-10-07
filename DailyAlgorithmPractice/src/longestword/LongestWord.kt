package longestword

fun longestWord(str: String): String {
    // spit into an array
    val wordComponent = str.split(" ")
    // possible smallest number
    var longestWord = Integer.MIN_VALUE
    var wordLength = 0
    // loop through checking its length for the longest
    for (word in wordComponent) {
        wordLength = word.length
        if (longestWord < wordLength) {
            longestWord = wordLength
        }
    }
    // compare the length of the string to know the longest
    val theLongestWords = mutableListOf<String>()
    for (item in wordComponent) {
        if (longestWord == item.length) {
            theLongestWords.add(item)
        }
    }
    // return the longest to an array
    return theLongestWords.first()
}

// this is the solution from the study material
private fun longestWordMaterial(str: String): String {
    return str.map { if (it.isLetter()) it else ' ' }
        .joinToString(separator = "")
        .split(" ")
        .filterNot { it.isBlank() }
        .maxBy { it.length }
}