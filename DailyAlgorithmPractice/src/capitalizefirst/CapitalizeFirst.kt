package capitalizefirst

fun main() {
    val players = arrayListOf<String>("ipegba")
    capitalizeFirst(players)

    val person = "osehi"
    println("What happens when the substring starts at zero: ${person.substring(1)}")
    println("What happens when a string is converted to a charArray: ${person.toCharArray().toList()}")
}

fun capitalizeFirst(list: List<String>): List<String>{
    // the capitalized word or sentence
    val isCapitalized = mutableListOf<String>()
    if (list.isEmpty()) {
        return emptyList()
    }
    if (list.contains("")) {
        isCapitalized.add("")
        return isCapitalized
    }

        // capitalize the word
        list.forEach {
           val word = it.toCharArray()
            val transform = word[0].uppercase() + it.substring(1)
            println(transform)
            isCapitalized.add(transform)
        }

    return isCapitalized
}
// learn this recursive solution
private fun capitalizeFirstOne(list: List<String>): List<String> {
    if (list.size == 1) {
        return list.map { it.replaceFirstChar { string -> string.uppercaseChar() } }
    }

    return list.take(1)
        .map { it.replaceFirstChar { string -> string.uppercaseChar() } } + capitalizeFirst(list.drop(1))
}