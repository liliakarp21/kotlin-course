package org.example.lessons.lesson16.homeworks.Shapes

class Square(private val side : Double): Shape() {
    override fun area(): Double = side * side
}