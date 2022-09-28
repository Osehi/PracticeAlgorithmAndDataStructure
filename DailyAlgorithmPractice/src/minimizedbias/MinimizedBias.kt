package minimizedbias

fun main() {
    val rating = arrayOf(4,2,5,1)
    println(minimizeBias(rating))
    // the sorted array becomes
    // [1,2,4,5]
    // looking for the difference
    // abs(1-2), abs(4-5)
    // 1+1 = 2
//    val result1 = Math.abs(1 - 2)
//    val result2 = Math.abs(4 - 5)
//    println("The first result is ${result1}, the second result is ${result2}")
}

fun minimizeBias(ratings: Array<Int>): Int {
    // Write your code here
    // sort the array
    val isSorted = ratings.sorted()
    // sum of all minimizedBias
    var sumOfMinimizedBias = 0
    // compute the minimizedBias
    var minimizedBias = 0
    for (i in 0..isSorted.size - 2 step 2) {
        // compute the absolute difference
        minimizedBias = Math.abs(isSorted[i] - isSorted[i + 1])
        sumOfMinimizedBias += minimizedBias
    }
    return sumOfMinimizedBias
}