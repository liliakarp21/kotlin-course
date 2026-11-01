package org.example.lessons.lesson16.homeworks.Shapes

import kotlin.math.sin

class Triangle(
    private val a: Double,
    private val b: Double,
    private val angleDegrees: Double
) : Shape() {
    override fun area(): Double  = 0.5 * a * b * sin(Math.toRadians(angleDegrees))

}