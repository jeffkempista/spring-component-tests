package com.example.demo.model

data class Greeting(val name: String, val message: String) {
    val greetingMessage = "$message, $name!"
}