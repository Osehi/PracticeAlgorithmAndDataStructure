package countdown

import org.junit.Assert.*
import org.junit.Test

class CountDownKtTest {
    @Test
    fun `count down 0`() {
        val expected = listOf(0)
        val output = countDown(0)
        assertEquals(expected, output)
    }

    @Test
    fun `count down 1`() {
        val expected = listOf(1, 0)
        val output = countDown(1)
        assertEquals(expected, output)
    }

    @Test
    fun `count down 5`() {
        val expected = listOf(5, 4, 3, 2, 1, 0)
        val output = countDown(5)
        assertEquals(expected, output)
    }
}