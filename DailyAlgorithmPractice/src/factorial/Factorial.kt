package factorial

fun factorial(n: Int): Int {
    if (n == 0 || n == 1) {
        return 1
    }
    // evaluate
    var evaluate = 1
    for (i in n downTo 1) {
        evaluate *= i
    }
    return evaluate
}