package decapitalize

import org.junit.Assert.*
import org.junit.Test

class DecapitalizeKtTest {
    @Test
    fun `'FOOBAR' return foobar`() {
        val expected = "foobar"
        val output = decapitalizeConst("FOOBAR")
        assertEquals(expected, output)
    }

    @Test
    fun `'FOO_BAR' return 'fooBar'`() {
        val expected = "fooBar"
        val output = decapitalizeConst("FOO_BAR")
        assertEquals(expected, output)
    }

    @Test
    fun `'FOO_BAR_BAZ' return 'fooBarBaz'`() {
        val expected = "fooBarBaz"
        val output = decapitalizeConst("FOO_BAR_BAZ")
        assertEquals(expected, output)
    }

    @Test
    fun `'__F_BAR' return 'fBar'`() {
        val expected = "fBar"
        val output = decapitalizeConst("__F_BAR")
        assertEquals(expected, output)
    }

    @Test
    fun `'F_BAR' return 'fBar'`() {
        val expected = "fBar"
        val output = decapitalizeConst("F_BAR")
        assertEquals(expected, output)
    }

    @Test
    fun `empty string return empty string`() {
        val expected = ""
        val output = decapitalizeConst("")
        assertEquals(expected, output)
    }
}