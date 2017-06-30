package org.nav.kotlin.simpleServer

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

/**
 * Created by marchibald on 5/19/17.
 */

@RestController
class GreetingController {
    val counter = AtomicLong()

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) : Greeting {
        return Greeting(counter.incrementAndGet(), "Hello, $name")
    }
}
