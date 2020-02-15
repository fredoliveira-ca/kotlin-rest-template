package com.fredoliveira.kotlinresttemplate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication class KotlinRestTemplateApplication

fun main(args: Array<String>) {
	runApplication<KotlinRestTemplateApplication>(*args)
}
