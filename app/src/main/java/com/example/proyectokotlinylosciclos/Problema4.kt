package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 4 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema4()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema4() {
    // Desarrolle aquí la lógica
    var numeroMayor = 0
    var posicionMayor = 0
    var posicionActual = 1 // Iniciamos en 1 para que la posición coincida con el número de iteración

    do {
        println("n:")
        val numero = readlnOrNull()?.toIntOrNull() ?: 0
        if (numero > numeroMayor){
            numeroMayor = numero
            posicionMayor = posicionActual
        }
        posicionActual ++

    } while (numero != 0)

    println("Posición del mayor = $posicionMayor")
}
