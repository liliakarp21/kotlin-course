class ChildrenClass(
    val privateVal: String,
    protectedVal: String,          // параметр, не поле (как в исходнике)
    val publicVal: String          // сделали val, чтобы было доступно в main()
) : BaseClass(privateVal, protectedVal, publicVal) {

    // 3–4: разрешаем установить "Антонио Бандераса"
    override fun verifyPublicField(value: String): Boolean {
        return value == "Антонио Бандераса" || super.verifyPublicField(value)
    }

    // 5: публичный сеттер для protectedField базового класса
    fun setProtectedField(value: String) {
        protectedField = value
    }

    // 6: НЕВОЗМОЖНО — privateField в BaseClass private, наследник его не видит.
    //    Без правки BaseClass сеттер для privateField не сделать.
    //    (Если бы поле было protected — можно было бы.)

    // 12: своя privatePrint — НЕ override, просто новая функция
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    // 8: переопределение generate — getAll() покажет версию наследника
    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }
}