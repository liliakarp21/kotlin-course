package org.example.lessons.lesson16.homeworks.Shapes

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(6.0, 8.0, 30.0),
        Circle(1.5),
        Square(10.0)
    )

    for (shape in shapes) {
        println("${shape::class.simpleName}: площадь = ${"%.2f".format(shape.area())}")
    }
}