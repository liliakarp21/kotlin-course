package org.example.lessons.lesson15.homeworks

open class Wardrobe(
    material: String,
    price: Double,
    dimensions: String,
    val doorsCount: Int,
    val shelvesCount: Int
) : Furniture(material, price, dimensions)