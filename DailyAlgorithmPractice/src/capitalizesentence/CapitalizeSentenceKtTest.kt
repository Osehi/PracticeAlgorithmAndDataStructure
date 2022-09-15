package capitalizesentence

import org.junit.Assert.*
import org.junit.Test

class CapitalizeSentenceKtTest {

        @Test
        fun flowerIsCapitalizedToFlower() {
           val result = secondDoCapitalize("flower")
            assertEquals("Flower", result)
        }

        @Test
        fun `"this is a house" is capitalised to "This Is A House"`() {
           val result = secondDoCapitalize("this is a house")
            assertEquals("This Is A House", result)
        }

}