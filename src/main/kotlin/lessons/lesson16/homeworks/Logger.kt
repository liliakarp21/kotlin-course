package org.example.lessons.lesson16.homeworks

// ANSI-цвета
object Ansi {
    const val RESET  = "\u001B[0m"
    const val YELLOW = "\u001B[33m"
    const val WHITE  = "\u001B[37m"
    const val RED    = "\u001B[31m"
    const val BG_RED = "\u001B[41m"
}

// Уровни логирования
enum class LogLevel {
    DEBUG, INFO, WARNING, ERROR
}

class Logger {

    // Базовый метод: INFO
    fun log(message: String) {
        println("[INFO] $message")
    }

    // Перегрузка 1: уровень + сообщение
    fun log(level: LogLevel, message: String) {
        when (level) {
            LogLevel.INFO    -> println("[INFO] $message")
            LogLevel.DEBUG   -> println("[DEBUG] $message")
            LogLevel.WARNING -> println("${Ansi.YELLOW}[WARNING] $message${Ansi.RESET}")
            LogLevel.ERROR   -> println("${Ansi.WHITE}${Ansi.BG_RED}[ERROR] $message${Ansi.RESET}")
        }
    }

    // Перегрузка 2: список сообщений — все с INFO
    fun log(messages: List<String>) {
        for (message in messages) {
            log(message)
        }
    }

    // Перегрузка 3: исключение — ERROR + message исключения
    fun log(exception: Exception) {
        log(LogLevel.ERROR, exception.message ?: exception.toString())
    }
}

fun main() {
    val logger = Logger()

    // 1. Базовый метод — INFO
    logger.log("Приложение запущено")
    logger.log("Загрузка конфигурации завершена")

    // 2. Уровень + сообщение
    logger.log(LogLevel.DEBUG, "Переменная x = 42")
    logger.log(LogLevel.WARNING, "Свободное место на диске < 10%")
    logger.log(LogLevel.ERROR, "Не удалось подключиться к базе данных")
    logger.log(LogLevel.INFO, "Пользователь авторизован")

    // 3. Список сообщений — все INFO
    logger.log(listOf(
        "Инициализация модуля A",
        "Инициализация модуля B",
        "Инициализация модуля C"
    ))

    // 4. Исключение — ERROR
    try {
        val x = 10 / 0
    } catch (e: ArithmeticException) {
        logger.log(e)   // [ERROR] / by zero
    }

    try {
        val list = listOf<Int>()
        list[5]
    } catch (e: IndexOutOfBoundsException) {
        logger.log(e)   // [ERROR] Index 5 out of bounds for length 0
    }
}