package org.example.lessons.lesson14.homeworks

class Rack(val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()

    // ---------- Полки ----------

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size >= maxShelves) return false          // стеллаж заполнен
        if (shelves.any { it === shelf }) return false         // эта полка уже стоит
        shelves.add(shelf)
        return true
    }

    fun removeShelf(index: Int): List<String> {
        if (index !in shelves.indices) return emptyList()
        return shelves.removeAt(index).getItems()
    }

    // ---------- Предметы ----------

    fun addItem(name: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(name)) return true               // первая свободная полка
        }
        return false                                           // нигде не поместилось
    }

    fun removeItem(name: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(name)) return true            // только один предмет
        }
        return false
    }

    fun containsItem(name: String): Boolean =
        shelves.any { it.containsItem(name) }

    // ---------- Просмотр ----------

    fun getShelves(): List<Shelf> = shelves.toList()

    fun printContents() {
        if (shelves.isEmpty()) {
            println("Стеллаж пуст.")
            return
        }
        shelves.forEachIndexed { index, shelf ->
            val items = shelf.getItems()
            val used = items.sumOf { it.length }
            val free = shelf.capacity - used
            println("Полка #$index | вместимость: ${shelf.capacity} | свободно: $free | предметы: $items")
        }
    }

    // ---------- Сложное удаление ----------

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) return emptyList()

        val removedItems = shelves.removeAt(index).getItems()

        // Пробуем разместить предметы, начиная с самых длинных
        val unplaced = mutableListOf<String>()
        for (name in removedItems.sortedByDescending { it.length }) {
            if (!addItem(name)) unplaced.add(name)
        }

        return unplaced
    }
}