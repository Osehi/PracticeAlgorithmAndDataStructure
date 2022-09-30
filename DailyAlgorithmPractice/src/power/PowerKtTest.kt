package power

import org.junit.Assert.*
import org.junit.Test

class PowerKtTest {
    @Test
    fun `power 2^1 returns 2`() {
        val expected = 2
        val output = power(2, 1)
        assertEquals(expected, output)
    }

    @Test
    fun `power 2^2 returns 2`() {
        val expected = 4
        val output = power(2, 2)
        assertEquals(expected, output)
    }

    @Test
    fun `power 2^3 returns 8`() {
        val expected = 8
        val output = power(2, 3)
        assertEquals(expected, output)
    }

    @Test
    fun `power 3^4 returns 81`() {
        val expected = 81
        val output = power(3, 4)
        assertEquals(expected, output)
    }
}