package reversestring

import org.junit.Assert.*
import org.junit.Test

class ReverseStringKtTest {
    @Test
    fun `Reverse of 'abcd' is 'dcba'`() {
        val expected = "dcba"
        val output = reverse("abcd")
        assertEquals(expected, output)
    }

    @Test
    fun `Reverse of 'aabbccdd' is 'ddccbbaa'`() {
        val expected = "ddccbbaa"
        val output = reverse("aabbccdd")
        assertEquals(expected, output)
    }
}