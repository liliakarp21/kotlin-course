import org.example.lessons.lesson18.homeworks.Powerable

abstract class PoweredDevice : Powerable {
    protected var isPoweredOn: Boolean = false
        private set

    override fun powerOn() {
        if (isPoweredOn) {
            println("$deviceName уже включён")
            return
        }
        isPoweredOn = true
        println("$deviceName включён")
    }

    override fun powerOff() {
        if (!isPoweredOn) {
            println("$deviceName уже выключен")
            return
        }
        isPoweredOn = false
        println("$deviceName выключен")
    }

    abstract val deviceName: String
}