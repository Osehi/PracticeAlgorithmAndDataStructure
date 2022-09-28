package countupanddown

import org.junit.Assert.*
import org.junit.Test

class CountUpAndDownKtTest {

        @Test
        fun `count up and down 0`() {
            val expected = listOf(0)
            val output = countUpAndDown(0)
            assertEquals(expected, output)
        }

        @Test
        fun `count up and down 1`() {
            val expected = listOf(0, 1, 0)
            val output = countUpAndDown(1)
            assertEquals(expected, output)
        }


        @Test
        fun `count up and down 2`() {
            val expected = listOf(0, 1, 2, 1, 0)
            val output = countUpAndDown(2)
            assertEquals(expected, output)
        }

        @Test
        fun `count up and down 3`() {
            val expected = listOf(0, 1, 2, 3, 2, 1, 0)
            val output = countUpAndDown(3)
            assertEquals(expected, output)
        }

        @Test
        fun `count up and down 4`() {
            val expected = listOf(0, 1, 2, 3, 4, 3, 2, 1, 0)
            val output = countUpAndDown(4)
            assertEquals(expected, output)
        }

        @Test
        fun `count up and down 9`() {
            val expected = listOf(
                0,
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8,
                9,
                8,
                7,
                6,
                5,
                4,
                3,
                2,
                1,
                0
            )
            val output = countUpAndDown(9)
            assertEquals(expected, output)
        }



}