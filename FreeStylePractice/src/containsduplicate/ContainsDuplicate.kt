package containsduplicate

/**
 * Monday, 9-May-2022
 * use a map to identify the duplicate occurence
 */
fun main(){

}

fun containsDuplicate(nums: IntArray): Boolean {
    // use a map
    var itemOccurence = mutableMapOf<Int, Int>()
    // loop through the given array
    for (item in nums){
        // check if item exist in itemOccurence
        if (itemOccurence.contains(item)){
            itemOccurence[item] = itemOccurence.getValue(item).plus(1)
        } else {
            itemOccurence[item] = 1

        }
    }

    // loop through the map
    for ((key, values) in itemOccurence){
        // check if the values is 2 or greater than two
        if (values == 2 || values > 2){
            return true
        }
    }
    return false
}