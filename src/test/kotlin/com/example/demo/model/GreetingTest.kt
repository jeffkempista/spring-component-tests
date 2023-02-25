package com.example.demo.model

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GreetingTest {

    @Test
    fun `Greeting message should include message and name`() {
        val greeting = Greeting("Roberto", "Hello")
        Assertions.assertEquals("Hello, Roberto!", greeting.greetingMessage)
    }
}