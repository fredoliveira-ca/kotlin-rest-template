package com.fredoliveira.kotlinresttemplate.app.web.controller

import com.fredoliveira.kotlinresttemplate.domain.entity.Greeting
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController class GreetingController {

    val counter = AtomicLong()

    @GetMapping("/greeting", produces = [APPLICATION_JSON_VALUE])
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
            Greeting(counter.incrementAndGet(), "Hello, $name")

}