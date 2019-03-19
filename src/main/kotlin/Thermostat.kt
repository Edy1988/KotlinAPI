class Thermostat {

    private var temp = 20
    private var powerSaveMode = true


    fun getTemp(): Int {
        return this.temp
    }

    fun increase(i: Int) {
        temp += i
        if (!powerSaveMode && this.temp > 32) { this.temp = 32 }

        if (powerSaveMode && this.temp >= 25) { this.temp = 25 }
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

    fun reset() {
        this.temp = 20
    }

    fun showUsage(): String {
        if (this.temp < 18) return "Low usage"
        if (this.temp < 25) return "Medium usage"
        return "High usage"

    }

}