package org.example.lessons.lesson10.homeworks

import java.time.LocalDate

fun main(){
    //Задачи на работу со словарём

    //Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val emptyMap = mapOf <Int, Int>()

    //Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val floatDoubleMap = mapOf<Float, Double>( 1.500f to 1.50, 3.145f to 3.14 )

    //Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val mutableMap = mutableMapOf<Int, String>()

    //Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    mutableMap[1] = "one"
    mutableMap[2] = "two"

    //Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
    for((number, string) in mutableMap){
        println("$number = $string")
    }
    println(mutableMap[4])

    //Удалите определенный элемент из изменяемого словаря по его ключу.
    mutableMap.remove(1)
    println(mutableMap)

    //Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val numbersMap = mapOf<Double, Int>(4.0 to 2, 1.0 to 1, 3.4 to 3, 4.5 to 0)
    for((doubleNumber, intNumber) in numbersMap){
        if (intNumber > 0){
        val result = doubleNumber/intNumber
        println("$doubleNumber / $intNumber = $result")}
        else println("$doubleNumber / $intNumber = бесконечность")
    }

    //Измените значение для существующего ключа в изменяемом словаре.
    mutableMap[2] = "два"
    println(mutableMap)

    //Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val firstMap = mapOf<Int, String>(1 to "one", 2 to "two")
    val secondMap = mapOf<Int, String>(3 to "three", 4 to "four")
    val targetMap = mutableMapOf<Int, String>()
    for ((keyInt, string) in firstMap) targetMap[keyInt] = "$string"
    for ((keyInt, string) in secondMap) targetMap[keyInt] = "$string"
    println(targetMap)

    //Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
    val intListMap = mutableMapOf<Int, List<String>>()
    intListMap[1] = listOf("one", "один")
    intListMap[2] = listOf("two", "два")
    println(intListMap)

    //Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь.
// Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.
    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")
    val mapOfMutableList = mutableMapOf<Int, MutableList<String>>(1 to mutableList, 2 to mutableListOf("two", "два"))
    val listofTwo = mapOfMutableList[2]
    listofTwo?.add("двойка")
    println(mapOfMutableList)

    //Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет
// содержать цифру 5 в качестве первого или второго значения.
    val dictionary = mutableMapOf(
        Pair(1, 2) to "Первая пара",
        Pair(5, 3) to "Второй элемент содержит 5",
        Pair(4, 5) to "Первый элемент содержит 5",
        Pair(7, 8) to "Пара без пятёрки",
        Pair(5, 5) to "Обе пятёрки"
    )
    for ((key, value) in dictionary) {
        if (key.first == 5 || key.second == 5) {
            println("Ключ $key -> $value")
        }
    }

    //Задачи на подбор оптимального типа для словаря
    //Словарь библиотека: Ключи - автор книги, значения - список книг
    val library: Map<String, List<String>> = mapOf(
        "Толстой" to listOf("Война и мир", "Анна Каренина"),
        "Достоевский" to listOf("Преступление и наказание", "Идиот"),
        "Булгаков" to listOf("Мастер и Маргарита", "Собачье сердце")
    )
    //Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val plants: Map<String, List<String>> = mapOf(
        "Цветы" to listOf("Роза", "Тюльпан", "Ромашка"),
        "Деревья" to listOf("Дуб", "Берёза", "Клён"),
        "Кустарники" to listOf("Сирень", "Шиповник")
    )
    //Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val quarterfinals: Map<String, List<String>> = mapOf(
        "Спартак" to listOf("Иванов", "Петров", "Сидоров"),
        "Зенит" to listOf("Кузнецов", "Смирнов", "Попов"),
        "ЦСКА" to listOf("Волков", "Соколов", "Морозов")
    )
    //Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val treatment: Map<LocalDate, List<String>> = mapOf(
        LocalDate.of(2026, 10, 1) to listOf("Парацетамол", "Витамин C"),
        LocalDate.of(2026, 10, 2) to listOf("Ибупрофен"),
        LocalDate.of(2026, 10, 3) to listOf("Аспирин", "Магний B6")
    )
    //Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val traveler: Map<String, Map<String, List<String>>> = mapOf(
        "Франция" to mapOf(
            "Париж" to listOf("Эйфелева башня", "Лувр", "Монмартр"),
            "Лион" to listOf("Старый город", "Базилика Фурвьер")
        ),
        "Италия" to mapOf(
            "Рим" to listOf("Колизей", "Фонтан Треви", "Ватикан"),
            "Венеция" to listOf("Площадь Сан-Марко", "Гранд-канал")
        ),
        "Япония" to mapOf(
            "Токио" to listOf("Токийская башня", "Синдзюку", "Асакуса"),
            "Киото" to listOf("Золотой павильон", "Фусими Инари")
        )
    )
}