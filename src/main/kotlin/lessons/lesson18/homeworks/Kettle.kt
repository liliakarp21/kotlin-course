package org.example.lessons.lesson18.homeworks

class Kettle : TemperatureOpenableDevice(), WaterContainer {
    override val deviceName = "Чайник"
    override val maxTemperature = 100
    override val capacity = 1700

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
        println("$deviceName: вылито $amount мл, осталось $waterAmount мл")
    }
}