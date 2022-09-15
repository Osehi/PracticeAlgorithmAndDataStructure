package remoterepsalgorithm

fun main(){
    /*
    val list = IntArray(2){0}
    println("Here is the output: ${thirdLargestNumberTestingConcept(list)}")

     */
    var arr = intArrayOf(101, 150, 99, 34, 11, 12, 100, 100, 100, 150)
    val thirdLargestNuber = thirdLargestNumberOne(arr)
    println(thirdLargestNuber)
}

fun thirdLargestNumberOne(arr: IntArray): Int {
    if(arr.size < 3){
        return -1
    }
    // sort
    val removeDuplicates = arr.toSortedSet()
    val largestNumber = removeDuplicates.elementAt(removeDuplicates.size - 1) ?: 0
    // get the thirdlargest element
    val thirdLargestNumber = removeDuplicates.elementAt(removeDuplicates.size - 3)

    return if (largestNumber == thirdLargestNumber) largestNumber else thirdLargestNumber

}





fun thirdLargestNumberTestingConcept(arr: IntArray): Int {
    if (arr.size < 3)
        return -1
    return arr.size
}