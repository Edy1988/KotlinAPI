class Thermostat {
    private var temp: Int = 20

    fun getTemp(): Int {
        return this.temp
    }

    fun increase(i: Int) {
       this.temp += i

    }

    fun decrease(i: Int) {
        this.temp -= i
    }
}