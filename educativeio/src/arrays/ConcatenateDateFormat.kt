package arrays

fun main() {
    // input "2022-09-01"
    // output "01/09/2022"

    val receivedDate = "2022-09-01"
    val dateCollection = receivedDate.split("-")
    val output = "${dateCollection[2]}/${dateCollection[1]}/${dateCollection[0]}"
    println("see the new output: ${output}")


    // input string == 30/08/2022
    // output string == 2022-08-30

    // split the date into an array
    val date = "31/08/2022"
    val arrayDateItems = date.split("/")
    println("see the output: ${arrayDateItems}")
    println("what is the type: ${arrayDateItems[0].javaClass}")
    val result = "${arrayDateItems[2]}-${arrayDateItems[1]}-${arrayDateItems[0]}"
    println("here is the output: ${result}")
    println("====================")
    println("Here is the output of the function: ${formatCurrentDate(date)}")
}

fun formatCurrentDate(receivedDate: String): String {
    val arrayDateItems = receivedDate.split("/")
    val result = "${arrayDateItems[2]}-${arrayDateItems[1]}-${arrayDateItems[0]}"
    return result
}