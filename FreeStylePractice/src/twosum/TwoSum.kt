package twosum

fun main(){
    // create an array to receive the indices
    var twoSumElementIndices = arrayListOf<Int>()
    //given
    val list = arrayListOf<Int>(2,7,11,15)
    // arrayListOf(2,7,11,15)
    val target = 9
    // the indices of the number that sum to be the target

    for (i in list.indices){

        for (j in list.indices){
            if (i == j){
                break
            }
            if ((list[i] + list[j]) == target){
                twoSumElementIndices.add(i)
                twoSumElementIndices.add(j)
            }
        }

    }
    println(twoSumElementIndices)
}