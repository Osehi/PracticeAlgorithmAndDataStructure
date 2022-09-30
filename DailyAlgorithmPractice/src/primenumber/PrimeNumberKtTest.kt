package primenumber

import org.junit.Assert.*
import org.junit.Test
import kotlin.test.expect

class PrimeNumberKtTest {
    @Test
    fun `printNumber 0 return listOf()`() {
        val expected = emptyList<Int>()
        val output = printNumber(0)
        assertEquals(expected, output)
    }

    @Test
    fun `printNumber 1 return listOf(1)`() {
        val expected = listOf(1)
        val output = printNumber(1)
        assertEquals(expected, output)
    }

    @Test
    fun `printNumber 3 return listOf(3, 2, 1)`() {
        val expected = listOf(3, 2, 1)
        val output = printNumber(3)
        assertEquals(expected, output)
    }

    @Test
    fun `printNumber 5 return listOf(5, 4, 3, 2, 1)`() {
        val expected = listOf(5, 4, 3, 2, 1)
        val output = printNumber(5)
        assertEquals(expected, output)
    }
}