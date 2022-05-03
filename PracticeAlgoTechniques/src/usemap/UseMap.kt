package usemap

fun main(){
    val list = arrayListOf<Int>(1,2,4,5)
    val result =  list.map {
        it * 2
    }
    println(result)
}