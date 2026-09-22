package org.example.lessons.lesson07.homeworks
fun main () {
//Прямой диапазон
//Напишите цикл for, который выводит числа от 1 до 5.
    println("example 1:")
    for (i in 1..5) {
        println(i)
    }
//Напишите цикл for, который выводит четные числа от 1 до 10.
    println("example 2:")
    for (i in 1..10) {
       if (i % 2 == 0) println(i)
    }

 //Обратный диапазон
//Создайте цикл for, который выводит числа от 5 до 1.
    println("example 3:")
    for (i in 5 downTo 1) {
        println(i)
    }
//Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    println("example 4:")
    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    //С шагом (step)
    //Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    println("example 5:")
    for(i in 1 .. 9 step 2){
        println(i)
    }
    //Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    println("example 6:")
    for(i in 1 .. 20 step 3){
        println(i)
    }

  //Использование до (until)
    //Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
    println("example 7:")
    val size = 10
    for(i in 3 until size step 2){
        println(i)
    }

    //Задания для цикла while
    //Цикл while
    //Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    println("example 8:")
    var counter = 0
    while(counter++ < 5){
        println(counter * counter)
    }
    //Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    println("example 9:")
    var i = 11
    while (i-- > 5){
        println(i)
    }

    //Цикл do while
    //Используйте цикл do while, чтобы вывести числа от 5 до 1.
    println("example 10:")
    var b = 5
    do {
        println(b)
        b--
    }while (b>0)
    //Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
    println("example 11:")
    var c = 5
    do {
        println(c)
        c++
    }while (c <= 10)

    //Задания для прерывания и пропуска итерации
    //Использование break
    //Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    println("example 12:")
    for(i in 1 .. 10){
        println(i)
        if (i == 6) break
    }
    //Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    println("example 13:")
    var d = 1
    while (true) {
        println(d++)
        if (d == 10) break
    }

    //Использование continue
    //В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    println("example 14:")
    for (i in 1 .. 10){
        if (i % 2 == 0) continue
        println(i)
    }
    //Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    println("example 15:")
    var e = 0
    while (e <10){
        e++
        if (e % 3 == 0) continue
        println(e)

    }
}