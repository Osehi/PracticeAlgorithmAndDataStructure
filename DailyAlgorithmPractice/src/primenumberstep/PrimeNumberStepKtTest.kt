package primenumberstep

import org.junit.Assert.*
import org.junit.Test

class PrimeNumberStepKtTest {
    @Test
    fun `printNumber 0 step 1 return listOf()`() {
        val expected = emptyList<Int>()
        val output = printNumberStep(0, 1)
        assertEquals(expected, output)
    }

    @Test
    fun `printNumber 1 step 1 return listOf(1)`() {
        val expected = listOf(1)
        val output = printNumberStep(1, 1)
        assertEquals(expected, output)

    }

    @Test
    fun `printNumber 3 step 2 return listOf(3, 1)`() {
        val expected = listOf(3, 1)
        val output = printNumberStep(3, 2)
        assertEquals(expected, output)
    }

    @Test
    fun `printNumber 11 step 3 return listOf(1, 8, 5, 2)`() {
        val expected = listOf(11, 8, 5, 2)
        val output = printNumberStep(11, 3)
        assertEquals(expected, output)
    }
}