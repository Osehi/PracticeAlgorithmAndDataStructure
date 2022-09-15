package arrays

fun main(){
    val scores = arrayListOf<Int>(1,2,3,4)
    // ( 1,2,3,4)
    val productOfItems = mutableListOf<Int>()
    var product = 1
    // use a for loop
    for (i in 0 until scores.size){

        for (j in 0 until scores.size){
            if (i == j){
                continue
            } else {
                product *= scores[j]
            }

        }
        productOfItems.add(product)
        product = 1
    }
    println(productOfItems)
    // to be check it

    // output: [24, 12, 8, 6]

}