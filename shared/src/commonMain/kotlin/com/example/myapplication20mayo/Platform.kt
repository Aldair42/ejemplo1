package com.example.myapplication20mayo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform