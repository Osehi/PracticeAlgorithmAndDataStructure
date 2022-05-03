package addbinary

fun main(){

    val a = "11"
    val b = "1"

    addBinary(a, b)

    /*
    val a = "11"
    val b = "1"
    // task : => sum the two variables and return the binary output
    // convert individually to integer
    // what is the length of the first given string
    var lenghtOfA = a.length

     */

}

fun addBinary(a: String, b: String): String {
    // get the length of String
    var lengthOfStringA = a.length - 1
    var lenghOfStringB = b.length - 1
    var carry = 0
    var result = ""

    while (lengthOfStringA >= 0 || lenghOfStringB >= 0){
        var sum = carry
        if (lengthOfStringA >= 0){
            sum += a[lengthOfStringA] - '0'
        }

        if (lenghOfStringB >= 0){
            sum += b[lenghOfStringB] - '0'
        }
        result += (sum % 2)
        carry = (sum /2)
        lengthOfStringA--
        lenghOfStringB--
    }
    if (carry != 0){
        result += carry
    }
    return result.reversed()
}