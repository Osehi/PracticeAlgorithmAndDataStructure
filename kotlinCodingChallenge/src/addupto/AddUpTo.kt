package addupto

fun addUpTo(n: Int): Int {
    var sum = 0
    if (n == 1) {
        sum += n
    } else {
        for (num in 1..n) {
            sum += num
        }
    }
    return sum

}