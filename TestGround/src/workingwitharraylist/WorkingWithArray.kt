package workingwitharraylist

fun main(){
    var players = arrayListOf<String>()
    // this is creation
    players.add("Ahmend")
    players.add("Idris")
    println(players)
    // removing
//    players.remove("Ahmend")
//    players.removeAt(0)
    // what is the output
    println("---------")
    println(players)
    println("+++++++++++")
    println(players[0])
    // remove admend from the collection
    players.remove(players[0])
    println("_________ element ______ is______ now ______ removed")
    println(players)
}