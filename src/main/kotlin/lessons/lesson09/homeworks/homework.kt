package org.example.lessons.lesson09.homeworks

fun main() {

// 1. Массив из 5 целых чисел со значениями от 1 до 5
    val array1 = arrayOf(1, 2, 3, 4, 5)

// 2. Пустой массив строк размером 10 элементов
    val emptyStrings = arrayOfNulls<String>(10)
// или, если нужны именно пустые строки:
    val emptyStrings2 = Array(10) { "" }

// 3. Массив из 5 элементов Double = удвоенный индекс
    val doubleArray = Array(5) { i -> i * 2.0 }
// [0.0, 2.0, 4.0, 6.0, 8.0]

// 4. Массив из 5 Int: значение = индекс * 3
    val intArray = IntArray(5)
    for (i in intArray.indices) {
        intArray[i] = i * 3
    }
// [0, 3, 6, 9, 12]

// 5. Массив из 3 nullable строк
    val nullableStrings = arrayOf<String?>(null, "Hello", "Kotlin")

// 6. Копирование массива в цикле
    val source = intArrayOf(10, 20, 30, 40, 50)
    val copy = IntArray(source.size)
    for (i in source.indices) {
        copy[i] = source[i]
    }

// 7. Третий массив — разность двух массивов
    val a = intArrayOf(10, 20, 30, 40, 50)
    val b = intArrayOf(1, 2, 3, 4, 5)
    val diff = IntArray(a.size)
    for (i in a.indices) {
        diff[i] = a[i] - b[i]
    }
    println(diff.joinToString())  // 9, 18, 27, 36, 45

// 8. Поиск индекса элемента со значением 5 через while
    val numbers = intArrayOf(1, 3, 7, 5, 9, 2)
    var index = -1
    var i = 0
    while (i < numbers.size) {
        if (numbers[i] == 5) {
            index = i
            break
        }
        i++
    }
    println(index)  // 3 (или -1, если 5 нет)

// 9. Чётное/нечётное для каждого элемента
    val nums = intArrayOf(1, 2, 3, 4, 5, 6)
    for (n in nums) {
        val parity = if (n % 2 == 0) "чётное" else "нечётное"
        println("$n - $parity")
    }

    // 10. Функция поиска элемента, содержащего подстроку
    fun findContaining(arr: Array<String>, search: String) {
        for (item in arr) {
            if (item.contains(search)) {
                println(item)
            }
        }
    }
    findContaining(arrayOf("Hello World", "Kotlin", "World Peace"), "World")
// Hello World
// World Peace


    // 1. Пустой неизменяемый список
    val emptyList: List<Int> = emptyList()
// или
    val emptyList2 = listOf<Int>()

// 2. Неизменяемый список строк из трёх элементов
    val fixedList = listOf("Hello", "World", "Kotlin")

// 3. Изменяемый список целых 1..5
    val mutableInts = mutableListOf(1, 2, 3, 4, 5)

// 4. Добавление элементов
    mutableInts.add(6)
    mutableInts.add(7)
    mutableInts.add(8)
// или: mutableInts.addAll(listOf(6, 7, 8))

// 5. Удаление элемента из изменяемого списка строк
    val strings = mutableListOf("Hello", "World", "Kotlin")
    strings.remove("World")
// ["Hello", "Kotlin"]

// 6. Вывод каждого элемента списка через цикл
    val list6 = listOf(10, 20, 30, 40)
    for (item in list6) {
        println(item)
    }

// 7. Получение второго элемента по индексу
    val list7 = listOf("a", "b", "c")
    val second = list7[1]  // "b"

// 8. Изменение элемента по индексу
    val list8 = mutableListOf(1, 2, 3, 4, 5)
    list8[2] = 99
// [1, 2, 99, 4, 5]

// 9. Объединение двух списков через циклы
    val listA = listOf("a", "b", "c")
    val listB = listOf("d", "e", "f")
    val combined = mutableListOf<String>()
    for (item in listA) combined.add(item)
    for (item in listB) combined.add(item)
// [a, b, c, d, e, f]

// 10. Минимум и максимум через цикл
    val list10 = listOf(15, 3, 42, 8, 27)
    var min = list10[0]
    var max = list10[0]
    for (item in list10) {
        if (item < min) min = item
        if (item > max) max = item
    }
    println("min=$min, max=$max")  // min=3, max=42

// 11. Новый список только с чётными числами
    val list11 = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val evenList = mutableListOf<Int>()
    for (item in list11) {
        if (item % 2 == 0) evenList.add(item)
    }
// [2, 4, 6, 8]

    // 1. Пустое неизменяемое множество
    val emptySet: Set<Int> = emptySet()
// или
    val emptySet2 = setOf<Int>()

// 2. Неизменяемое множество из 3 элементов
    val fixedSet = setOf(1, 2, 3)

// 3. Изменяемое множество строк
    val mutableSet = mutableSetOf("Kotlin", "Java", "Scala")

// 4. Добавление элементов
    mutableSet.add("Swift")
    mutableSet.add("Go")
// [Kotlin, Java, Scala, Swift, Go]

// 5. Удаление элемента из множества
    val numbersSet = mutableSetOf(1, 2, 3, 4, 5)
    numbersSet.remove(2)
// [1, 3, 4, 5]

// 6. Вывод каждого элемента множества через цикл
    val set6 = setOf(10, 20, 30)
    for (item in set6) {
        println(item)
    }

    // 7. Функция проверки наличия строки в множестве через цикл
    fun containsString(set: Set<String>, target: String) {
        var found = false
        for (item in set) {
            if (item == target) {
                found = true
                break
            }
        }
        println(found)
    }

    containsString(setOf("Kotlin", "Java", "Scala"), "Java")   // true
    containsString(setOf("Kotlin", "Java", "Scala"), "Python") // false

// 8. Конвертация неизменяемого множества в изменяемый список через цикл
    val immutableSet = setOf("A", "B", "C")
    val mutableList = mutableListOf<String>()
    for (item in immutableSet) {
        mutableList.add(item)
    }
// [A, B, C]
}