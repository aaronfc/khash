package es.com.aaron.khash

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    @GetMapping()
    fun index() : String {
        return "Hi :)"
    }
}