package org.example.lessons.lesson16.homeworks.Printers

class LaserPrinter: Printer() {
    override fun print(text: String) {
        val words = text.split(" ")
        for (word in words) {
            if (word.isNotEmpty()) {
                println("${Ansi.BLACK}${Ansi.BG_WHITE}$word${Ansi.RESET}")
            }
        }
    }
}