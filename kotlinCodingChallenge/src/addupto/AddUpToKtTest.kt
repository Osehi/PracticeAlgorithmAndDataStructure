package addupto

import org.junit.Assert.*
import org.junit.Test

class AddUpToKtTest {
    @Test
    fun `add up to 1`() {
        val expected = 1
        val output = addUpTo(1)
        assertEquals(expected, output)
    }

    @Test
    fun `add up to 3`() {
        val expected = 6
        val output = addUpTo(3)
        assertEquals(expected, output)
    }

    @Test
    fun `add up to 10`() {
        val expected = 55
        val output = addUpTo(10)
        assertEquals(expected, output)
    }
}