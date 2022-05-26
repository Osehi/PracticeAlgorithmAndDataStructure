package twodimensionalarray

fun main(){

    implementTwoDimensionalArray()

    var sample = IntArray(4){1}
    for (i in sample){
        print(i)
        print(" ")
    }

    // create a two dimensional array
    val list = Array<Int>(2){2}
    println("-- print items")
    println(list[0])
    println("-- next 1---")
    println(list[1])
    println("--- next 2 ---")
    println("the size of the array is ${list.size}")

    IntArray(2)
    println("--print out two dimensional array")
//    anotherWayToCreateTwoDimensionalArray()
    twoDimenArray()
}

/**
 * this is an implementation of a two dimensional array
 */
fun implementTwoDimensionalArray(){
    var num = 10
    var twoD = Array(4, {IntArray(3)})
    for (i in 0..twoD.size - 1){
        var colArray = IntArray(3)
        for (j in 0..colArray.size - 1){
            colArray[j] = num++
        }
        twoD[i] = colArray
    }
    for (colArray in twoD){
        for (j in colArray){
            print(j)
            print(" ")
        }
        println("")
    }

}

/**
 * explains how the two dimensional array came about
 */
fun twoDimenArray(){
    var num = 10
    var twoD = Array(4, {IntArray(3)})

    for (colArray in twoD){
        for (j in colArray){
            print(j)
            print(" ")
        }
        println("")
    }
}

fun twoDimensionalArray(){
    // a 3 by 4 array
    val rows = 3
    val coloums = 4

    val threeByFour = Array(rows){IntArray(coloums)}

    var calendar = Array(10){}
    for(i in calendar.indices){
//        calendar[i] = IntArray(10)
    }
}

fun anotherWayToCreateTwoDimensionalArray(){
    var twoD = Array(4, {IntArray(3)})
    var num = 10
    for (i in 0..twoD.size -1){
        val colArray = IntArray(3)
        for (j in 0..colArray.size - 1){
            colArray[j] = num++
        }
        twoD[i] = colArray
    }
    println(twoD.toMutableList())
}