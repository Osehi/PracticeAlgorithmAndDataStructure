package getodnumbers

import org.junit.Assert.*
import org.junit.Test

class GetOddNumbersKtTest {

    @Test
    fun `empty list returns empty list`() {
        val expected = emptyList<Int>()
        // given an empty list
        val list = mutableListOf<Int>()
        // action
        val output = filterOdd(list)
        assertEquals(expected, output)
    }

    @Test
    fun `1, 2, 3 returns 1, 3`() {
        // given
        val list = listOf(1, 2, 3)
        // action
        val output = filterOdd(list)
        //assert
        assertEquals(listOf(1,3), output)
    }

    @Test
    fun `2, 9, 2, 5, 4 returns 9, 5`() {
        // given
        val list = listOf(2, 9, 2, 5, 4)
        // action
        val output = filterOdd(list)
        //assert
        assertEquals(listOf(9, 5), output)
    }

    @Test
    fun `7, 4, 6, 8, 7, 9 returns 7, 7, 9`() {
        // given
        val list = listOf(7, 4, 6, 8, 7, 9)
        // action
        val output = filterOdd(list)
        //assert
        assertEquals(listOf(7, 7, 9), output)

    }
}