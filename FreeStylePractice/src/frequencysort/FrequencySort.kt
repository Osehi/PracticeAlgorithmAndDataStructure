package frequencysort

fun main(){
    val list = arrayListOf<Int>(1,1,2,2,2,3)
    println("*****")
    println(list.groupingBy { it }.eachCount())
    println("==========")
    println(list)
    // the frequency that is 1, is under descending order
    // the first thing I will do is sort
    val isSorted = list.sorted()
    // put elements of frequecy of 1 in an array
    var hasFrequencyOfOne = mutableMapOf<Int, Int>()
    // put elements of frequency above 1 in another array
    var hasFrequencyAboveOne = mutableMapOf<Int, Int>()

    // try another method
    var occurence = mutableMapOf<Int, Int>()


    // add to the array
    for (item in list){
        if (!occurence.contains(item)){
            occurence[item] = 1
        } else {
            occurence[item] = occurence[item]?.plus(1)!!
        }

    }
    println(occurence)
    println("--------")

}