package mn.monog.multitenant

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import jakarta.inject.Inject

@Controller("/data")
class MyController {

    @Inject
    MyTenantedService service

    @Post(value="/",consumes = "text/plain")
    MyTenantedData create(@Body String name) {
        return service.create(name)
    }
}
