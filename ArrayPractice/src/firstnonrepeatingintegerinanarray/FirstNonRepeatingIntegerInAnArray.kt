package firstnonrepeatingintegerinanarray

/**
 * the task is to get the first non-repeating integer in an array
 * I will use the frequency method
 * Get the highest element,
 * USe that to create the size of an array
 * Use the item as the index of the new array
 * and assign its occurence as its value
 */
fun main(){
    var scores = arrayListOf<Int>(4,5,1,2,0,4)
    var count = 0
    for (scoreOne in scores){
        for (scoreTwo in scores){
            if (scoreOne == scoreTwo){
                count++
            }
        }
        if (count == 1){
            println("- this is the first non-repeating number - ${scoreOne}")
        } else {
            count = 0
        }

    }
}

fun waysToInitializeAnArray(){
    // ways of initializing an array
    var score = Array(5){0}
    println(score.contentToString())
    println("-------- new print line ----------")

    var scoreOne = Array(5){it}
    println(scoreOne.contentToString())

    var scoreTwo = IntArray(5){0}
    println(scoreTwo.contentToString())
}