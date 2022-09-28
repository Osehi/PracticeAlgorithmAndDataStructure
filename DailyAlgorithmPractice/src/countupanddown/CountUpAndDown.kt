package countupanddown

fun main() {
    println(countUpAndDown(3))
}
fun countUpAndDown(n: Int): List<Int> {
    // create an empty list
    val allCount = mutableListOf<Int>()
    for (item in 0..n) {
        allCount.add(item)
    }
    // count down
    for (item in n -1 downTo 0) {

            allCount.add(item)

    }
    return allCount
}