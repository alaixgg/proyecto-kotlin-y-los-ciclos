package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 3 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema3()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema3() {
    // Desarrolle aquí la lógica

    var  sum= 0

    do {
        println("n:")
        val numero = readlnOrNull()?.toIntOrNull() ?: 0
            sum += numero

    } while (numero != 0)

    println("Suma = $sum")
}
