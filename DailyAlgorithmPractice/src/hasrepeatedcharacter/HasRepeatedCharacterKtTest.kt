package hasrepeatedcharacter

import org.junit.Assert.*
import org.junit.Test

class HasRepeatedCharacterKtTest {
    @Test
    fun `'abc' don't have repeated character`() {
        val expected = false
        val output = hasRepeatedChar("abc")
        assertEquals(expected, output)
    }

    @Test
    fun `'aabc' has repeated character`() {
        val expected = true
        val output = hasRepeatedChar("aabc")
        assertEquals(expected, output)
    }

    @Test
    fun `'aabcc' has repeated character`() {
        val expected = true
        val output = hasRepeatedChar("aabcc")
        assertEquals(expected, output)
    }
}