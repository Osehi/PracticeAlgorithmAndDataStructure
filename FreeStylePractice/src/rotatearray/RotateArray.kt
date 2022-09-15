package rotatearray

fun main(){
    // To Be Continued
    // This is Rotating From Left
    // if it is to rotate from left
    // the range will be; 0, 1, 2, 3, 4, 5
    // the last index will be the first element

    var list = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7) // 0,1,2,3,4,5,6
    val d = 2
    var startRotating = 0
    while (startRotating < d){
        var firstElement = list[0]
        for (i in 0..list.size - 2){ // range 6 to 1 , last item to the 2nd item => this is to the right
            list[i] = list[i + 1] //
        }
        list[list.size - 1] = firstElement
        startRotating++
    }
    println("Here is my rotated list: ${list}")
    // here is the output: => [3, 4, 5, 6, 7, 1, 2]

}

fun rotateToTheRight() {
    var list = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7) // 0,1,2,3,4,5,6
    val d = 2
    var startRotating = 0
    while (startRotating < d){
        var lastElement = list[list.size - 1]
        for (i in list.size - 1 downTo 1){ // range 6 to 1 , last item to the 2nd item => this is to the right
            list[i] = list[i - 1]
        }
        list[0] = lastElement
        startRotating++
    }
    println("Here is my rotated list: ${list}")
    // here is the output: => [6, 7, 1, 2, 3, 4, 5]
}