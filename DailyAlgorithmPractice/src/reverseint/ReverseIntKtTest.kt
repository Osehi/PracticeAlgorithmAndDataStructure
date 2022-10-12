package reverseint

import org.junit.Assert.*
import org.junit.Test

class ReverseIntKtTest {
    @Test
    fun `ReverseInt handles 0 as an input`() {
        val expected = 0
        val output = reverseInt(0)
        assertEquals(expected, output)
    }

    @Test
    fun `ReverseInt flips a positive number`() {
        assertEquals(5, reverseInt(5))
        assertEquals(51, reverseInt(15))
        assertEquals(9, reverseInt(90))
        assertEquals(7, reverseInt(700))
        assertEquals(9532, reverseInt(2359))
    }

    @Test
    fun `ReverseInt flips a negative number`() {
        assertEquals(-5, reverseInt(-5))
        assertEquals(-51, reverseInt(-15))
        assertEquals(-9, reverseInt(-90))
        assertEquals(-7, reverseInt(-700))
        assertEquals(-9532, reverseInt(-2359))
    }
}