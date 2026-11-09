package org.example.lessons.lesson18.homeworks

import PoweredDevice
import org.example.org.example.lessons.lesson18.homeworks.Programmable

abstract class ProgrammableDevice : PoweredDevice(), Programmable {

    protected var currentAction: String = ""
        private set

    override fun programAction(action: String) {
        if (!isPoweredOn) {
            println("$deviceName выключен — нельзя запрограммировать действие")
            return
        }
        currentAction = action
        println("$deviceName: запрограммировано действие «$action»")
    }

    override fun execute() {
        if (!isPoweredOn) {
            println("$deviceName выключен — нечего выполнять")
            return
        }
        if (currentAction.isEmpty()) {
            println("$deviceName: нет запрограммированного действия")
            return
        }
        println("$deviceName выполняет: $currentAction")
    }
}