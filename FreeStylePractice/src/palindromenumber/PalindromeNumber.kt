package palindromenumber

fun main(){
    val x = 1221
    // if x is a palindrome return true.
    // get the last digit, by applying a modulus of 10
    val lastDigit = x % 10
    println("------")
    println(lastDigit)
    // to get the second to the last digit, divide x(1221) by 10
    println("===2nd to the last digit")
    val firstDivideXBy10 = x / 10
    val secondToDLastDigit = firstDivideXBy10 % 10
    println(secondToDLastDigit)
    // to get the reverse of the last half digit
    val reverseHalf = lastDigit * 10 + secondToDLastDigit
    println("show the reverse number")
    println(reverseHalf)
}

