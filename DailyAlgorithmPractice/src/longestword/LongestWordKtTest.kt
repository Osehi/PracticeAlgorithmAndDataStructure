package longestword

import org.junit.Assert.*
import org.junit.Test

class LongestWordKtTest {
    @Test
    fun `'flower' return 'flower'`() {
        val expected = "flower"
        val output = longestWord("flower")
        assertEquals(expected, output)
    }

    @Test
    fun `'flower is growing fast' return 'growing'`() {
        val expected = "growing"
        val output = longestWord("flower is growing fast")
        assertEquals(expected, output)
    }

    @Test
    fun `'This is my jeep' return 'jeep'`() {
        val expected = "This"
        val output = longestWord("This is my jeep")
        assertEquals(expected, output)
    }

    @Test
    fun `'Home!@#&sweet home' return 'sweet'`() {
        val expected = "sweet"
        val output = longestWord("Home!@&#sweet home")
        assertEquals(expected, output)
    }
}