import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class WebSiteTest {


    @Test
    fun checkStringIsShorterThan25() {
        val str = "Hello world"
        assertEquals(str, shortTitle(str))
    }

    @Test
    fun checkStringIsLongerThan25() {
        val str = "Volvo released a new car with the following spec: V6 236HP. It will cost \$22647 and going to be sold in New York only"
        assertEquals("Volvo released a new...", shortTitle(str))
    }

    @Test
    fun checkEmptyString() {
        val str = ""
        assertEquals(str, shortTitle(str))
    }

    @Test
    fun checkStringIsEqual25() {
        val str = "Musk and Tesla have enjoy"
        assertEquals(str, shortTitle(str))
    }




}