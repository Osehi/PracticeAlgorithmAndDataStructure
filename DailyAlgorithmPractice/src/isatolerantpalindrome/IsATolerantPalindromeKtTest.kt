package isatolerantpalindrome

import org.junit.Assert.*
import org.junit.Test

class IsATolerantPalindromeKtTest {
    @Test
    fun `'aba' is a palindrome`() {
        val expected = true
        val output = isTolerantPalindrome("aba")
        assertEquals(expected, output)
    }


    @Test
    fun `'ab!a' is a palindrome`() {
        val expected = true
        val output = isTolerantPalindrome("ab!a")
        assertEquals(expected, output)
    }

    @Test
    fun `'a!ba' is a palindrome`() {
        val expected = true
        val output = isTolerantPalindrome("a!ba")
        assertEquals(expected, output)
    }

    @Test
    fun `'aa#!aa ' is not a palindrome`() {
        val expected = false
        val output = isTolerantPalindrome("aa#!aa ")
        assertEquals(expected, output)
    }

    @Test
    fun `'a!bcddcba' is a palindrome`() {
        val expected = true
        val output = isTolerantPalindrome("a!bcddcba")
        assertEquals(expected, output)
    }

    @Test
    fun `'abcddcb!a' is a palindrome`() {
        val expected = true
        val output = isTolerantPalindrome("abcddcb!a")
        assertEquals(expected, output)
    }

    @Test
    fun `'!a' is a palindrome`() {
        val expected = true
        val output = isTolerantPalindrome("!a")
        assertEquals(expected, output)
    }

    @Test
    fun `'a!' is a palindrome`() {
        val expected = true
        val output = isTolerantPalindrome("a!")
        assertEquals(expected, output)
    }

    @Test
    fun `' aba' is a palindrome`() {
        val expected = true
        val output = isTolerantPalindrome(" aba")
        assertEquals(expected, output)
    }


    @Test
    fun `'greetings' is not a palindrome`() {
        val expected = false
        val output = isTolerantPalindrome("greetings")
        assertEquals(expected, output)
    }

    @Test
    fun `'1000000001' a palindrome`() {
        val expected = true
        val output = isTolerantPalindrome("1000000001")
        assertEquals(expected, output)
    }

    @Test
    fun `'10A00000001' is a palindrome`() {
        val expected = true
        val output = isTolerantPalindrome("10A00000001")
        assertEquals(expected, output)
    }

    @Test
    fun `'Fish hsif' is not a palindrome`() {
        val expected = false
        val output = isTolerantPalindrome("Fish hsif")
        assertEquals(expected, output)
    }

    @Test
    fun `'pennep' a palindrome`() {
        val expected = true
        val output = isTolerantPalindrome("pennep")
        assertEquals(expected, output)
    }

}