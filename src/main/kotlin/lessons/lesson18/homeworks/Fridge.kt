package org.example.lessons.lesson18.homeworks

import org.example.org.example.lessons.lesson18.homeworks.Drainable

class Fridge : TemperatureOpenableDevice(), WaterContainer, Drainable {
    override val deviceName = "Холодильник"
    override val maxTemperature = 8
    override val capacity = 300

    private var waterAmount = 0

    override fun fillWater(amount: Int) {
        if (waterAmount + amount > capacity) {
            println("$deviceName: не поместится $amount мл (свободно ${capacity - waterAmount})")
            return
        }
        waterAmount += amount
        println("$deviceName: налито $amount мл, всего $waterAmount мл")
    }

    override fun getWater(amount: Int) {
        if (amount > waterAmount) {
            println("$deviceName: недостаточно воды (есть $waterAmount мл)")
            return
        }
        waterAmount -= amount
        println("$deviceName: выдано $amount мл, осталось $waterAmount мл")
    }

    override fun connectToDrain() = println("$deviceName подключён к сливу")
    override fun drain() {
        waterAmount = 0
        println("$deviceName: вода слита")
    }
}