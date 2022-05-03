package lastword

fun main(){
    var expression = "   fly me   to   the moon  "
    var count = 0
    // to concatenate the last word
    var lastWord = ""
    var lastIndex = expression.length - 1
    // start from behind
    for (i in lastIndex downTo 0 ){
        if (expression[i].isLetter()){
            lastWord += expression[i]
        } else {
            break
        }

        for(j in i downTo(0)){
            if (!expression[j].isLetter()){
                continue
            } else {
                break
            }
        }
    }

    
    println(lastWord.length)
}