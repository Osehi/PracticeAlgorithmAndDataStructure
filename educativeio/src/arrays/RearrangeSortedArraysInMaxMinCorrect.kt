package arrays

fun main(){
    val scores = arrayListOf<Int>(1, 2, 3, 4, 5)
    var smallValuePointer = 0
    var largeValuePointer = scores.size - 1
    var switchToMAxOrMinValue = true
    // create an empty array
    var newScoreFormat = Array(scores.size){0}
    // loop through the scores
    for (i in scores.indices){
        if (switchToMAxOrMinValue){
            // get the max num and store in the new array
            newScoreFormat[i] = scores[largeValuePointer--]
        } else {
            newScoreFormat[i] = scores[smallValuePointer++]
        }
        switchToMAxOrMinValue = !switchToMAxOrMinValue
    }
    println("The value of the array is :${newScoreFormat.contentToString()}")
}