package lengthoflastword

fun main(){
    println(lengthOfLastWord("osehi one"))
}


fun lengthOfLastWord(s: String): Int {
    // initialize a count variable
    var count = 0
    // check if given string is empty, then return zero
    if(s.length == 0){
        return count
    }

    var currentStringPosition = s.length - 1

    // when current string position is empty ' ' them decreament.
    // if the current string position is not empty, the break out
    while(currentStringPosition >= 0){

        if(s[currentStringPosition] != ' '){
            break
        }
        currentStringPosition--
    }

    // when the character is available, increament count
    // break out when an empty character is detected
    for(i in currentStringPosition downTo 0){

        if(s[i] == ' '){
            break
        }
        count++
    }

    return count

}