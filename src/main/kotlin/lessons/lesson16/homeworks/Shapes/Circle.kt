package org.example.lessons.lesson16.homeworks.Shapes

import kotlin.math.PI

class Circle (private val radius : Double): Shape() {
    override fun area(): Double = PI * radius * radius
}