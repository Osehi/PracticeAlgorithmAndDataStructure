package arrays

fun main(){
    // use count of 1 to 2
    // get max , increment count, remove that element from the array
    val scores = arrayListOf<Int>(1, 2, 3, 4, 5)
    var count = 1
    var max = 0
    var min = 0
    var newArray = arrayListOf<Int>()
    for (i in scores.indices){
        when(count){
            1 -> {
                max = getMax(scores)
                scores.removeAt(i)
                newArray.add(max)
                count++
            }
            2 -> {
                min = getMin(scores)
                scores.removeAt(i)
                newArray.add(min)
                count = 1
            }
        }
    }
    println("Print out the reaaranged sorted array: ${newArray}")
//    val result = getMax(scores)
//    println("The result is : ${result}")
//    val theMin = getMin(scores)
//    println("The minimum result is ${theMin}")

}

fun getMax(arr:ArrayList<Int>): Int{
    var max = Integer.MIN_VALUE
    for (item in arr){
        if (item > max){
            max = item
        }
    }
    return max
}

fun getMin(arr:ArrayList<Int>): Int{
    var min = Integer.MAX_VALUE
    for (item in arr){
        if (item < min){
            min = item
        }
    }
    return min
}