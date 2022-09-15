package newlinkedlist

data class Node<T>(var value:T, var next: Node<T>? = null){

    override fun toString(): String {
        return if (next != null){
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}

fun main(){
    val node1 = Node<Int>(1)
    val node2 = Node<Int>(2)
    node1.next = node2
    println(node1)
    val node3 = Node<String>("Lagos")
    val node4 = Node<Int>(4)
    // so link the new node
    // what I just saw now, is that the creation of the node is a different activity from linking of the node
    // to link the node, I used the "next' property
    // I had to check the "next"-property if it is empty
    // now I see why size is important in the linkedlist.
    // the more you add to the list the greater the size, hence, it increases in size
    // hence I can understand the two properties of a linkedlist => availability of a "Node", then the number of "Node" determine the size
    node2.next = node4
    println("Here is the node: ${node1}")
}