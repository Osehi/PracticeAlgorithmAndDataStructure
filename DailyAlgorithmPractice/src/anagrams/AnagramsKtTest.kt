package anagrams

import org.junit.Assert.*
import org.junit.Test

class AnagramsKtTest {
    @Test
    fun `'rail safety' is an anagram of 'fairy tales'`() {
        val expected = true
        val output = isAnagram("rail safety", "fairy tales")
        assertEquals(expected, output)
    }

    @Test
    fun `'RAIL SAFETY' is an anagram of 'fairy tales' - ignore letter casing`() {
        val expected = true
        val output = isAnagram("RAIL SAFETY", "fairy tales")
        assertEquals(expected, output)
    }

    @Test
    fun `'rail safety!!' is an anagram of 'fairy tales' - ignore special characters`() {
        val expected = true
        val output = isAnagram("rail safety!!", "fairy tales")
        assertEquals(expected, output)
    }

    @Test
    fun `'hi' is not an anagram of 'ihi'`() {
        val expected = false
        val output = isAnagram("hi", "ihi")
        assertEquals(expected, output)
    }

    @Test
    fun `'hello' is an anagram of 'llohe'`() {
        val expected = true
        val output = isAnagram("hello", "llohe")
        assertEquals(expected, output)
    }

    @Test
    fun `'Whoa! Hi!' is an anagram of 'Hi! Whoa!'`() {
        val expected = true
        val output = isAnagram("Whoa! Hi!", "Hi! Whoa!")
        assertEquals(expected, output)
    }

    @Test
    fun `'One One' is not an anagram of 'Two two two'`() {
        val expected = false
        val output = isAnagram("One One", "Two two two")
        assertEquals(expected, output)
    }

    @Test
    fun `'One one' is not an anagram of 'One one c'`() {
        val expected = false
        val output = isAnagram("One one", "One one c")
        assertEquals(expected, output)
    }

    @Test
    fun `'One one' is not an anagram of 'One one  ' - ignore spaces`() {
        val expected = true
        val output = isAnagram("One one", "One one  ")
        assertEquals(expected, output)
    }

    @Test
    fun `'A tree, a life, a bench' is not an anagram of 'A tree, a fence, a yard'`() {
        val expected = false
        val output = isAnagram("A tree, a life, a bench", "A tree, a fence, a yard")
        assertEquals(expected, output)
    }
}