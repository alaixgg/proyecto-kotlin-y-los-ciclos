package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 8 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema8()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema8() {
    // Desarrolle aquí la lógica
    var cont=1
    println("n:")
    val n = readlnOrNull()?.toIntOrNull() ?: 0
    var factorial = 1


        for (i in cont..n) {
            factorial *= cont
            cont++
        }

        println("$n ! = $factorial")}
