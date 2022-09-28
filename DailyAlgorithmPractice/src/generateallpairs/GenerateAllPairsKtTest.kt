package generateallpairs

import org.junit.Assert.*
import org.junit.Test

class GenerateAllPairsKtTest {
    @Test
    fun `get all pairs 0`() {
        val expected = listOf(0 to 0)
        val output = getAllPairs(0)
        assertEquals(expected, output)
    }

    @Test
    fun `get all pairs 1`() {
        val expected = listOf(
            0 to 0,
            0 to 1,
            1 to 0,
            1 to 1
        )
        val output = getAllPairs(1)
        assertEquals(expected, output)
    }

    @Test
    fun `get all pairs 2`() {
        val expected = listOf(
            0 to 0,
            0 to 1,
            0 to 2,
            1 to 0,
            1 to 1,
            1 to 2,
            2 to 0,
            2 to 1,
            2 to 2
        )
        val output = getAllPairs(2)
        assertEquals(expected, output)
    }
}