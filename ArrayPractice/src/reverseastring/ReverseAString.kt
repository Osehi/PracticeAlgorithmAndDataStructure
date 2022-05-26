package reverseastring

/**
 * merged two sorted array in kotlin
 */
fun main(){

    // 0,3,4,31  ||  4,6,30
    /*
    val list = arrayListOf<Int>()
    list.add(1)
    println(list[0])
    println(list)
    arrayListOf<Int>(0, 3, 4, 31)

     */
    val list1 = Array<Int>(4){0}
    list1[0] = 0
    list1[1] = 3
    list1[2] = 4
    list1[3] = 31
    val list2 = Array<Int>(3){0}
    list2[0] = 4
    list2[1] = 6
    list2[2] = 30
    mergeSortedArrays(list1, list2)
}

fun mergeSortedArrays(arr1:Array<Int>, arr2:Array<Int>){
    // state the algorithm
    // create a new array of size arr1.sizw + arr2.size
    val sizeOfNewArray = arr1.size + arr2.size
    var mergedSortedArray = Array<Int>(sizeOfNewArray){0}
    var arr1Position = 0
    var arr2Position = 0
    var mergedSortedArrayPosition = 0
    val arr1Size = arr1.size
    val arr2Size = arr2.size
    // get the length of arr1, arr2
    // get the position of arr1, arr2
    while (arr1Position < arr1Size && arr2Position < arr2Size){
        if (arr1[arr1Position] < arr2[arr2Position]){
            // assign the number
            mergedSortedArray[mergedSortedArrayPosition++] = arr1[arr1Position++]
        } else {
            mergedSortedArray[mergedSortedArrayPosition++] = arr2[arr2Position++]
        }
    }

    while (arr1Position < arr1Size){
        mergedSortedArray[mergedSortedArrayPosition++] = arr1[arr1Position++]
    }

    while (arr2Position < arr2Size){
        mergedSortedArray[mergedSortedArrayPosition++] = arr2[arr2Position++]
    }

    println(mergedSortedArray.toList())
    // output:: [0, 3, 4, 4, 6, 30, 31]

}

fun reverseAString(){
    val statement = "Hi, My name is Andrei"
    var newStatement = ""
    // I will concatenate in a reverse order , using loop
    var sizeOfStatement = statement.length - 1
    for (i in sizeOfStatement downTo 0){
        newStatement += statement[i]
    }
    println(newStatement)
    // ierdnA si eman yM ,iH
}