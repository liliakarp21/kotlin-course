package org.example.lessons.lesson14.homeworks

class Concert(
    val band: String,
    val venue: String,
    val price: Double,
    val capacity: Int
) {
    private var ticketsSold: Int = 0

    fun details() {
        println("Группа: $band")
        println("Место проведения: $venue")
        println("Стоимость билета: $price руб.")
        println("Вместимость зала: $capacity")
        println("Продано билетов: $ticketsSold")
    }

    fun buyTicket() {
        if (ticketsSold >= capacity) {
            println("Билеты закончились — зал заполнен ($capacity мест).")
            return
        }
        ticketsSold++
        println("Билет куплен. Всего продано: $ticketsSold")
    }
}