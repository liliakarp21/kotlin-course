package org.example.lessons.lesson16.homeworks.Printers

class InkjetPrinter : Printer() {
    // Пары (цвет текста, цвет фона)
    private val colorPairs = listOf(
        Ansi.RED    to Ansi.BG_WHITE,
        Ansi.GREEN  to Ansi.BG_BLACK,
        Ansi.YELLOW to Ansi.BG_BLUE,
        Ansi.CYAN   to Ansi.BG_BLACK,
        Ansi.WHITE  to Ansi.BG_RED,
        Ansi.BLACK  to Ansi.BG_YELLOW,
        Ansi.PURPLE to Ansi.BG_WHITE,
        Ansi.BLUE   to Ansi.BG_CYAN
    )

    override fun print(text: String) {
        val words = text.split(" ")
        var index = 0
        for (word in words) {
            if (word.isNotEmpty()) {
                val (fg, bg) = colorPairs[index % colorPairs.size]
                println("$fg$bg$word${Ansi.RESET}")
                index++
            }
        }
    }
}