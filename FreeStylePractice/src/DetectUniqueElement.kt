import kotlin.math.absoluteValue

fun main(){

    val itemList = intArrayOf(1,1,2,2,3,3,4,5,5,6)
    val newList = intArrayOf(9,9,2,3,3,3,4,4,10,10,6)
    val stateList = intArrayOf(10,10,90,90,30,45,45,6,6,6,6,6,6,1)
//    val result = returnUniques(itemList)
//    println("Here is the result: ${result}")
    returnUniques(itemList)
    returnUniques(newList)
    returnUniques(stateList)
    val myMap = mutableMapOf<String, Int>()
    myMap.put("Rice", 2)
    myMap.put("Beans", 7)
    println(myMap["Rice"])
    // increment rice to 1
//    myMap["Rice"] = myMap["Rice"]?.absoluteValue?.plus(1)
    for ((key, value ) in myMap){
//        println("Here are the keys: ${key}")
//        println("Here are the values: ${value}")
        if (value == 7){
            println("The key is : ${key}")
        }
    }

}

fun returnUniques(arr: IntArray): IntArray{
    // create a map
    var map = mutableMapOf<Int, Int>()
    // create an array to hold the unique elements
    var list = mutableListOf<Int>()
    // loop through the given array
    for (elem in arr){
        // check if the elem is present in the mao
        if(!map.contains(elem)){
            map[elem] = 1
        } else {
            map[elem] = map.getValue(elem).plus(1)
        }
    }
    // loop through the map
    for ((key , value ) in map){
        if (value == 1){
            list.add(key)
        }
    }


  return list.toIntArray()
}