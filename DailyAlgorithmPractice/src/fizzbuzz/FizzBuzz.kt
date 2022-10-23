package fizzbuzz

fun fizzBuzzOne(n: Int): List<String> {
    // declare the list
    val output = mutableListOf<String>()
    if (n == 0) {
        return output
    }
    for (i in 1..n) {
        if (i % 3 == 0) {
            output.add("Fizz")
        } else if (i % 5 == 0) {
            output.add("Buzz")
        } else if ((i % 3 == 0) && (i % 5 == 0) ) {
            output.add("FizzBuzz")
        } else {
            output.add(i.toString())
        }
    }
    return output
}

fun fizzBuzz(n: Int): List<String> {
    val list = mutableListOf<String>()

    (1..n).forEach {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz" // also (it % 15 == 0) because 3x5=15
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }

        list.add(item)
    }

    return list
}

// learning to write clean code
fun createFizzBuzz(n:Int) {
    val container = mutableListOf<String>()
    (1..n).forEach {
        val item = when {
            it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
            it % 3 == 0 -> "Fizz"
            it % 5 == 0 -> "Buzz"
            else -> it.toString()
        }
    }
}