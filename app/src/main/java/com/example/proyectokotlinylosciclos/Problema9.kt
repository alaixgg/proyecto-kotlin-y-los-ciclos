package com.example.proyectokotlinylosciclos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 9 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema9()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema9() {
    // Desarrolle aquí la lógica
    var result =0
    println("n:")
    val n = readlnOrNull()?.toIntOrNull() ?: 0

    if (n > 0){
    for ( y in 1..n){
        var factorial = 1
        for (i in 1..y) {
        factorial *= i

    }
    result += factorial

}
    println("s = $result")}
    else{
        println("Error")
    }}