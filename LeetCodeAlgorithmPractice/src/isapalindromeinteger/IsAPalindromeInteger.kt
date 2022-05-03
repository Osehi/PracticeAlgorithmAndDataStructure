package isapalindromeinteger

fun main(){
    println(isPalindrome(10))
}

/**
 * March 1, 2022
 * works well
 */
fun isPalindrome(x: Int): Boolean {
    // use a pointer method ( 2-pointer )
    // convert the int to string
    var inAStringFormat = x.toString()
    // use a while loop
    var left = 0
    var right = inAStringFormat.length - 1
    while (left < right){
        if (left < right && inAStringFormat[left] != inAStringFormat[right]){
            return false
        }
        left++
        right--
    }
    return true
}