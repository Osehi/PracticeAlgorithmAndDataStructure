package ceasercipher

import org.junit.Assert.*
import org.junit.Test

class CeaserCipherKtTest {
    @Test
    fun `'abc' with shift 1 return 'bcd'`() {
        val expected = "bcd"
        val output = encodeCaesarCipher("abc", 1)
        assertEquals(expected, output)
    }

    @Test
    fun `'abcdefghijklmnopqrstuvwxyz' shift 1 returns 'bcdefghijklmnopqrstuvwxyza'`() {
        val expected = "bcdefghijklmnopqrstuvwxyza"
        val output = encodeCaesarCipher(
            "abcdefghijklmnopqrstuvwxyz",
            1
        )
        assertEquals(expected, output)
    }

    @Test
    fun `'abcdefghijklmnopqrstuvwxyz' shift 7 returns 'hijklmnopqrstuvwxyzabcdefg'`() {
        val expected = "hijklmnopqrstuvwxyzabcdefg"
        val output = encodeCaesarCipher(
            "abcdefghijklmnopqrstuvwxyz",
            7
        )
        assertEquals(expected, output)
    }

    @Test
    fun `'abcdefghijklmnopqrstuvwxyz' shift 50 returns 'yzabcdefghijklmnopqrstuvwx'`() {
        val expected = "yzabcdefghijklmnopqrstuvwx"
        val output = encodeCaesarCipher(
            "abcdefghijklmnopqrstuvwxyz",
            50
        )
        assertEquals(expected, output)
    }
}