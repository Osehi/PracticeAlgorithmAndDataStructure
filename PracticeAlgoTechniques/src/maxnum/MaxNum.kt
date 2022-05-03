package maxnum

fun main(){

    var list = arrayListOf<Int>(9, 0, 7, 15)
    // get the maximum number
    // declare a variable maxNum
    var maxNum = 0
    // check by comparing all items if it is bigger or smaller
    list.forEach {
        if (it > maxNum){
            maxNum = it
        }
    }
    println("This is the largest number: ${maxNum}")
}