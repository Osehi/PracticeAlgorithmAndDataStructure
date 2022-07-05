package arrays

fun main(){
//    var lines = arrayListOf<Int>(1,2,3,4,5,6)
//    lines[0] = lines[5]
//    println(lines)
//    println("here is an output: ${lines.indexOf(1)}")

    check()
}

/**
 * this did not work as expected
 */
fun check(){
    var scores = arrayListOf<Int>(1, 2, 3, 4, 5)
    val rotateByIndexOfOne = 1
    var startPointForIndex = 0
    var scoreStartPoint = 0
    val scoresLength = scores.size
    var oldElement = 0

    // use two while loops
    while (startPointForIndex < rotateByIndexOfOne){
        // inner loop
        for (i in 0 until scores.size){
            if (i != (scoresLength - 1)){
                println("this is the scoreIndex content: ${i}")
                var indicator = i
                println("here is the indicator: ${indicator}")
                oldElement  = scores[indicator]
                println("oldElement content: ${oldElement}")
                scores[i + 1] = oldElement
            } else {
                scores[i - (scoresLength - 1)] = scores[scoresLength - 1]
            }
        }

        startPointForIndex++
    }

    println(scores)
}

