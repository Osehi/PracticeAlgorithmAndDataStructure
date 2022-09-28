package formattrainroute

fun formatTrainRouteNotCompleteSolution(stations: List<String>): String {
    // the variable that holds the concatenation
    var formatTrainRouteOfStation = "Train is calling at"
    var stationNameSize = stations.size
    for (station in stations) {
        when(stationNameSize) {
            1 -> {
                formatTrainRouteOfStation += " ${station}"
            }
            2 -> {
                formatTrainRouteOfStation += " ${station}"
            }

        }
    }
    return formatTrainRouteOfStation
}

// I agree with this solution
fun formatTrainRoute(stations: List<String>): String {
    var res = ""
    stations.forEach { station ->
        res += when(station) {
            stations.first() -> station
            stations.last() -> " and ${station}"
            else -> ", ${station}"
        }
    }
    return "Train is calling at ${res}"
}