package newlinkedlist

class LinkedList<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    fun getSize():Int{
        return this.size
    }

    fun getTail(): Node<T>?{
        return this.tail
    }

    override fun toString(): String {
        if (isEmpty()){
            return "Empty list"
        } else {
            return head.toString()
        }
    }

    /**
     * push operation
     * head-first insertion
     */
    fun push(value: T): LinkedList<T> {
        head = Node(value = value, next = head)
        if (tail == null){
            tail = head
        }
        size++
        return this
    }

}

fun main(){
    val list = LinkedList<Int>()

    list.push(1).push(2).push(3)
    println("What is the outcome: ${list.isEmpty()}")
    println("Return the size of the linkedList: ${list.getSize()}")
    println("Print the linkedlist: ${list}")
}