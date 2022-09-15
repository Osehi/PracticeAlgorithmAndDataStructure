package dividearray

fun main(){
    val list = arrayListOf<Int>(3,2,3,2,2,2)
    var uniquePairs = mutableMapOf<Int, Int>()
    // check if the length of the array is of modulud 2==
    if (list.size % 2 != 0){
        println("false")
    }

    for (item in list){
       if (!uniquePairs.contains(item)){
           // assign the count of 1 to it
           uniquePairs[item] = 1
       } else {
           uniquePairs[item] = uniquePairs[item]?.plus(1)!!
       }
    }

    println(uniquePairs)

    // loop through the map
    for (item in uniquePairs.values){
        if (item % 2 != 0){
            println("false")
        } else {
            println("true")
        }
    }


}