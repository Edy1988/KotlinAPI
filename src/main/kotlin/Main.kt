
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.application.call
import io.ktor.http.content.resources
import io.ktor.http.content.static
import java.io.File

fun Application.module() {
    install(DefaultHeaders)
    install(CallLogging)
    install(Routing) {
        get("/") {
            call.respondText("Hiiiiiiiii", ContentType.Text.Html)
        }
        get("/thermostat") {
            call.respondFile(file = File("src/main/resources/public/index.html"))
        }
    }
}

fun main(args: Array<String>) {
    embeddedServer(Netty, 8080, watchPaths = listOf("BlogAppKt"), module = Application::module).start()
}