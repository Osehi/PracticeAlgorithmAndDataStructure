package whiteboard.weektwo

fun main(){
    val listOne = arrayOf(-2,2,1)
    val listTwo = arrayOf(5, -6)
    countApplesAndOranges(7, 11, 5, 15, listOne, listTwo)
}

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    // Write your code here
    // get the actual landing distance for apples and oranges.
    var appleLandingDistance = arrayListOf<Int>()
    var orangeLandingDistance = arrayListOf<Int>()
    var computeAppleDistance = 0
    var computeOrangeDistance = 0
    // the number of apples and oranges in the marked distance
    var numberOfApplesInMappedDistance = 0
    var numberOfOrangesInMappedDistance = 0
    // do add operation on the items in the array
    for (apple in apples){
        computeAppleDistance = a + apple
        appleLandingDistance.add(computeAppleDistance)
        computeOrangeDistance = 0

    }

    for (orange in oranges){
        computeOrangeDistance = b + orange
        orangeLandingDistance.add(computeOrangeDistance)
        computeOrangeDistance = 0
    }

    for (items in appleLandingDistance){
        if (items >= s && items <= t){
            numberOfApplesInMappedDistance++
        }
    }

    for (items in orangeLandingDistance){
        if (items >= s && items <= t){
            numberOfOrangesInMappedDistance++
        }
    }
//   println("$numberOfApplesInMappedDistance , $numberOfOrangesInMappedDistance")
    println(numberOfApplesInMappedDistance)
    println(numberOfOrangesInMappedDistance)

}