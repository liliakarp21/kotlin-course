package org.example.lessons.lesson05.homeworks

fun main() {

    // задача 1
    val baseIntensity: Double = 3.0
    val coefficient: Double? = 0.73
    val baseCoefficient = 0.5
    val resultIntensity = baseIntensity * (coefficient ?: baseCoefficient)

    // задача 2
    val standartCost: Double = 50.0
    val cost: Double? = 20.0
    val deliveryCost = 5.0
    val insuranceCoefficient = 0.005
    val insuranceCost = (cost ?: standartCost) * insuranceCoefficient
    val totalCost: Double = deliveryCost + insuranceCost

    // задача 3
    val pressure: String? = "34.6"
    val errorMessage = "Error, no pressure"
    val pressureForLab = pressure ?: errorMessage
}