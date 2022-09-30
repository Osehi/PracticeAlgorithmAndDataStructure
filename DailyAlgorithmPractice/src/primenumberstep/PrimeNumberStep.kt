package primenumberstep

fun printNumberStep(n: Int, step: Int = 1): List<Int> {
    // create an empty list
    val listOfPrimeNumbers = mutableListOf<Int>()
    if (n == 0) {
        return listOfPrimeNumbers
    }
    // loop through the possible numbers
    for (num in n downTo 1 step step) {
        listOfPrimeNumbers.add(num)
    }
    return listOfPrimeNumbers
}