package arrays

fun main(){
    var scores = arrayListOf<Int>(10, -1, 20, 4, 5, -9, -6)
    var j = 0
    for (i in scores.indices){
        // capture the negative numbers
        if (scores[i] < 0){
            if (i != j){
                var temp = scores[i] // the negative have been stored here
                scores[i] = scores[j]
                scores[j] = temp

            }
            j++
        }
    }
    println("here is the rearrange array: ${scores}") // [-1, -9, -6, 4, 5, 10, 20]
}

fun methodOne(){
    var temp = 0
    var scores = arrayListOf<Int>(10, -1, 20, 4, 5, -9, -6)
    // use a nested loop to rearrange them
    for (i in scores.indices){
        for (j in scores.indices){
            // use the swap conceptscores.size - 2
            if (j < scores.size - 2){

                if (scores[j] > scores[j + 1] ){
                    temp = scores[j]
                    scores[j] = scores[j + 1]
                    scores[j + 1] = temp
                } else {
                    continue
                }
            }
        }
    }
    println("here is the array: ${scores}")
}

