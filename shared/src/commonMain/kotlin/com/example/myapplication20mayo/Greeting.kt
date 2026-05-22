package com.example.myapplication20mayo

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return sayHello(platform.name)
    }
}

// Modificación realizada por Rama 1