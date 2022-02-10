package ispalindrome

fun main(){
    val quote = " "
    isPalindrome(quote)
}

fun isPalindrome(s:String){
    // check length of the string
    val lengthOfString = s.length
    println("The length of the given string is $lengthOfString")
    // a.
    // check for an empty space

    // check if the size of the string is 1
    // if empty and size is 1, return true.
    if (s.length == 1 && s.contains(" ")){
        println("The given string has a space as a content")
        println("Is a palindrone")
    }
    // ----- ----
    // b.
    // remove all non-alpha numeric characters
    // convert all char to lowercase.
    // remove all commas, spaces
    // c.
    // returb the answer
}