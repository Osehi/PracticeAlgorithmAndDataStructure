package generatepyramid

import org.junit.Assert.*
import org.junit.Test

class GeneratePyramidKtTest {
    @Test
    fun `pyramid n = 2`() {
        generatePyramid(2).also {
            /*
            it.size shouldBeEqualTo 2
            it[0] shouldBeEqualTo " # "
            it[1] shouldBeEqualTo "###"

             */
        }
    }

    @Test
    fun `pyramid n = 3`() {
        generatePyramid(3).also {
            /*
            it.size shouldBeEqualTo 3
            it[0] shouldBeEqualTo "  #  "
            it[1] shouldBeEqualTo " ### "
            it[2] shouldBeEqualTo "#####"

             */
        }
    }

    @Test
    fun `pyramid n = 4`() {
        generatePyramid(4).also {
            /*
            it.size shouldBeEqualTo 4
            it[0] shouldBeEqualTo "   #   "
            it[1] shouldBeEqualTo "  ###  "
            it[2] shouldBeEqualTo " ##### "
            it[3] shouldBeEqualTo "#######"

             */
        }
    }
}