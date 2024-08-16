package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 7 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema7()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema7() {
    // Desarrolle aquí la lógica

    var suma = 0.0
    var cont = 0
    println("N:")
    val n = readlnOrNull()?.toIntOrNull() ?: 0

    if (n > 0) {
        for (i in cont..n) {

            val temp = Math.pow(i.toDouble(), 3.0)
            suma += temp
            cont++

        }
        println("s = ${suma.toInt()}")
    } else {
        println("Error")
    }

}