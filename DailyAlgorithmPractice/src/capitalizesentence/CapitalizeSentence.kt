package capitalizesentence


fun main(){

    val result = doCapitalize("osehi is handsome")
    println("Here is the output: ${result}")
    val word = "hello"
    word.split("")
    val list = arrayListOf<String>("one", "two")
   val output = list.joinToString("")
    println("Here is the output of JoinToString: ${output}")
}

// Lessons Learn
// How to use joinToString
// joinToString is used to remove every content in an array and make them a String


fun doCapitalize(str: String): String {
    return str
        .split(" ")
        .joinToString(" ") { string ->
            string.replaceFirstChar { it.uppercase() }
        }
}

fun secondDoCapitalize(str: String): String {
    val words = mutableListOf<String>()
    str.split(" ").forEach {
        words.add(it[0].uppercase() + it.substring(1))
    }
    return words.joinToString(" ")
}

 fun addCapitalizeSentence(str: String): String {
    // use concatenation
     // transform the first character to Uppercase
     var capitalizedSentence = ""
     // loop through the given sentence

     for (item in str.indices) {
         // add a conditional block to get the first item and transform it
         when(item) {
             0 -> {
                 capitalizedSentence += str[item].uppercase()
             }
             else -> {
                 capitalizedSentence += str[item]
             }
         }

     }
     return capitalizedSentence
}

fun capitalizeSentence(str: String): String {
    var capitalizedSentence = ""
    // split the string to an array of string
    val wordCollection = str.split(" ")
    // check size of array, if size is 1, do the first algorithm else the second
    if (wordCollection.size == 1) {
        // use the implementation for just one
        for (item in wordCollection) {
            for (i in item.toCharArray().indices) {
                when(i) {
                    0 -> {
                        capitalizedSentence += item[i].uppercase()
                    }
                    else -> {
                        capitalizedSentence += item[i]
                    }
                }
            }
        }
    } else {
        for (item in wordCollection) {
            for (i in item.toCharArray().indices) {
                when(i) {
                    0 -> {
                        capitalizedSentence += item[i].uppercase()
                    }
                    else -> {
                        capitalizedSentence += item[i]
                    }
                }
            }
            capitalizedSentence += " "
        }
    }
    return capitalizedSentence
    // as you loop, pick item
    // loop the item and concatenate
    // when the loop ends, add space
}