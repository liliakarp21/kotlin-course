class ArcadeMachine(
    // ---- Публичные неизменяемые свойства (задаются при создании) ----
    val color: String,                  // цвет
    val model: String,                  // модель
    val owner: String,                  // владелец
    val supportPhone: String,           // телефон поддержки
    val sessionPrice: Int,              // стоимость одного игрового сеанса

    // ---- Приватные неизменяемые ----
    private val pinCode: String         // пин-код автомата
) {
    // ---- Приватные изменяемые поля (внутреннее состояние) ----
    private var isOn: Boolean = false           // включен
    private var isOsLoaded: Boolean = false     // ОС загружена
    private var hasJoystick: Boolean = false    // наличие джойстика
    private var balance: Int = 0                // баланс вырученных средств
    private var isSessionPaid: Boolean = false  // игровой сеанс оплачен

    // ---- Приватный список установленных игр ----
    private val installedGames: MutableList<String> = mutableListOf()

    // ==================== Управление питанием ====================

    fun turnOn(): Boolean {
        if (isOn) return false
        isOn = true
        return true
    }

    fun turnOff(): Boolean {
        if (!isOn) return false
        // корректное выключение: завершить ОС, если загружена
        if (isOsLoaded) finishOs()
        isOn = false
        return true
    }

    // ==================== Операционная система ====================

    fun loadOs(): Boolean {
        if (!isOn) return false
        if (isOsLoaded) return false
        isOsLoaded = true
        return true
    }

    fun finishOs(): Boolean {
        if (!isOsLoaded) return false
        isOsLoaded = false
        isSessionPaid = false        // сеанс сбрасывается
        return true
    }

    // ==================== Игры ====================

    fun showGames(): List<String> {
        return installedGames.toList()   // копия — неизменяемый список
    }

    fun turnOnGame(gameName: String): Boolean {
        if (!isOn || !isOsLoaded) return false
        if (!isSessionPaid) return false
        if (gameName !in installedGames) return false
        isSessionPaid = false            // сеанс потрачен
        return true
    }

    // ==================== Оплата ====================

    fun payForSession(amount: Int): Boolean {
        if (!isOn || !isOsLoaded) return false
        if (isSessionPaid) return false
        if (amount < sessionPrice) return false
        balance += amount
        isSessionPaid = true
        return true
    }

    // ==================== Выручка / сейф ====================

    fun withdrawCash(pin: String): Int {
        if (pin != pinCode) return 0
        return openSafeAndGiveCash()
    }

    // Приватный метод — доступен только внутри класса
    private fun openSafeAndGiveCash(): Int {
        val amount = balance
        balance = 0
        return amount
    }
}