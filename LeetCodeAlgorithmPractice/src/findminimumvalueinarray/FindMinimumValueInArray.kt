package findminimumvalueinarray

/**
 * finding the min value
 */
fun main(){
    val scores = arrayListOf<Int>(10, 3, 8, 5, 17)
    var min = Integer.MAX_VALUE
    for (score in scores){
        if (score < min){
            min = score
        }
    }
    println("This is the smallest score: ${min}")
}