package linearsearch

fun getIndex(list: List<String>, str: String): Int {
    // check for the index of the given string in the list
    for (i in list.indices) {
        if (list[i] == str) {
            return i
        }
    }
    return -1
}
// a nice method
fun getIndexMethodTwo(list: List<String>, str: String): Int {
    list.forEachIndexed { index, element ->
        if (element == str) {
            return index
        }
    }
    return -1
}