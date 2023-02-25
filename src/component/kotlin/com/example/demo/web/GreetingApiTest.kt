package com.example.demo.web

import com.example.demo.model.Greeting
import com.example.demo.tests.ComponentTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.web.client.TestRestTemplate


@ComponentTest
class GreetingApiTest(
        @Value(value="\${local.server.port}") val port: Int,
        @Autowired val restTemplate: TestRestTemplate
) {

    @Test
    fun `Should return greeting`() {
        val greeting = restTemplate.getForObject("http://localhost:$port/greeting?name=Roberto&message=Hello", Greeting::class.java)
        assertThat(greeting.greetingMessage).isEqualTo("Hello, Roberto!")
    }

    @Test
    fun `Example greetings`() {
        val exampleGreeting = restTemplate.getForObject("http://localhost:$port/example-greeting", Greeting::class.java)
        assertThat(exampleGreeting.name).containsAnyOf("Adam", "Madeline", "Jack")
    }

    @Test
    fun `environment should be component-test`() {
        val environment = restTemplate.getForObject("http://localhost:$port/environment", String::class.java)
        assertThat(environment).isEqualTo("component-test")
    }
}