package com.alura.curso.modulo4

fun main() {
	println("Bem vindo ao Bytebank")
	val contaAlex = Conta("Cirino", 2222)
	contaAlex.deposita(200.0)

	val contaFran = Conta("Mirele", 3333)
	contaFran.deposita(300.0)

	println(contaFran.titular)
	println(contaFran.numero)
	println(contaFran.saldo)

	println(contaAlex.titular)
	println(contaAlex.numero)
	println(contaAlex.saldo)

	println("depositando na conta do Alex")
	contaAlex.deposita(50.0)
	println(contaAlex.saldo)

	println("depositando na conta da Fran")
	contaFran.deposita(70.0)
	println(contaFran.saldo)

	println("### sacando na conta do Alex")
	contaAlex.saca(217.0)
	println(contaAlex.saldo)

	println("### Transferindo para Fran")
	if (contaAlex.transferencia(11.0, contaFran)) {
		println("transferência ok")
	} else {
		println("erro na transferência")
	}

	println(contaAlex.saldo)
	println(contaFran.saldo)
}


class Conta(var titular: String, var numero: Int) {

	var saldo = 0.0
		private set

	fun deposita(valor: Double) {
		if (valor >= 0) {
			this.saldo += valor
		}
	}

	fun saca(valor: Double) {
		if (valor > 0 && this.saldo >= valor) {
			this.saldo -= valor
		} else {
			println("Não pode sacar o valor solicitado")
		}
	}

	fun transferencia(valor: Double, destino: Conta): Boolean {
		if (valor > 0 && this.saldo >= valor) {
			this.saldo -= valor
			destino.deposita(valor)
			return true
		}
		return false
	}
}

fun testaCopiasEReferencias() {
	val numeroX = 10
	var numeroY = numeroX
	numeroY++

	println("numeroX $numeroX")
	println("numeroY $numeroY")

	val contaJoao = Conta("Luiza", 4444)
	val contaMaria = Conta("Teo", 5555)

	println("titular conta joao: ${contaJoao.titular}")
	println("titular conta maria: ${contaMaria.titular}")

	println(contaJoao)
	println(contaMaria)
}

fun testaLacos() {
	var i = 0
	while (i < 5) {
		val titular: String = "Alex $i"
		val numeroConta: Int = 1000 + i
		val saldo = i + 10.0

		println("titular $titular")
		println("número da conta $numeroConta")
		println("saldo da conta $saldo")
		println()
		i++
	}

	for (i in 5 downTo 1) {
		val titular: String = "Alex $i"
		val numeroConta: Int = 1000 + i
		val saldo = i + 10.0

		println("titular $titular")
		println("número da conta $numeroConta")
		println("saldo da conta $saldo")
		println()
	}
}

fun testaCondicoes(saldo: Double) {
	if (saldo > 0.0) {
		println("conta é positiva")
	} else if (saldo == 0.0) {
		println("conta é neutra")
	} else {
		println("conta é negativa")
	}

	when {
		saldo > 0.0 -> println("conta é positiva")
		saldo == 0.0 -> println("conta é neutra")
		else -> println("conta é negativa")
	}
}