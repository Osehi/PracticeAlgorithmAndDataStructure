package closestnumbers

fun main() {
    val list = arrayOf<Int>(6,2,4,10)
    println(closestNumbers(list))
}

fun closestNumbers(arr: Array<Int>): List<Int> {
    // sort the array
    val isSorted = arr.sorted()
    // declare a variable as smallest absolute difference
    var smallestAbsDifference = Integer.MAX_VALUE
    // find the smallestAbsDifference
    // compute absolute difference
    var computeAbsDifference = 0
    // declare an array to store all the numbers with the smallestAbsDifference
    val numbersOfSmallestAbsDifference = mutableListOf<Int>()
    var start = 0
    var end = isSorted.size - 2
    while (start <= end) {
        computeAbsDifference = Math.abs(isSorted[start] - isSorted[start + 1])
        if (computeAbsDifference < smallestAbsDifference) {
            smallestAbsDifference = computeAbsDifference
        }
        start++
    }
    // reset start
    start = 0
    // identify all the numbers that have the smallestAbsDifference
    var absDifference = 0
    while (start <= end) {
        absDifference = Math.abs(isSorted[start] - isSorted[start + 1])
        if (smallestAbsDifference == absDifference) {
            numbersOfSmallestAbsDifference.add(isSorted[start])
            numbersOfSmallestAbsDifference.add(isSorted[start + 1])
        }
        start++
    }
    return numbersOfSmallestAbsDifference
}

/*
I past this in hackerrank and it passed all the test cases.

fun main() {
    val list = arrayOf<Int>(5, 4, 3, 2)
    println(closestNumbers(list))
}

fun closestNumbers(arr: Array<Int>): Array<Int> {
    // sort the array
    val isSorted = arr.sorted()
    // declare a variable as smallest absolute difference
    var smallestAbsDifference = Integer.MAX_VALUE
    // find the smallestAbsDifference
    // compute absolute difference
    var computeAbsDifference = 0
    // declare an array to store all the numbers with the smallestAbsDifference
    val numbersOfSmallestAbsDifference = mutableListOf<Int>()
    var start = 0
    var end = isSorted.size - 2
    while (start <= end) {
        computeAbsDifference = Math.abs(isSorted[start] - isSorted[start + 1])
        if (computeAbsDifference < smallestAbsDifference) {
            smallestAbsDifference = computeAbsDifference
        }
        start++
    }
    // reset start
    start = 0
    // identify all the numbers that have the smallestAbsDifference
    var absDifference = 0
    while (start <= end) {
        absDifference = Math.abs(isSorted[start] - isSorted[start + 1])
        if (smallestAbsDifference == absDifference) {
            numbersOfSmallestAbsDifference.add(isSorted[start])
            numbersOfSmallestAbsDifference.add(isSorted[start + 1])
        }
        start++
    }
    return numbersOfSmallestAbsDifference.toTypedArray()
}

 */

