package org.example.lessons.lesson16.homeworks.Printers

fun main() {
    val longText = "Kotlin это современный статически типизированный язык " +
            "программирования работающий на платформе Java и компилирующийся " +
            "в байт-код который выполняется на виртуальной машине JVM " +
            "он сочетает объектно-ориентированный и функциональный подходы " +
            "и широко используется для разработки серверных приложений " +
            "мобильных приложений и автоматизированных тестов"

    println("=== Лазерный принтер ===")
    val laser: Printer = LaserPrinter()
    laser.print(longText)

    println()
    println("=== Струйный принтер ===")
    val inkjet: Printer = InkjetPrinter()
    inkjet.print(longText)
}