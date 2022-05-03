
fun main(){
    var bob = arrayListOf<Int>(0,1,0,1,0,1)
    var alice = arrayListOf<Int>(1, 0, 1, 1, 0, 1)

    numberOfTopics(bob, alice)
}

fun numberOfTopics(bob:ArrayList<Int>, alice:ArrayList<Int>){
    // count
    var count = 0
    // use a nested loop
    for(i in 0 until bob.size){

        for(j in 0 until alice.size){
            if(i == j){
                if(bob[i] == alice[j]){
                    count++
                }
            }
        }
    }
    println(count)
}