package getminimum

fun main(){
    val list = arrayListOf<Int>(7,1,5,3,6,4)
//    getMinimumNumber(list)
   val result =  maxProfit(list)
    println(result)
}

fun getMinimumNumber(arr: ArrayList<Int>){
    var minNum = Integer.MAX_VALUE
    for (i in arr.indices){
        if (arr[i] < minNum){
            minNum = arr[i]
        }
    }
    println(minNum)
}

fun maxProfit(arr:ArrayList<Int>): Int {
    var max = 0
    var min = Integer.MAX_VALUE
    for (i in arr.indices){
        if (arr[i] < min){
            min = arr[i]
        } else {
            max = Math.max(max, arr[i] - min)
        }
    }
    return max
}