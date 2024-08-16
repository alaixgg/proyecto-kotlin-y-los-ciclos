package com.example.proyectokotlinylosciclos

import kotlin.time.times

// Nombre:
// Fecha:
// Descripción: Solución del Problema 2 de la guía de Kotlin y los ciclos

// Función principal
fun main() {
    problema2()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema2() {
    // Desarrolle aquí la lógica
    println("Ingresa x:")
    var x = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    println("Ingresa y:")
    val y = readlnOrNull()?.toIntOrNull() ?:0

    var days = 1

    while (x < y) {
        days++
        x *= 1.1

    }

    println("Necesitas $days días para correr bien los $y Km")
}