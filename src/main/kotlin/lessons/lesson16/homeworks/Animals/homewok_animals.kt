package org.example.lessons.lesson16.homeworks.Animals

fun main() {
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird(), Animal())
    for (animal in animals) animal.makeSound()
}