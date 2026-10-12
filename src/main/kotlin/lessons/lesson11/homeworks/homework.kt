package org.example.lessons.lesson11.homeworks

// 1. Не принимает аргументов и не возвращает значения.
fun doNothing() {
    // тело пустое или какие-то действия
}

// 2. Принимает два целых числа и возвращает их сумму.
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 3. Принимает строку и ничего не возвращает.
fun printString(text: String) {
    println(text)
}

// 4. Принимает список целых чисел и возвращает среднее значение типа Double.
fun average(numbers: List<Int>): Double {
    if (numbers.isEmpty()) return 0.0
    return numbers.sum().toDouble() / numbers.size
}

// 5. Принимает nullable строку и возвращает её длину в виде nullable целого числа,
//    доступна только в текущем файле.
private fun lengthOrNull(text: String?): Int? {
    return text?.length
}

// 6. Не принимает аргументов и возвращает nullable вещественное число.
fun getNullableDouble(): Double? {
    return null
}

// 7. Принимает nullable список целых чисел, не возвращает значения,
//    доступна только в текущем файле.
private fun processNumbers(numbers: List<Int>?) {
    numbers?.forEach { println(it) }
}

// 8. Принимает целое число и возвращает nullable строку.
fun intToString(value: Int): String? {
    return if (value >= 0) value.toString() else null
}

// 9. Не принимает аргументов и возвращает список nullable строк.
fun getNullableStrings(): List<String?> {
    return listOf("Hello", null, "Kotlin", null)
}

// 10. Принимает nullable строку и nullable целое число
//     и возвращает nullable булево значение.
fun checkMatch(text: String?, number: Int?): Boolean? {
    if (text == null || number == null) return null
    return text.length == number
}

// 11. multiplyByTwo — принимает Int, возвращает Int (умноженный на 2)
fun multiplyByTwo(number: Int): Int {
    return number * 2
}



// 12. isEven — принимает Int, возвращает Boolean
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}



// 13. printNumbersUntil — принимает Int, выводит числа 1..n
fun printNumbersUntil(n: Int) {
    if (n < 1) return

    for (i in 1..n) {
        println(i)
    }
}

fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) return number
    }
    return null
}


// 15. processList — принимает List<String?>, выводит строки до первого null
fun processList(strings: List<String?>) {
    for (item in strings) {
        if (item == null) return
        println(item)
    }
}
