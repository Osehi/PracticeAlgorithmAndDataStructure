package reverseint

fun reverseInt(i: Int): Int {
    // reverse the int
    // concatenate value
    var value = ""
    // get the hint value
    var numberValue = 0
    // check if given number is less than zero
    if (i < 0) {
        // this is a negative number
        // convert to string and loop through to concatenate
        for (j in i.toString().length - 1 downTo 1) {
            value += i.toString()[j]
        }
        numberValue = -(value.toInt())
        return numberValue
    }
    for (k in i.toString().length - 1 downTo 0) {
        value += i.toString()[k]
    }
    numberValue = value.toInt()
    return numberValue
}