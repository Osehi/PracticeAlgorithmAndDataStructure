package generatepyramid

fun main() {
    createPyramid(2)
}


fun generatePyramid(n: Int): List<String> {
    // generate a pyramid
    return emptyList()
}

fun createPyramid(n: Int) {
    for (i in 0 until n) {
        for(j in 0 until n) {
            println("#")
        }
    }
}