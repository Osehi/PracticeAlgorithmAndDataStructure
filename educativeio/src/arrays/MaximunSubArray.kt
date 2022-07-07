package arrays

fun main(){
    val scores = arrayListOf<Int>(-4, 2, -5, 1, 2, 3, 6, -5, 1)
    var maxSum = Integer.MIN_VALUE
    var sum = 0
    for (i in scores.indices){
        sum += scores[i]
        if (sum > maxSum){
            maxSum = sum
        }
    }
    println("The maximum sum is :${maxSum}")

    println("This is the dynamic programming result : ${maxSubArray(scores)}")
}

/**
 * This is the correct one that involves dynamic programming
 */
fun maxSubArray(list:ArrayList<Int>): Int{
    var currMax = 0
    var globalMax = 0
    for (i in list.indices){
        if (currMax < 0){
            currMax = list[i]
        } else {
            currMax += list[i]
        }
        if (globalMax < currMax){
            globalMax = currMax
        }
    }
    return globalMax
}
