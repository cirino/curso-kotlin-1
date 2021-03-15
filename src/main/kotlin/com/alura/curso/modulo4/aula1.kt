package com.alura.curso.modulo4

fun calculate(a: Int, b: Int) {
	println("resposta é ${a + b}")
}

fun oi(nome: String): String {
	return ("Olá, $nome")
}

fun linha(nome: String) = "eu $nome"
fun contar(a: Int, b: Int) = a + b

fun main() {
	println("Oi Cirino!")

	val nome = "Casa do Dev"
	println(nome);

	println("""
        aqui
        é
        um
        texto
        bom
        $nome
         espaço
        e
        espaço
    """.trimIndent())

	calculate(5, 3)

	println(oi("Cirino"))

	println(linha("Cirino"))
	println(contar(1, 6))

	loop()
}

@Suppress("LABEL_NAME_CLASH")
fun loop() {
	loop@ for (i in 1..100) {
		println("i $i")
		for (j in 1..100) {
			println("j $j")
			if (j == 5) break@loop
		}
	}
}
