package org.example.lessons.lesson18.homeworks

fun main() {
    println("=== ХОЛОДИЛЬНИК ===")
    val fridge = Fridge()
    fridge.open()                               // выключен — нельзя
    fridge.powerOn()
    fridge.setTemperature(4)                    // ок
    fridge.setTemperature(20)                   // превышает максимум (8)
    fridge.open()
    fridge.fillWater(200)
    fridge.getWater(50)
    fridge.programAction("Режим отпуск")
    fridge.execute()
    fridge.close()
    fridge.drain()
    fridge.powerOff()

    println("\n=== СТИРАЛЬНАЯ МАШИНА ===")
    val washer = Washer()
    washer.setTemperature(60)                   // выключена — нельзя
    washer.powerOn()
    washer.setTemperature(60)
    washer.fillWater(3000)
    washer.programAction("Хлопок 60°")
    washer.setTimer(90)
    washer.execute()
    washer.drain()
    washer.powerOff()

    println("\n=== ЧАЙНИК ===")
    val kettle = Kettle()
    kettle.powerOn()
    kettle.fillWater(1500)
    kettle.setTemperature(100)
    kettle.open()                               // открыть (крышку)
    kettle.getWater(200)
    kettle.powerOff()

    println("\n=== ДУХОВКА ===")
    val oven = Oven()
    oven.powerOn()
    oven.setTemperature(180)
    oven.open()
    oven.programAction("Выпечка")
    oven.setTimer(45)
    oven.execute()
    oven.close()
    oven.powerOff()
}