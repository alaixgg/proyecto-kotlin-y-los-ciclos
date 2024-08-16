package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 1 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema1()
}

// Función que desarrolla la lógica para la solución del problema
fun problema1() {
    var contador = 1
    var result = 0
    println("Ingresa N:")
    val num = readlnOrNull()?.toInt()

    if (num != null) {
        while (result <= num) {
            result = contador * contador
            if (result <= num) {
                println(result)
            }
            contador++
        }
    } else {
        println("Entrada no válida.")
    }
}
