package ispermutationpalindrome

import org.junit.Assert.*
import org.junit.Test

class IsPermutationPalindromeKtTest {
    @Test
    fun `'gikig' is a palindrome`() {
        val expected = true
        val output = isPermutationPalindrome("gikig")
        assertEquals(expected, output)
    }

    @Test
    fun `'ookvk' is a palindrome`() {
        val expected = true
        val output = isPermutationPalindrome("ookvk")
        assertEquals(expected, output)
    }

    @Test
    fun `'sows' is not a palindrome`() {
        val expected = false
        val output = isPermutationPalindrome("sows")
        assertEquals(expected, output)
    }

    @Test
    fun `'tami' is not a palindrome`() {
        val expected = false
        val output = isPermutationPalindrome("tami")
        assertEquals(expected, output)
    }
}