package migratorybird

fun main(){
    /*
    var myName ="Osehi"
    println(myName.elementAt(2))
    var empty = ""
    println(empty.isEmpty())

     */
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

fun breakingRecords(scores: Array<Int>): Array<Int> {
    // Write your code here
    // Initialize an array to hold the min and max times record was broken
    var record = Array(2){0}
    // Set Initial Max and Min to the first element in the array
    var initialMax = scores[0]
    var initialMin = scores[0]
    for ( i in 1..scores.lastIndex){
        when{
            // check for each scores if greater than or less than initialMax or initialMin respectively and increment counter if so
            scores[i] > initialMax -> {
                record[0]++
                initialMax = scores[i]
            }
            scores[i] < initialMin -> {
                record[1]++
                initialMin = scores[i]
            }
        }
    }
    return record

}


// WEEK 5 MON 2
/**
 * Migratory Birds
 * Description  of the Task can be seen in the Link below
 * https://www.hackerrank.com/challenges/migratory-birds/problem
 */

fun migratoryBirds(arr: Array<Int>): Int {
    // Declare an hashMap to hold the birdType as key and the frequency of occurrency as the value
    val sightingsCount = hashMapOf<Int,Int>()

    var leastBirdTypeWithHighestCount = 0
    var frequency = 0

    // Use destructing declarations to give each item in the array descriptive names
    var (birdType1,birdType2,birdType3,birdType4,birdType5) = Array(5){0}

    // Loop through the array of occurence, determine which birdType it is, increment and assign to its respective key
    for (i in arr){
        when(i){
            1-> {
                birdType1++
                sightingsCount[1] = birdType1
            }
            2-> {
                birdType2++
                sightingsCount[2] = birdType2
            }
            3-> {
                birdType3++
                sightingsCount[3] = birdType3
            }
            4-> {
                birdType4++
                sightingsCount[4] = birdType4
            }
            5-> {
                birdType5++
                sightingsCount[5] = birdType5
            }
        }
    }

    // Loop through the keys which is the birdType(1,2,3,4,5), get the frequency which is the value and compare
    for (i in sightingsCount.keys){
        if(sightingsCount[i]!! >frequency){
            frequency = sightingsCount[i]!!
            // If true set birdType as that with the leastHighestCount
            leastBirdTypeWithHighestCount = i
        }
    }
    return leastBirdTypeWithHighestCount
}