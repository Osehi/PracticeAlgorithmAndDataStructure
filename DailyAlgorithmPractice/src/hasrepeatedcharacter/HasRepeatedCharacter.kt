package hasrepeatedcharacter

fun hasRepeatedChar(str: String): Boolean {
    // put it in a map
    val mappedChar = hashMapOf<Char, Int>()
    for (item in str) {
        if (!mappedChar.contains(item)) {
            mappedChar[item] = 1
        } else {
            mappedChar[item] = mappedChar.getValue(item).plus(1)
        }
    }
    for ((k, v) in mappedChar.entries) {
        if (v > 1) {
            return true
        }
    }
    return false
}