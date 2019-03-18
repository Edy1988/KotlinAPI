class Thermostat {
    private var temp: Int = 20

    fun getTemp(): Int {
        return this.temp
    }

    fun increase(i: Int) {
       this.temp += i
        if (this.temp > 25){
            this.temp = 25
        }

    }

    fun decrease(i: Int) {
        this.temp -= i
        if(this.temp < 10){
            this.temp = 10
        }
    }
}