package findthevowels

import org.junit.Assert.*
import org.junit.Test

class FindTheVowelsKtTest {
    @Test
    fun `'aeiouy' has 6 vovels`() {
        val expected = 6
        val output = vowels("aeiouy")
        assertEquals(expected, output)
    }

    @Test
    fun `'AEIOUY' has 6 vovels`() {
        val expected = 6
        val output = vowels("AEIOUY")
        assertEquals(expected, output)
    }

    @Test
    fun `'abcdefghijklmnopqrstuvwxyz' has 6 vovels`() {
        val expected = 6
        val output = vowels("abcdefghijklmnopqrstuvwxyz")
        assertEquals(expected, output)
    }

    @Test
    fun `'bcadfaghijkl' has 3 vovels`() {
        val expected = 3
        val output = vowels("bcadfaghijkl")
        assertEquals(expected, output)
    }

    @Test
    fun `'bcdfghjkl' has 0 vovels`() {
        val expected = 0
        val output = vowels("bcdfghjkl")
        assertEquals(expected, output)
    }
}