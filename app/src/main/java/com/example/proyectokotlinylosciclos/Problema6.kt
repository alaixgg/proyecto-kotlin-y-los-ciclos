package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 6 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema6()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema6() {
    // Desarrolle aquí la lógica
    println("A:")
    var a = readlnOrNull()?.toIntOrNull() ?: 0
    println("B:")
    var b = readlnOrNull()?.toIntOrNull() ?: 0

    if (a<b) {
        for (i in a..b) {
            print("$a ")
            a += 1
        }
    } else{
        for (i in b..a) {
            print("$a ")
            a -= 1
        }
    }

}