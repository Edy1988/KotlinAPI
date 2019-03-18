class Thermostat {

    private var temp = 20
    private var powerSaveMode = false


    fun getTemp(): Int {
        return this.temp
    }

    fun increase(i: Int) {
       temp += i
        if (!powerSaveMode && this.temp > 32) {this.temp = 32}

        if (powerSaveMode && this.temp >= 25) {this.temp = 25}
    }

    fun decrease(i: Int) {
        temp -= i
        if (this.temp >= 10) return
        this.temp = 10
    }

    fun powerSaveOff() {
        this.powerSaveMode = false
    }

    fun powerSaveOn() {
        this.powerSaveMode = true
    }
}