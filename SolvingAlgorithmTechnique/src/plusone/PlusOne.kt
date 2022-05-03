package plusone

/**
 * manipulating
 */
fun main(){
    val list = intArrayOf(1,2,9)
    // access the last digit
    // list[list.size - 1]
    // it can be update
    // if it is less than 9, the update is okay
    var result = plusOne(list)
    println(result.toList())

}


fun plusOne(digits: IntArray): IntArray {
    // if the item in the last index is less than 9
    // increment digit and return digit
    // if it is 9, turn it to zero
    var lengthOfDigit = digits.size - 1
    for (i in lengthOfDigit downTo 0){
        if (digits[i] < 9){
            digits[i]++
            return digits
        }
        // when item at any iteration is 9, assign zero(0)
        digits[i] = 0


    }
    var newNumber = IntArray(digits.size + 1)
    newNumber[0] = 1
    return newNumber
}

fun plusOneTest(digits: IntArray): IntArray {
    var newList = IntArray(digits.size + 1){0}
    // access that last digit
    // when is less than 9, increament
    var lastItem = digits.size - 1
    if (digits[lastItem] < 9){
        digits[lastItem]++
        return digits
    }
    if (digits[lastItem] == 9){
        digits[lastItem] = 0
        newList[newList.size - 1] = digits[lastItem]
        newList[0] = 1
    }
    return newList
}