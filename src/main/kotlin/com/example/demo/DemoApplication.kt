package com.example.demo

import com.example.demo.model.Greeting
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication {
	@Bean
	fun exampleGreetings(): List<Greeting> = listOf(
		Greeting("Catherine", "Hello")
	)
}

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
