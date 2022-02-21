package whiteboard

/**
 * TBC
 * 16-Feb-2022
 */
fun main(){
    val birdID = arrayListOf<Int>(1,1,2,2,3)
    val birdIDMap = mutableMapOf<Int, Int>(1 to 0, 2 to 0, 3 to 0, 4 to 0, 5 to 0)
    // loop through the map
    var count = 0
    for ((key, value) in birdIDMap.entries){
        if (birdID.contains(key)){

        }
    }
}


fun trialOne(){
    val birdID = arrayListOf<Int>(1,1,2,2,3)
    val birdIDMap = mutableMapOf<Int, Int>(1 to 0, 2 to 0, 3 to 0, 4 to 0, 5 to 0)
    // loop through the array
    for (item in birdID){
        if (birdID.contains(birdIDMap[item])){
            // if true, increment
            birdIDMap[item] = birdIDMap.getValue(item) + 1
        } else {
            continue
        }
    }
    println(birdIDMap.get(1))
    println(birdIDMap)
    println(birdIDMap.getValue(1))
    println(birdIDMap[1])
}