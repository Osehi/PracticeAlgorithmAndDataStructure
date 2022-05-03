package maximumsubarray

fun main(){
    var myPearls = arrayListOf<Int>(5,4,-1,7,8)
    var maxSum = 0
    var sum = 0
    // loop through the items and compare
    for (i in myPearls.indices){
        sum += myPearls[i]
        if (sum == 0){
            // set the present item to the sum
            sum = myPearls[i]
        }
        // do the comparism
        if (sum > maxSum){
            maxSum = sum
        }
    }
    println(maxSum)
}

