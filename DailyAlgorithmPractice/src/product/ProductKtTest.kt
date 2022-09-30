package product

import org.junit.Assert.*
import org.junit.Test

class ProductKtTest {
    @Test
    fun `product 0 returns 0`() {
        val expected = 0
        val output = product(listOf(0))
        assertEquals(expected, output)
    }

    @Test
    fun `product 1, 2, 3 returns 6`() {
        val expected = 6
        val output =  product(listOf(1, 2, 3))
        assertEquals(expected, output)
    }

    @Test
    fun `product 4, 2, 10 returns 80`() {
        val expected = 80
        val output =  product(listOf(2, 4, 10))
        assertEquals(expected, output)
    }
}