

class CreateArray(var length: Int, var data:Int) {

    fun get(index:Int): Int{
        return this.data
    }

    fun add(item:Int){
        // the data to add
        this.data = item
        this.length++
    }


    override fun toString(): String {
        return "[${this.length} , ${this.data}]"
    }

}




fun main(){
    val list = CreateArray(0, 1)
    list.add(5)
    list.add(8)
    println(list)
}