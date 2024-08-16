package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 5 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema5()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema5() {
    // Desarrolle aquí la lógica
    var contador = 0
    do {
        println("n:")
        val numero = readlnOrNull()?.toIntOrNull() ?: 0
        val verify = numero % 2
        if (verify == 0){
            contador ++
        }

    } while (numero != -1)
    println("Pares = $contador")

}