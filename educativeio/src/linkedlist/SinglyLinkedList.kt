package linkedlist

class SinglyLinkedList<T>(val headNode:Node<T>, val size:Int) {


    fun isEmpty(): Boolean {
        if (headNode == null){
            return true
        }
        return false
    }

}