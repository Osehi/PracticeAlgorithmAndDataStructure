package palindrome

fun main(){
    var word = "-121"
    var left = 0
    var right = word.length - 1
    println("the length of word is ${right}")
    var num = 121
    var newString = num.toString()

    while (left <= right){
//        if (word[left] != word[right]){
//            println("false, not a palindrome")
//            left++
//            right--
//
//        } else {
//            continue
//            left++
//            right--
//        }
//        println("this is right ---------------")
//        println(word[right])
//        println("println left----------------------- below")
//        println(word[left])
//        right--
//        left++
        if (word[left] != word[right]){
            println("Not a palindrome")
        } else {
            println("is a Palindrome")

        }
        right--
        left++

    }
    println("true, is a palindrome")
}