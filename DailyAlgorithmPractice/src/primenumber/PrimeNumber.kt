package primenumber

fun printNumber(n: Int): List<Int> {
    // give a list of prime numbers
    // the container
    val listOfPrimeNumbers = mutableListOf<Int>()
    if (n == 0) {
        return listOfPrimeNumbers
    }
    for (num in n downTo 1) {
        listOfPrimeNumbers.add(num)
    }
    return listOfPrimeNumbers
}