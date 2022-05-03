package practiceconcept


fun main(){
    var list = arrayListOf<Int>(2, 7, 11, 15)
    var target = 9
    // create an array to store the respective index
    var capturedIndex = arrayListOf<Int>()

    for (i in list.indices){
        for (j in 1 until list.size){
            if ((list[i] + list[j]) == target){
                capturedIndex.add(i)
                capturedIndex.add(j)
            }

        }

    }
    println(capturedIndex.toIntArray())

}