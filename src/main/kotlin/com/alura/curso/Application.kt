package com.alura.curso

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
		.args(*args)
		.packages("com.alura.curso")
		.start()
}

