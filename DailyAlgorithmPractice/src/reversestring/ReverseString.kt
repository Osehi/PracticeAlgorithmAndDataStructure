package reversestring

fun reverse(str: String): String {
    // concatenate the string in a variable
    var reversedString = ""
    // loop throuth the given string from behind
    for (i in str.length - 1 downTo 0) {
        reversedString += str[i]
    }
    return reversedString
}