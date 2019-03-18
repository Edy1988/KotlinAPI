class Thermostat {

    private var temp: Int = 20

    fun getTemp(): Int {
        return this.temp
    }

    fun increase(i: Int) {
       temp += i
        if (this.temp <= 25) return
        this.temp = 25

    }

    fun decrease(i: Int) {
        temp -= i
        if (this.temp >= 10) return
        this.temp = 10
    }
}