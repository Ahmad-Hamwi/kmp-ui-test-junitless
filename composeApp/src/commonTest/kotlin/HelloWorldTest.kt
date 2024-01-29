import kotlin.test.Test
import kotlin.test.assertTrue

class HelloWorldTest {
    @Test
    fun printsHello() {
        assertTrue { Greeting().greet().startsWith("Hello") }
    }
}