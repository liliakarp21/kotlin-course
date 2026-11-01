package org.example.lessons.lesson16.homeworks

class Cart {
    private val items: MutableMap<String, Int > = mutableMapOf()

    fun addToCart(itemId: String) {
        items[itemId] = (items[itemId] ?: 0) + 1
    }

    fun addToCart(itemId: String, amount: Int) {
        require(amount > 0)
        items[itemId] = (items[itemId] ?: 0) + amount
    }

    fun addToCart(products: Map<String, Int>) {
        for ((id, amount) in products) addToCart(id, amount)
    }

    fun addToCart(itemIds: List<String>) {
        for (id in itemIds) addToCart(id)
    }

    override fun toString(): String {
        if (items.isEmpty()) return "Корзина пуста"

        val idWidth = maxOf(4, items.keys.maxOf { it.length })          // ширина колонки ID
        val qtyWidth = maxOf(10, "Количество".length)                    // ширина колонки количества

        val separator = "+-${"-".repeat(idWidth)}-+-${"-".repeat(qtyWidth)}-+"
        val header = "| ${"ID".padEnd(idWidth)} | ${"Количество".padEnd(qtyWidth)} |"

        val rows = items.entries.joinToString("\n") { (id, qty) ->
            "| ${id.padEnd(idWidth)} | ${qty.toString().padEnd(qtyWidth)} |"
        }

        val totalItems = items.size
        val totalQuantity = items.values.sum()

        return buildString {
            appendLine(separator)
            appendLine(header)
            appendLine(separator)
            appendLine(rows)
            appendLine(separator)
            appendLine("Артикулов: $totalItems | Всего товаров: $totalQuantity")
        }
    }


}

fun main() {
    val cart = Cart()

    // 1. Базовый метод — по одной единице
    cart.addToCart("apple")
    cart.addToCart("apple")            // apple: 2
    cart.addToCart("banana")           // banana: 1

    // 2. itemId + amount
    cart.addToCart("apple", 3)         // apple: 2 + 3 = 5
    cart.addToCart("cherry", 10)       // cherry: 10

    // 3. Словарь id → количество
    cart.addToCart(
        mapOf(
            "banana" to 4,             // banana: 1 + 4 = 5
            "date"   to 2,             // date: 2
            "apple"  to 1              // apple: 5 + 1 = 6
        )
    )

    // 4. Список id — по одной единице
    cart.addToCart(listOf("apple", "cherry", "elderberry", "apple"))
    // apple: 6 + 2 = 8
    // cherry: 10 + 1 = 11
    // elderberry: 1

    println(cart)
}