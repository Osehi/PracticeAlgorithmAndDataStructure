package factorial

import org.junit.Assert.*
import org.junit.Test

class FactorialKtTest {
    @Test
    fun `factorial 0 should equal 1`() {
        val expected = 1
        val output = factorial(0)
        assertEquals(expected, output)
    }

    @Test
    fun `factorial 3 should equal 6`() {
        val expected = 6
        val output = factorial(3)
        assertEquals(expected, output)
    }

    @Test
    fun `factorial 5 should equal 120`() {
        val expected = 120
        val output = factorial(5)
        assertEquals(expected, output)
    }

    @Test
    fun `factorial 10 should equal 3628800`() {
        val expected = 3628800
        val output = factorial(10)
        assertEquals(expected, output)
    }
}