package countdown

fun countDown(n: Int): List<Int> {
    // create a list
    val list = mutableListOf<Int>()
    for (item in n downTo 0) {
        list.add(item)
    }
    return list
}