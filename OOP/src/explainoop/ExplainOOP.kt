package explainoop



// to explain oop
// what gives an object access to the properties or behaviours of a class
// use an Animal to build a prototype or a class
// the properties are a. name. b. category. The behaviours are , a. makeSound

open class Animal (
    val name: String,
    val category: String
        ) {
   open fun makeASound() {
        println("What kind of sound those the animal makes?")
    }
}

class Cat(
    name: String,
    category: String
) : Animal(name, category) {

    override fun makeASound() {
        println("Cats meows")
    }
}


fun main() {
    val anAnimal = Animal("Lion", "Carnivour")
    println("This animal is called: ${anAnimal.name} and it is a : ${anAnimal.category}")
    // what kind of sound does the animal makes.
    anAnimal.makeASound()

    val myCat = Cat("cat", "carnivorous")
    println("This new animal is a called: ${myCat.name} and its category is ${myCat.category}")
    myCat.makeASound()
}