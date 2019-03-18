
import io.ktor.http.HttpMethod.Companion.Get
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.withTestApplication
import org.junit.Assert.*
import org.junit.Test
import io.ktor.application.*


import javafx.application.Application

class MainKtTest{

    @Test
    fun `healthcheck`(){
        withTestApplication(setupApp()){
            handleRequest { Get; "/" }.apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    @Test
    fun `home page has a greeting`(){
        withTestApplication(setupApp()){
            handleRequest { Get; "/" }.apply {
                assertEquals("Hi", response.content)
            }
        }
    }

    private fun setupApp(): io.ktor.application.Application.() -> Unit = { module() }
}
