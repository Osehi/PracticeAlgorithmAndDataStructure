package isatolerantpalindrome

fun isTolerantPalindrome(str: String): Boolean {
    // check for number of bad characters
    var count = 0
    // build a new string
    var newWord = ""
    // use a whileloop
    var begin = 0
    var last = str.length - 1
    while(begin < last) {
        if (str[begin] != str[last]) {
            count++
        } else {
            newWord += str[begin]
        }
        begin++
        last--
    }

    // check if the back character count is greater than one
    if (count == 0) {
        var start = 0
        var end = str.length - 1
        while (start < end) {
            if (str[start] != str[end]) {
                return false
            }
            start++
            end--
        }
        return true
    } else if (count == 1) {
        var start = 0
        var end = newWord.length - 1
        while (start < end) {
            if (newWord[start] != newWord[end]) {
                return false
            }
            start++
            end--
        }
        return true
    } else {
        return false
    }


}