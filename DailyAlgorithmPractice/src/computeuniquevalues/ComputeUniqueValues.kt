package computeuniquevalues

fun countUniqueValues(list: List<Int>): Int {
    // to count the unique items
    // count the unique keys as unique items
    var numberOfUniqueValues = 0
    // if the size of the array is zero return 0
    if (list.isEmpty()) {
        return 0
    }

    // loop through the list and map it in a map variable
    val mappedContent = mutableMapOf<Int, Int>()
    for (item in list) {
        if (!mappedContent.contains(item)) {
            mappedContent[item] = 1
        } else {
            mappedContent[item] = mappedContent.getValue(item).plus(1)
        }
    }
    return mappedContent.size
}