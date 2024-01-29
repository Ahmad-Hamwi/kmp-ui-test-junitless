import androidx.compose.material.Text
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.runComposeUiTest
import kotlin.test.Test

class HelloWorldTest {
    @OptIn(ExperimentalTestApi::class)
    @Test
    fun findsHelloWorld() = runComposeUiTest {
        setContent {
            Text("Hello World")
        }

        onNodeWithText("Hello World").assertExists()
    }
}