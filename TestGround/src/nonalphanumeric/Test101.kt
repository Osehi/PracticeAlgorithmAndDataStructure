package nonalphanumeric
// nonalphanumeric
fun main() {
    var str = "Hello !!!πworld @1233*@@():)πππ"

    val re = "[^A-Za-z0-9 ]".toRegex()
    println("Here is what is in re $re")
    str = re.replace(str, "")
    println("This is what is in str $str")

    println(str)
}