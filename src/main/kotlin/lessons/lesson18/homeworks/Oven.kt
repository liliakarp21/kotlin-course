package org.example.lessons.lesson18.homeworks

import org.example.org.example.lessons.lesson18.homeworks.Timable

class Oven : TemperatureOpenableDevice(), Timable {
    override val deviceName = "Духовка"
    override val maxTemperature = 250

    private var timerMinutes = 0

    override fun setTimer(time: Int) {
        if (!isPoweredOn) {
            println("$deviceName выключена — нельзя установить таймер")
            return
        }
        timerMinutes = time
        println("$deviceName: таймер установлен на $time мин")
    }
}