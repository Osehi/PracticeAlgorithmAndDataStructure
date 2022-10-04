package thirdlargestnumber

fun main() {
    val collections = arrayOf(11, 12, 34,12, 45, 3,4,15,13,67,132,12)
    val newList = arrayOf(101, 150, 99, 34, 11, 12, 100)
    println("here is the sortedItems: ${newList.toSortedSet()}")
    println("here is the thirdlargest item: ${getThirdLargestNumber(newList)}")
    println("here is the sortedItems: ${collections.toSortedSet()}")
    println("here is the thirdlargest item: ${getThirdLargestNumber(collections)}")
    // to work on how set works
    val list = arrayOf(2,3,2,2,4,5,6)
    val prices = arrayListOf<Int>(9,10,9,6,1,7,7,)
    // println("toSet(): ${prices.toSet()}") gives // [9, 10, 6, 1, 7]
    // println("toSortedSet(): ${prices.toSortedSet()}") gives // [1, 6, 7, 9, 10]
    println("toSortedSet(): ${prices.toSortedSet()}")
    // list.toSet() // [2,3,4,5,6]
    println(list.toSortedSet())
    // given an array of numbers
    val arr = arrayOf(3,7,2,9)
    // get the third largest numbers
    // [ 3,7,2,9]
    // sort it
    //  arr = [2,3,7,9]
    // so how do I get the 3rd largest number
    // the 1st largest is arr.size - 1 = 4 - 1 = 3
    // the 2nd largest is arr.size - 2 = 4 - 2 = 2
    // the 3rd largest is arr.size - 3 = 4 - 3 = 1
    // so what are the possible things that can happen
    // 1. array is empty.
    if (arr.isEmpty()) {
        // return -1
    }
    // 2. there are duplicate numbers.
    // use the method sortedSet()
    // 3. there are all negative numbers.
    // to get the third element, the size of the array must not be less than 3
    if (arr.size < 3) {
        // return -1
    }
}

fun getThirdLargestNumber(arr: Array<Int>): Int {
    if (arr.size < 3) {
        return -1
    }
    // sort the array and remove the duplicate
    val isSortedNoDuplicate = arr.toSortedSet()
    // grab the third largest item
    val thirdLargestItem = isSortedNoDuplicate.elementAt(isSortedNoDuplicate.size - 3)
    return thirdLargestItem
}