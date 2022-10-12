package findthevowels

fun vowels(str: String): Int {
    // to count the vowels
    // if the given string is empty return -1
    if (str.isEmpty()) {
        return -1
    }

    // the vowels
    val allVowels = arrayOf('a', 'e', 'i', 'o', 'u', 'y')
    // declare the count variable
    var count = 0
    // loop through the given string and check if it contains
    for (element in str.lowercase()) {
        if (allVowels.contains(element)) {
            count++
        }
    }
    return count
}