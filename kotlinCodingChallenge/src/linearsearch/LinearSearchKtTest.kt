package linearsearch

import org.junit.Assert.*
import org.junit.Test

class LinearSearchKtTest {
    @Test
    fun `index of 'A' in 'A, B, C' is 0`() {
        val expected = 0
        val output = getIndex(listOf("A", "B", "C"), "A")
        assertEquals(expected, output)
    }

    @Test
    fun `index of 'B' in 'A, B, C' is 1`() {
        val expected = 1
        val output = getIndex(listOf("A", "B", "C"), "B")
        assertEquals(expected, output)
    }

    @Test
    fun `index of 'C' in 'A, B, C' is 2`() {
        val expected = 2
        val output = getIndex(listOf("A", "B", "C"), "C")
        assertEquals(expected, output)
    }

    @Test
    fun `index of 'D' in 'A, B, C' is -1`() {
        val expected = -1
        val output = getIndex(listOf("A", "B", "C"), "D")
        assertEquals(expected, output)
    }
}