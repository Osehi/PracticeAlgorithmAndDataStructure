package maxoccurencechar

import org.junit.Assert.*
import org.junit.Test

class MacOccurenceCharKtTest {
    @Test
    fun `Don't find a char in empty string`() {
        val expected = null
        val output = maxOccurrentChar("")
        assertEquals(expected, output)
    }

    @Test
    fun `Finds char 'a' in string 'a'`() {
        val expected = 'a'
        val output = maxOccurrentChar("a")
        assertEquals(expected, output)
    }

    @Test
    fun `Finds char 'a' in string 'abcdefghijklmnaaaaa'`() {
        val expected = 'a'
        val output = maxOccurrentChar("abcdefghijklmnaaaaa")
        assertEquals(expected, output)
    }

    @Test
    fun `Finds char '1' in string 'ab1c1d1e1f1g1'`() {
        val expected = '1'
        val output = maxOccurrentChar("ab1c1d1e1f1g1")
        assertEquals(expected, output)
    }
}