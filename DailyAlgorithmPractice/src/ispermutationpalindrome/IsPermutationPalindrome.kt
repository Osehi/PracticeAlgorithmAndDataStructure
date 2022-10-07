package ispermutationpalindrome

fun isPermutationPalindrome(str: String): Boolean {
    // get a reverse of the str
    // and check if it is equal
    // concatenate the string
    var reversedString = ""
    for (i in str.length - 1 downTo 0) {
        reversedString += str[i]
    }
    return str == reversedString
}