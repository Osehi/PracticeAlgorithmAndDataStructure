package workingwithobject

open class Father(val name: String) {
  init  {
        println("Peace")
    }
}

class Son(name: String) : Father(name){

}









fun main(){
//    val daddy = Father("Ehilen")
//    println(daddy.name)
    println("----------")
    val son = Son("Kemi")
    println(son.name)
}

