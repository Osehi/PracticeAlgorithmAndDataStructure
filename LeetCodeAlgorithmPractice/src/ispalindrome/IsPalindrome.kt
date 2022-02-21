package ispalindrome

fun main(){
    val quote = "A man, a plan, a canal: Panama"
    val newWord = "race a car"
//    println(isPalindromeTwo(newWord))
//    isPalindromeOne(quote)
    println(isPalindrome(quote))

}

fun isPalindrome(s:String): Boolean{
    var leftPointer = 0
    var rightPointer = s.length - 1
    // remove the spaces, non-alphanumeric
    // check if all character is letter or digit
    // the concatenate
    var noNonAlphanumeric = ""
    for (item in s){
        if (item.isLetterOrDigit()){
            noNonAlphanumeric += item
        }
    }
    // convert it to lowercase
    var lowercaseNonAlphanumeric = noNonAlphanumeric.toLowerCase()
    // loop through the string by comparing
    // what is the condition
    while (leftPointer <= rightPointer){
        if (lowercaseNonAlphanumeric[leftPointer] != lowercaseNonAlphanumeric[rightPointer]){
            return false

        }
        leftPointer+= 1
        rightPointer-= 1
    }
    println(noNonAlphanumeric)
    println(lowercaseNonAlphanumeric)

    return true
}

fun isPalindromeTwo(s:String): Boolean {
    var i = 0
    var j = s.length - 1
    // check if the character
    while (i < j){
        // check the left handside
        while (i < j && !s[i].isLetterOrDigit()){
            i++
        }
        // check the right handside
        while (i < j && !s[j].isLetterOrDigit()){
            j--
        }
        // check if the the character i and j are equal
        if (i < j && s[i++].toLowerCase().isLetterOrDigit() != s[j--].toLowerCase().isLetterOrDigit()){
            return false
        }
    }
    return true
}

fun isPalindromeOne(s:String) {
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
//        return true
    }
    // ----- ----
    // b.
    // using a forloop to access the items and check if the items is a space, comma,
    // then concatenate
    var newString = ""
    for (item in s){
        // check for a space, comma
        item.isLetterOrDigit()
        if (item == ' ' || item == ',' || item == '.' || item == ';' || item == ':'){
            continue
        }
        newString += item
    }
    var lowerCaseVariable = newString.toLowerCase()
    var isReversedString = lowerCaseVariable.reversed()
    if (lowerCaseVariable == isReversedString){
        println("The String a Palindron")
    }
    // remove all non-alpha numeric characters
    // convert all char to lowercase.
    // remove all commas, spaces
    // c.
    // returb the answer
//    return true
    println(newString)
    println(isReversedString)
    println(lowerCaseVariable)
}