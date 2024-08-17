package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 10 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema10()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema10() {
    // Desarrolle aquí la lógica
    println("n:")
    val number = readlnOrNull()?.toIntOrNull() ?: 0
    var contnumb =1
    var view = 0
    if (number in 1..9){
        for (i in 1..number) {
            for (j in 1..i) {
                print(j)
            }
            println()
        }

    } else{
        println("Error")
    }

}