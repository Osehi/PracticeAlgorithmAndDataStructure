package arrays

fun main(){
    val scores = arrayListOf<Int>(1, 7, -2, -5, 10, -1)
    var maxSum = Integer.MIN_VALUE
    var sum = 0
    for (i in scores.indices){
        sum += scores[i]
        if (sum > maxSum){
            maxSum = sum
        }
    }
    println("The maximum sum is :${maxSum}")
}
