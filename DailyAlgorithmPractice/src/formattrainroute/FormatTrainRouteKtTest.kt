package formattrainroute

import org.junit.Assert.*
import org.junit.Test

class FormatTrainRouteKtTest {
    @Test
    fun `formatTrainRoute list 'Luton'`() {
        val expected = "Train is calling at Luton"
        val output = formatTrainRoute(listOf("Luton"))
        assertEquals(expected, output)
    }

    @Test
    fun `formatTrainRoute list 'Luton', 'Harpenden'`() {
        val expected = "Train is calling at Luton and Harpenden"
        val output = formatTrainRoute(listOf("Luton", "Harpenden"))
        assertEquals(expected, output)
    }

    @Test
    fun `formatTrainRoute list 'Luton', 'Harpenden', 'London'`() {
        val expected = "Train is calling at Luton, Harpenden and London"
        val list = listOf("Luton", "Harpenden", "London")
        val output = formatTrainRoute(list)
        assertEquals(expected, output)
    }

    @Test
    fun `formatTrainRoute list 'Luton', 'Harpenden', 'St Albans', 'London'`() {
        val expected = "Train is calling at Luton, Harpenden, St Albans and London"
        val list = listOf("Luton", "Harpenden", "St Albans", "London")
        val output = formatTrainRoute(list)
        assertEquals(expected, output)
    }
}