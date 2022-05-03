package structureurclass

import java.util.*
import kotlin.collections.HashMap

class MyDatabase() : CrudeOperation {

    val databaseReference = Storage()

    override fun addContact(myContact: Contact): Nothing {
        TODO("Not yet implemented")
        databaseReference.javaClass
    }

    override fun update(key: String, contactInfo: HashMap<String, Objects>): Nothing {
        TODO("Not yet implemented")
    }

    override fun delete(key: String): Nothing {
        TODO("Not yet implemented")
    }

    override fun read(): Nothing {
        TODO("Not yet implemented")
    }


}



fun main(){

}

class Storage() {

}