package maxoccurencechar

fun maxOccurrentChar(str: String): Char? {
    // the identified character
    var identifiedCharacter : Char = ' '
    // get the occurrence into a map
    val occurrence = mutableMapOf<Char, Int>()
    // loop to get occurrence
    for (item in str) {
        if (!occurrence.contains(item)) {
            occurrence[item] = 1
        } else {
            occurrence[item] = occurrence.getValue(item).plus(1)
        }
    }
    var largestNumber = Integer.MIN_VALUE

    // get the highest value
    for ((key, value) in occurrence.entries) {
        if (largestNumber < value) {
            largestNumber = value
        }
    }
    // get the character
    for ((key, value) in occurrence) {
        if (largestNumber == value) {
            identifiedCharacter = key
        }
    }
    return identifiedCharacter
}