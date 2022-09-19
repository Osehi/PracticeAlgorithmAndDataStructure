package addupto


fun main() {
    println(addUpToNew(2))
}

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

fun addUpToNew(n: Int): Int {
    if(n == 1){
        return 1
    }
    return n + addUpToNew(n - 1)
}