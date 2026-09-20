package org.example.lessons.lesson06.homeworks

fun main() {
    example1(5)
    example2(4)
    example3(10)
    example4(2000)
    example5("xls")
    example6(30.0, 'C')
    example7(40)
    example8(35)
}

fun example1(arg: Int) {
    when (arg) {
        in 3..5 -> println("Весна")
        in 6..8 -> println("Лето")
        in 9..11 -> println("Осень")
        else -> println("Зима")
    }
}

fun example2(dogAge: Int) {
    var humanAge: Double
    when (dogAge) {
        in 1..2 -> {
            humanAge = dogAge * 10.5
            println(humanAge)
        }
        else -> {
            humanAge = 2* 10.5 + (dogAge-2) * 4
            println(humanAge)
        }
    }
}

fun example3(distance: Int){
    when(distance){
        in 0 .. 1-> println("пешком")
        in 2 .. 5 -> println("велосипед")
        else -> println("автотранспорт")
    }
}

fun example4(cost: Int){
    var bonus: Int
    when (cost){
        in 1..1000 ->{
            bonus = (cost/100) * 2
            println(bonus)
        }
        else -> {
            bonus = (cost-1000)/100 * 3 + 20
            println(bonus)
        }
    }
}

fun example5(file: String){
    when(file){
        "txt" -> println("Текстовый документ")
        "jpg" -> println("Изображение")
        "jpeg" -> println("Изображение")
        "xls" -> println("Таблица")
        "csv" -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}

fun example6(degree: Double, arg2: Char){
    val result: Double
    when (arg2){
        'C' -> {
            result = (degree * 1.8) + 32
            print(result )
            print("F")
        }
        'F' -> {
            result = (degree - 32) * 0.5555555
            print(result )
            print("С")
        }
    }

}

fun example7(degree: Int){
    when(degree){
        in -30 .. 9 -> println("куртка и шапка")
        in 10 .. 18 -> println("ветровка")
        in 19 .. 35 -> println("футболка и шорты")
        else -> println("Рекомендую не выходить из дома")
    }
}

fun example8(age: Int){
    when(age){
        in 0 .. 9 -> println("детские")
        in 10 .. 18 -> println("подростковые")
        else -> println("18+")
    }
}
