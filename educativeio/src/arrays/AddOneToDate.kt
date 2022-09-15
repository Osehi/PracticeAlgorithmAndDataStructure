package arrays

fun main() {
    val date = "2022-09-02"
    val arrayDateItems = date.split("-")
    val firstItem = arrayDateItems[0].toInt()
    val secondItem = arrayDateItems[1].toInt()
    val thirdItem = arrayDateItems[2].toInt()
    println(arrayDateItems[0].javaClass.name)
    println(firstItem)
    println(secondItem)
    println(thirdItem)

    println("--- see the output here")
    val output = addOneDayToEndDate(date)
    println("see result: ${output}")
}

fun addOneDayToEndDate(date: String): String {
    val arrayDateItems = date.split("-")
    val firstItem = arrayDateItems[0].toInt()
    var secondItem = arrayDateItems[1].toInt()
    var thirdItem = arrayDateItems[2].toInt()
    // months that are only 30days, september(9), april(4), june(6), november(11)
    val april = 4
    val june = 6
    val september = 9
    val november = 11
    val february = 2
    val january = 1
    val march = 3
    val may = 5
    val july = 7
    val august = 8
    val october = 10
    val december = 12
    var result = ""
    var concatenateThirdItem = ""

    if ((secondItem == april || secondItem == june || secondItem == september || secondItem == november) && (thirdItem == 30)) {
        // if the day is 30, set the month to next month by increasing it by 1
        secondItem++
        thirdItem = 1
        // convert to String
        firstItem.toString()
        secondItem.toString()
        thirdItem.toString()
        if ("${thirdItem}".length <= 1) {
            concatenateThirdItem = "0${thirdItem}"
        } else {
            concatenateThirdItem = "${thirdItem}"
        }

        if ("${secondItem}".length <= 1) {
            result = "${firstItem}/0${secondItem}/${concatenateThirdItem}"
        } else {
            result = "${firstItem}/${secondItem}/${concatenateThirdItem}"
        }
    } else if (secondItem == february && (thirdItem == 28)) {
        secondItem++
        thirdItem = 1
        if ("${thirdItem}".length <= 1) {
            concatenateThirdItem = "0${thirdItem}"
        } else {
            concatenateThirdItem = "${thirdItem}"
        }

        if ("${secondItem}".length <= 1) {
            result = "${firstItem}/0${secondItem}/${concatenateThirdItem}"
        } else {
            result = "${firstItem}/${secondItem}/${concatenateThirdItem}"
        }
    } else if (secondItem == february && (thirdItem == 29)) {
        secondItem++
        thirdItem = 1
        if ("${thirdItem}".length <= 1) {
            concatenateThirdItem = "0${thirdItem}"
        } else {
            concatenateThirdItem = "${thirdItem}"
        }

        if ("${secondItem}".length <= 1) {
            result = "${firstItem}/0${secondItem}/${concatenateThirdItem}"
        } else {
            result = "${firstItem}/${secondItem}/${concatenateThirdItem}"
        }
    } else if (secondItem == january || secondItem == march || secondItem == may || secondItem == july || secondItem == august || secondItem == october || secondItem == december && (thirdItem == 31)) {
        secondItem++
        thirdItem = 1
        if ("${thirdItem}".length <= 1) {
            concatenateThirdItem = "0${thirdItem}"
        } else {
            concatenateThirdItem = "${thirdItem}"
        }

        if ("${secondItem}".length <= 1) {
            result = "${firstItem}/0${secondItem}/${concatenateThirdItem}"
        } else {
            result = "${firstItem}/${secondItem}/${concatenateThirdItem}"
        }
    } else {
        thirdItem++
        if ("${thirdItem}".length <= 1) {
            concatenateThirdItem = "0${thirdItem}"
        } else {
            concatenateThirdItem = "${thirdItem}"
        }

        if ("${secondItem}".length <= 1) {
            result = "${firstItem}/0${secondItem}/${concatenateThirdItem}"
        } else {
            result = "${firstItem}/${secondItem}/${concatenateThirdItem}"
        }

    }
    return result
}