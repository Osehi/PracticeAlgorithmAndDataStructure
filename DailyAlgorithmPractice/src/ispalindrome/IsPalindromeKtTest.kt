package ispalindrome

import org.junit.Assert.*
import org.junit.Test

class IsPalindromeKtTest {
    @Test
    fun `'aba' is a palindrome`() {
        val expected = true
        val output = isPalindrome("aba")
        assertEquals(expected, output)
    }

    @Test
    fun `' aba' is not a palindrome`() {
        val expected = false
        val output = isPalindrome(" aba")
        assertEquals(expected, output)
    }

    @Test
    fun `'aba ' is not a palindrome`() {
        val expected = false
        val output = isPalindrome("aba ")
        assertEquals(expected, output)
    }

    @Test
    fun `'greetings' is not a palindrome`() {
        val expected = false
        val output = isPalindrome("greetings")
        assertEquals(expected, output)
    }

    @Test
    fun `'1000000001' a palindrome`() {
        val expected = true
        val output = isPalindrome("1000000001")
        assertEquals(expected, output)
    }

    @Test
    fun `'Fish hsif' is not a palindrome`() {
        val expected = false
        val output = isPalindrome("Fish hsif")
        assertEquals(expected, output)
    }

    @Test
    fun `'pennep' a palindrome`() {
        val expected = true
        val output = isPalindrome("pennep")
        assertEquals(expected, output)
    }
}