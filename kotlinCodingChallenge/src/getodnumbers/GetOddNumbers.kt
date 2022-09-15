package getodnumbers

// https://github.com/igorwojda/kotlin-coding-challenges



 fun filterOdd(list: List<Int>): List<Int> {
    // iterate and if divisible by 2 without remainder
    val oddNumbers = mutableListOf<Int>()
    list.forEach {
        if (it % 2 != 0) {
            oddNumbers.add(it)
        }
    }
    return oddNumbers
}