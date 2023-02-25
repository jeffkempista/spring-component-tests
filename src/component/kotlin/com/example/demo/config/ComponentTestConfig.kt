package com.example.demo.config

import com.example.demo.DemoApplication
import com.example.demo.model.Greeting
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.FilterType

@Configuration
@EnableAutoConfiguration
@ComponentScan(
        basePackages = ["com.example.demo"],
        excludeFilters = [
            ComponentScan.Filter(
                    type = FilterType.ASSIGNABLE_TYPE,
                    classes = [DemoApplication::class]
            )
        ]
)
class ComponentTestConfig {

    @Bean
    fun exampleGreetings(): List<Greeting> = listOf(
            Greeting("Adam", "Good evening"),
            Greeting("Madeline", "Good afternoon"),
            Greeting("Jack", "Good morning")
    )
}
