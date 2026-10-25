package org.example.lessons.lesson15.homeworks

class Bookcase(
    material: String,
    price: Double,
    dimensions: String,
    doorsCount: Int,
    shelvesCount: Int,
    val maxBooksPerShelf: Int
) : Wardrobe(material, price, dimensions, doorsCount, shelvesCount)