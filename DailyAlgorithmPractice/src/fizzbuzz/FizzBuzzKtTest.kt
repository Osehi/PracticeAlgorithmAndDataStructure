package fizzbuzz

import org.junit.Assert.*
import org.junit.Test

class FizzBuzzKtTest {
    @Test
    fun `Calling fizzbuzz with "5" returns list with 5 items`() {
        val expected = listOf("1", "2", "Fizz", "4", "Buzz")
        val output = fizzBuzz(5)
        assertEquals(expected, output)
    }

    @Test
    fun `Calling fizzbuzz with 16 returns out the correct values`() {


        val list = listOf(
            "1", "2", "Fizz", "4", "Buzz", "Fizz",
            "7", "8", "Fizz", "Buzz", "11", "Fizz",
            "13", "14", "FizzBuzz", "16"
        )
        val expected = list
        val output = fizzBuzz(16)
        assertEquals(expected, output)

    }
}