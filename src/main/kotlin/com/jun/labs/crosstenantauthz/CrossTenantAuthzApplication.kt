package com.jun.labs.crosstenantauthz

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrossTenantAuthzApplication

fun main(args: Array<String>) {
    runApplication<CrossTenantAuthzApplication>(*args)
}
