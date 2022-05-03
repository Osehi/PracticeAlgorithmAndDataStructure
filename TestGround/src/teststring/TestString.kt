package teststring

fun main(){
    var sentence = "Hello World"
    // get the last word
    // iterate from behind
    var count = 0
    for(i in sentence.length - 1 downTo(0)){
       println(sentence[i])
    }
}

fun testString(){
    var strs = "osehi"
    // to extract the first letter and make it a capital letter.
    val firstLetter = strs.substring(0, 1)
    println(firstLetter.toUpperCase())
}