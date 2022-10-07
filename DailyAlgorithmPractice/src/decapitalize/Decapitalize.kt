package decapitalize

fun main() {
    decapitalizeConst("FOO_BAR")
}

fun decapitalizeConst(str: String): String {
    // remove underscore
    val listOfWords = str.split("_")
    println(listOfWords)
    // concatenate the string
    var res = ""
    // make first word a lowercase
    listOfWords.forEach {
           res += when(it) {
                listOfWords.first() -> it.lowercase()
                listOfWords.last() -> {
                    val allChar = it.lowercase().toCharArray()
                    allChar[0] = allChar[0].uppercaseChar()
                      allChar.joinToString("")

                }
                else -> {
                    var allChar = it.lowercase().toCharArray()
                    allChar[0] = allChar[0].uppercaseChar()
                    allChar.joinToString("")
                }
            }
        }

    // make the 1st letter in the next word uppercase
   return res
}