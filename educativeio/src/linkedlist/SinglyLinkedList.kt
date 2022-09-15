package linkedlist

class SinglyLinkedList<T>(var headNode:Node<T>, var size:Int) {


    fun isEmpty(): Boolean {
        if (headNode == null){
            return true
        }
        return false
    }

    fun insertAtHead(data: T){
        val newNode = Node<T>(data)
        newNode.nextNode = headNode
        headNode = newNode
        size++
    }

}