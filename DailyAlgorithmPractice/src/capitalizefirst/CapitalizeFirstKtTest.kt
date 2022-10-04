package capitalizefirst

import org.junit.Assert.*
import org.junit.Test

class CapitalizeFirstKtTest{
    @Test
    fun `capitalize list with one string`() {
        val expected = listOf("Igor")
        val output = capitalizeFirst(listOf("igor"))
        assertEquals(expected, output)
    }

    @Test
    fun `capitalize list with two strings`() {
        val expected = listOf("Igor", "Wojda")
        val output = capitalizeFirst(listOf("igor", "wojda"))
        assertEquals(expected, output)
    }

    @Test
    fun `capitalize list with empty string`() {
        val expected = listOf("")
        val output = capitalizeFirst(listOf(""))
        assertEquals(expected, output)
    }

    @Test
    fun `capitalize list with sentence`() {
        val expected = listOf(
            "What a",
            "Beautiful",
            "Morning"
        )
        val output = capitalizeFirst(listOf("what a", "beautiful", "morning"))
        assertEquals(expected, output)
    }
}