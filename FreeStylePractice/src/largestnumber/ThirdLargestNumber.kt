package largestnumber

fun main(){

    var listTwo = arrayListOf<Int>(1,2,3,4,5,5,3,3,4)
    val sortedUniqueItems = listTwo.toSortedSet()
    println("Here is the sorted set: ${sortedUniqueItems}")

    // the thinking is helping me to understand stuff.
    // The Problem => identify the 3rd largest element
    // what are the possible ways I can achieve this
    // 1. by sorting the array -
    // then you can pick the 3rd largest element.
    //
    // What are the possible problems
    // 1. array size is less than 3
    // 2. when there are duplicates
    // 3. when the largest is same as the 3rd largest.
    var list = arrayListOf<Int>(1,2,3,4,5)
    val sortTheArray = list.sorted()
    // pick the 3rd largest number
    val thirdLargestNumber = sortTheArray.elementAt(sortTheArray.size - 3)
    println("This is the 3rd largest element: ${thirdLargestNumber}")
    // what are the edge cases.
    // 1. if there is a multiple of the 3rd largest element . In this cases I will need to use a set
    /*
    var list = arrayListOf<Int>(1,2,3,4,5)
    var newList = mutableListOf<Int>()
    for (element in list){
        newList.add(element)
    }
    // use a while loop and a count to know the third largest element
    // find the largest number
    // remove the number from the array
    // save that element to an array
    // continue the process again

    /** array of the three(3) largest numbers */
    var count = 0
    val largestNumbers = mutableListOf<Int>()
    var largestNum = Integer.MIN_VALUE
    while (count < 3){
        for (item in newList.indices){
            if (list[item] > largestNum){
                largestNum = list[item]
            }
        }
        // add the largestNum to the array - largestNumber and increment count.
        // the count is incremented via the while-loop
        largestNumbers.add(largestNum)
        // remove the element from the array
        list.remove(largestNum)

        count++
    }
    println(largestNumbers)

     */
}