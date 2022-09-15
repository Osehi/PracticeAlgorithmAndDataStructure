package containsrange

import org.junit.Assert.*
import org.junit.Test

class ContainsRangeKtTest {
    @Test
    fun `5-7 range contains 5-7`() {
        val result = containsRange(5..7, 5..7)
        assertTrue(result)
    }

    @Test
    fun `1-12 range contains 5-7`() {
       val result =  containsRange(1..12, 5..7)
        assertTrue(result)
    }

    @Test
    fun `12-17 range contains 12-14`() {
        val result = containsRange(12..17, 12..14)
        assertTrue(result)
    }

    @Test
    fun `12-17 range contains 15-17`() {
       val result =  containsRange(12..17, 15..17)
        assertTrue(result)
    }

    @Test
    fun `5-7 range contains 1-12`() {
        val result = containsRange(5..7, 1..12)
        assertFalse(result)
    }

    @Test
    fun `5-8 range contains 5-9`() {
        val result = containsRange(5..8, 5..9)
        assertFalse(result)
    }

    @Test
    fun `5-8 range contains 3-5`() {
        val result = containsRange(5..8, 3..5)
        assertFalse(result)
    }
}