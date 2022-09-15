package playground

enum class Sport { HIKE, RUN, TOURING_BICYCLE, E_TOURING_BICYCLE }

data class Summary(val sport: Sport, val distance: Int)

fun main() {
    val sportStats = listOf(Summary(Sport.HIKE, 92),
        Summary(Sport.RUN, 77),
        Summary(Sport.TOURING_BICYCLE, 322),
        Summary(Sport.E_TOURING_BICYCLE, 656))

    // Write kotlin code to print the top sport by distance excluding eBikes.
    // here is the list of sport excluding eBikes
    val list = sportStats.filter {
        it.sport.name != "E_TOURING_BICYCLE"
    }
    // println()
    val allDistance = list.map {
        it.distance
    }

    var newList = list.sortedByDescending { sport ->
        sport.distance
    }
    newList.forEach { sport ->
        println(sport.sport)
    }

    println("---------- Sunday -------")
//    println(newList)
//    val sortedDistance = allDistance.sorted()
//    var lengthOfAllDistance = sortedDistance.size
//    for (i in (lengthOfAllDistance -1) downTo 0){
////        if (list[i].distance == sortedDistance[i]){
////            println(list[i].sport.name)
//        println(sortedDistance[i])
////        }
//    }
////    println(allDistance.sorted())
////    println("-------------")
//    println(list)
//    // put this into a map
//    var sportingDistance = hashMapOf<String, Int>()
//    for (item in list){
//        sportingDistance.put(item.sport.name, item.distance )
//    }
//    println(sportingDistance)
//    println("++++++++++++++++++++++++")
//    val sortedMap = sportingDistance.toSortedMap(compareByDescending {it})
//    println("Here is the sorted: ${sortedMap}")
//    // sort the map by values
//    val output = sportingDistance.toList().sortedBy { (_, value) -> value }.toMap()
//    println(output)
//    for ((key, value) in output){
//        println(value)
//    }

    // TBC
}