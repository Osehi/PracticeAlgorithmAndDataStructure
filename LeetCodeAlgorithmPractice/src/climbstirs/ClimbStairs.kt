package climbstirs

fun main(){
//    climbStairs(3)
    climbStairs(2)
}

    // I found a way
fun climbStairsOne(n:Int){
    // create an array
        var possibleWaysOfClimblingStairs = Array(n + 1){0}
//        println(possibleWaysOfClimblingStairs)
//    return 0
}

fun climbStairs(n: Int) {
    // imagine 3 is given
    // get a count variable
    var numOfWays = 0
    // increment count when modulos number and 2
    for (i in n downTo 1){
       if (i % 3 == 0){
           numOfWays++
       }
        if (i % 2 == 0){
            numOfWays++
        }
    }
    println(numOfWays)
//    return 0
}