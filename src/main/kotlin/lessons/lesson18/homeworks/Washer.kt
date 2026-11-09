package org.example.lessons.lesson18.homeworks

import org.example.org.example.lessons.lesson18.homeworks.Drainable
import org.example.org.example.lessons.lesson18.homeworks.Timable

class Washer : TemperatureOpenableDevice(), WaterContainer, Drainable, Timable {
    override val deviceName = "Стиральная машина"
    override val maxTemperature = 90
    override val capacity = 5000

    private var waterAmount = 0
    private var timerMinutes = 0

    override fun fillWater(amount: Int) {
        if (waterAmount + amount > capacity) {
            println("$deviceName: не поместится $amount мл (свободно ${capacity - waterAmount})")
            return
        }
        waterAmount += amount
        println("$deviceName: набрано $amount мл, всего $waterAmount мл")
    }

    override fun getWater(amount: Int) {
        if (amount > waterAmount) {
            println("$deviceName: недостаточно воды (есть $waterAmount мл)")
            return
        }
        waterAmount -= amount
        println("$deviceName: слито $amount мл, осталось $waterAmount мл")
    }

    override fun connectToDrain() = println("$deviceName подключена к сливу")
    override fun drain() {
        waterAmount = 0
        println("$deviceName: вода слита")
    }

    override fun setTimer(time: Int) {
        if (!isPoweredOn) {
            println("$deviceName выключена — нельзя установить таймер")
            return
        }
        timerMinutes = time
        println("$deviceName: таймер установлен на $time мин")
    }
}