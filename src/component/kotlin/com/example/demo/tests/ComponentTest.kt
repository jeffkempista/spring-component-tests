package com.example.demo.tests

import com.example.demo.config.ComponentTestConfig
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.TestPropertySource

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@SpringBootTest(
        classes = [ComponentTestConfig::class],
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
@ActiveProfiles("component")
@TestPropertySource("classpath:application-component.properties")
annotation class ComponentTest
