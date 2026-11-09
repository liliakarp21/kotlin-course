package org.example.lessons.lesson18.homeworks

abstract class TemperatureOpenableDevice : ProgrammableDevice(), TemperatureRegulatable, Openable {

    protected var isOpen: Boolean = false
        private set

    protected var currentTemperature: Int = 0
        private set

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("$deviceName выключен — нельзя установить температуру")
            return
        }
        if (temp > maxTemperature) {
            println("$deviceName: температура $temp превышает максимум ($maxTemperature)")
            return
        }
        currentTemperature = temp
        println("$deviceName: температура установлена на $temp°C")
    }

    override fun open() {
        if (!isPoweredOn) {
            println("$deviceName выключен — нельзя открыть")
            return
        }
        if (isOpen) {
            println("$deviceName уже открыт")
            return
        }
        isOpen = true
        println("$deviceName открыт")
    }

    override fun close() {
        if (!isOpen) {
            println("$deviceName уже закрыт")
            return
        }
        isOpen = false
        println("$deviceName закрыт")
    }
}