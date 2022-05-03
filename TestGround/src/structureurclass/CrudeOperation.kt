package structureurclass

import java.util.Objects


interface CrudeOperation {

    fun addContact(myContact: Contact) : Nothing  // return a Task<Void>

    fun update(key:String, contactInfo:HashMap<String, Objects>) : Nothing  // return a Task<Void>

    fun delete(key: String): Nothing  // return a Task<Void>

    fun read() : Nothing  // returns a Query

}