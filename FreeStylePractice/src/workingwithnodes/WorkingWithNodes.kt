package workingwithnodes

fun main(){
    val firstNode = Node(1)
    val secondNode = Node(2)

//    println(firstNode.create(secondNode))
    val result = 7 % 10
    println(result)

    // now create a linked list
}

class Node(val data: Int) {
    var next: Node? = null

    // create linked list
    fun create(item:Node){
        // the linking is possible due to the next-property
        while (item != null){
            // check if it has a next
            var head: Node? = null
            if (item.next == null){
                head = item
            } else {
                if (head != null) {
                    head.next = item
                }
            }
            println(head)
        }
//        println(head)
    }

    override fun toString(): String {
        return ""
    }

}