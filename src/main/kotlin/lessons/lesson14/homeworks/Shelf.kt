package org.example.lessons.lesson14.homeworks

class Shelf(val capacity: Int) {

    private val items = mutableListOf<String>()

    private val usedSpace: Int
        get() = items.sumOf { it.length }

    fun addItem(name :String) :Boolean{
        if (!canAccommodate(name)) return false
        items.add(name)
        return true
    }

    fun removeItem(name :String): Boolean = items.remove(name)

    fun canAccommodate(name: String): Boolean = usedSpace + name.length <= capacity

    fun containsItem(name: String): Boolean = items.contains(name)

    fun getItems(): List<String> = items.toList()

}