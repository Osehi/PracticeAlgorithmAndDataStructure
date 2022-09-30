package product

fun product(list: List<Int>): Int {
    // return the product of all the items in the list
    var compute = 1
    if (list.isEmpty()) {
        return 0
    }
    for (item in list) {
        compute *= item
    }
    return compute
}