package oopconcept

class Piper: Wrestle(), Favourites, Will {

    override fun themeSong(): String {
        return "I Believe I Can Fly"
    }

    override fun Car(): String {
        return "Rolls Royce "
    }

    override fun language(): String {
        return "English"
    }

    override fun firstChild(): String {
        return "Atlanter Estate is yours"
    }

    override fun wife(): String {
        return "One Billion worth of assets are yours"
    }
}

fun main(){
    val piperOne = Piper()
    println(piperOne.themeSong())
}