package generateallpairs

fun getAllPairs(n: Int): List<Pair<Int, Int>> {
    // I will use a nested loop to implement it
    // create a mutableListOf
    val allPairs = mutableListOf<Pair<Int, Int>>()
    for (i in 0..n) {

        for (j in 0..n) {
            // add the pair to a list
            // declare a variable for the Pair creation
            var createdPair = Pair(i, j)
            allPairs.add(createdPair)
        }
    }
    return allPairs
}