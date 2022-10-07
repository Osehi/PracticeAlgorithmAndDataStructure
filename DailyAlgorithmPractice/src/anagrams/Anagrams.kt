package anagrams

fun main() {
    isAnagram("Sodiq is here", "SODIQ is here")
}

fun isAnagram(str1: String, str2: String): Boolean {
    // put the strings into a variable
    val first = str1.replace(" ", "")
    val second = str2.replace(" ", "")
    // convert to lowercase
    val allLowerCaseFirstString = first.lowercase()
    val allLowerCaseSecondString = second.lowercase()
    // convert to charArray
    val firstStringInArray = allLowerCaseFirstString.toCharArray()
    val secondStringInArray = allLowerCaseSecondString.toCharArray()
    var isSortedFirstString = firstStringInArray.sorted().joinToString()
    var isSortedSecondString = secondStringInArray.sorted().joinToString()
    return isSortedFirstString == isSortedSecondString

}
// another way to solve it.
fun isAnagramVersionTwo(str1: String, str2: String): Boolean {
    return getCharFrequency(str1) == getCharFrequency(str2)
}

fun getCharFrequency(str: String): Map<Char, Int> {
    return str.lowercase()
        .filter { it.isLetterOrDigit() }
        .groupingBy { it }
        .eachCount()
}