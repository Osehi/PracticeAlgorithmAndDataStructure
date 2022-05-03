package maximumprofit

fun main(){
    var list = arrayListOf<Int>(7,1,5,3,6,4)
    var lowestNumber = 0
    var theIndex = 0
    for (i in list.indices){
//        println("I am ${i}")
        // I need to pick the lowest price at an earlier date
        // lowest price with the lowest day
        if (list[i] < lowestNumber){
            lowestNumber = list[i]
            theIndex = i
        }

    }

    var highestNumber = 0
    var itsIndex = 0
    for (j in list.indices){
        if (list[j] > highestNumber){
            highestNumber = list[j]
            itsIndex = j
        }
    }
    println("here is the highest index: ${itsIndex}")
    println("here is the lowest index: ${theIndex}")
    println("here is the highest value: ${highestNumber}")
    println("here is the lowest number: ${lowestNumber}")
    // if the index of the highest is less than the index of the lowest
    if (itsIndex < theIndex){
        println(0)
    }
}