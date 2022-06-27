package com.example

import com.example.plugins.configureRouting
import io.ktor.server.application.*
import com.example.plugins.configureSerialization

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureRouting()
    configureSerialization()
}