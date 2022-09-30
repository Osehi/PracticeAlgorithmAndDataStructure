package computeuniquevalues

import org.junit.Assert.*
import org.junit.Test

class ComputeUniqueValuesKtTest {
    @Test
    fun `countUniqueValues empty list return 0`() {
        val expected = 0
        val output = countUniqueValues(listOf())
        assertEquals(expected, output)
    }

    @Test
    fun `countUniqueValues 4 return 1`() {
        val expected = 1
        val output = countUniqueValues(listOf(4))
        assertEquals(expected, output)
    }

    @Test
    fun `countUniqueValues 3, 3, 3, 3, 5 return 2`() {
        val expected = 2
        val output = countUniqueValues(listOf(3, 3, 3, 3, 5))
        assertEquals(expected, output)
    }

    @Test
    fun `countUniqueValues 5, 5, 6, 7, 7 returns 3`() {
        val expected = 3
        val output = countUniqueValues(listOf(5, 5, 6, 7, 7))
        assertEquals(expected, output)
    }

    @Test
    fun `countUniqueValues 1, 5, 9, 9 returns 3`() {
        val expected = 3
        val output = countUniqueValues(listOf(1, 5, 9, 9))
        assertEquals(expected, output)
    }

    @Test
    fun `countUniqueValues 1, 5, 5, 5, 9 returns 3`() {
        val expected = 3
        val output = countUniqueValues(listOf(1, 5, 9, 9))
        assertEquals(expected, output)
    }

    @Test
    fun `countUniqueValues 4, 4, 5, 7, 10, 10 returns 4`() {
        val expected = 4
        val output = countUniqueValues(listOf(4, 4, 5, 7, 10, 10))
        assertEquals(expected, output)
    }

    @Test
    fun `countUniqueValues 2, 2, 3, 6, 7, 9, 9, 12, 13, 13 returns 7`() {
        val expected = 7
        val output = countUniqueValues(listOf(2, 2, 3, 6, 7, 9, 9, 12, 13, 13))
        assertEquals(expected, output)
    }

    @Test
    fun `countUniqueValues 1, 2, 3, 4, 5 return 5`() {
        val expected = 5
        val output = countUniqueValues(listOf(1, 2, 3, 4, 5))
        assertEquals(expected, output)
    }

    @Test
    fun `countUniqueValues 2, 3, 4, 7 return 4`() {
        val expected = 4
        val output = countUniqueValues(listOf(2, 3, 4, 7))
        assertEquals(expected, output)
    }
}