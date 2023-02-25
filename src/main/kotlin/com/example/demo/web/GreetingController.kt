package com.example.demo.web

import com.example.demo.model.Greeting
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController(
        private val exampleGreetings: List<Greeting>,
        @Value("\${environment}")
        private val environment: String
) {

    @GetMapping("/greeting")
    fun getGreeting(
            @RequestParam("name", required = true) name: String,
            @RequestParam("message", required = true) message: String
    ): Greeting {
        return Greeting(name, message)
    }

    @GetMapping("/example-greeting")
    fun getExampleGreeting(): Greeting = exampleGreetings.random()

    @GetMapping("/environment")
    fun getEnvironment(): String = environment
}