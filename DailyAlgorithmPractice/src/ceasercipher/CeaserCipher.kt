package ceasercipher




fun encodeCaesarCipher(str: String, shift: Int) : String {
    // all the alphabet
    // this is using index method to locate the position
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    // declare a variable for the encoded
    var encoded = ""
    // loop through the given string
    str.forEach {
        val indexInAlphabet = alphabet.indexOf(it)
        var newIndex = (indexInAlphabet + shift) % alphabet.length
        encoded += alphabet[newIndex]
    }
    return encoded
}
// my personal solution
// but did not work well
fun encodeCaesarCipherTrial(str: String, shift: Int): String {
    // convert the given string to a charArray
    val allChar = str.toCharArray()
    // convert to ascii and store it in an array
    val asciiValues = mutableListOf<Int>()
    val newChar = mutableListOf<Char>()
    var newValue = 0
    allChar.forEach {
       newValue = it.toInt() + (shift )
        asciiValues.add(newValue)
    }
    // convert the ascii to character
    asciiValues.forEach {
        newChar.add(it.toChar())
    }

    return newChar.joinToString("")

}