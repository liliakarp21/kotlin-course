package org.example.lessons.lesson08.homeworks
fun main() {
//Преобразование строк
//Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования,
// делая текст более ироничным или забавным. Функция должна уметь распознавать ключевые слова или условия и
// соответственно изменять фразу.

    //Правила проверки и преобразования:
//
//Если фраза содержит слово "невозможно":
//Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".
//Если фраза начинается с "Я не уверен":
//Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".
//Если фраза содержит слово "катастрофа":
//Преобразование: Замените "катастрофа" на "интересное событие".
//Если фраза заканчивается на "без проблем":
//Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".
//Если фраза содержит только одно слово:
//Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".
//Примеры Тестовых Фраз:
//
//"Это невозможно выполнить за один день"
//"Я не уверен в успехе этого проекта"
//"Произошла катастрофа на сервере"
//"Этот код работает без проблем"
//"Удача"
    fun rewritePhrase(originalPhrase: String) {
        val newPhrase: String
        if (originalPhrase.contains("невозможно")) {
            newPhrase = originalPhrase.replace(
                "невозможно", "совершенно точно возможно, просто " +
                        "требует времени"
            )
        } else
            if (originalPhrase.startsWith("Я не уверен")) {
                newPhrase = originalPhrase + ", но моя интуиция говорит об обратном"
            } else
                if (originalPhrase.contains("катастрофа")) {
                    newPhrase = originalPhrase.replace("катастрофа", "интересное событие")
                } else
                    if (originalPhrase.endsWith("без проблем")) {
                        newPhrase = originalPhrase.replace(
                            "без проблем", "с парой интересных " +
                                    "вызовов на пути"
                        )
                    } else {
                        newPhrase = "Иногда," + originalPhrase + ", но не всегда"
                    }
        println(newPhrase)
    }

    rewritePhrase("Удача")

    //2. Извлечение даты из строки лога
//У вас есть строка лога, например "Пользователь вошел в систему -> 2021-12-01 09:48:23" (данные могут быть любыми,
// но формат всегда такой). Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди. Используй
// indexOf или split для получения правой части сообщения.
//
    fun splitLog(log: String) {
        val splitLog = log.split("->")
        println(splitLog)
    }

    splitLog("Пользователь вошел в систему -> 2021-12-01 09:48:23")

    //3. Маскирование личных данных
//Дана строка с номером кредитной карты, например "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних
// четырех, символами "*".
//
    fun cardSecurity(cardNumber: String) {
        val viewedNumber = cardNumber.substring(14, 19)
        val newNumber = "**** **** ****" + viewedNumber
        println(newNumber)
    }

    cardSecurity("4539 1488 0343 6467")
//4. Форматирование адреса электронной почты.
//У вас есть электронный адрес, например "username@example.com". Преобразуйте его в строку
// "username [at] example [dot] com", используя функцию replace()

    fun emailFormatter(email: String){
        val formattedEmail: String
        formattedEmail = email.replace("@", " [at] ").replace(".", " [dot] ")
        println(formattedEmail)
    }

    emailFormatter("username@example.com")


//5. Извлечение имени файла из пути.
//Дан путь к файлу, например "C:/Пользователи/Документы/report.txt" или "D:/good.themes/dracula.theme"
// (может быть любым). Извлеките название файла с расширением.

    fun extractFileNameManual(filePath: String) {
        val normalizedPath = filePath.replace('\\', '/')
        val file = normalizedPath.substringAfterLast('/')
        println(file)
    }

    extractFileNameManual("D:/good.themes/dracula.theme")

//6. Создание аббревиатуры из фразы.
//У вас есть фраза, например "Котлин лучший язык программирования" (может быть любой с разделителями слов - пробел).
// Создайте аббревиатуру из начальных букв слов (например, "ООП").
//
//Используйте split. Используйте for для перебора слов. Используйте var переменную для накопления первых букв.

    fun createAbbreviation(phrase: String){
        val words = phrase.split(" ")
        var abbreviation = ""

        for (word in words) {
            if (word.isNotEmpty()) {
                abbreviation += word[0].uppercaseChar()
            }
        }

        println(abbreviation)
    }

    createAbbreviation("Котлин лучший язык программирования")

}