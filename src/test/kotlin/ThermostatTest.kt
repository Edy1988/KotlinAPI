import org.junit.Assert.*
import org.junit.Test

class ThermostatTest{
    @Test

   fun `default temp is 20`(){
        val thermostat = Thermostat()
    assertEquals(20, thermostat.getTemp())
    }

    @Test
    fun `can increase temp`(){
        val thermostat = Thermostat()
        thermostat.increase(1)
        assertEquals(21, thermostat.getTemp())
    }

    @Test
    fun `can decrease temp`(){
        val thermostat = Thermostat()
        thermostat.decrease(1)
        assertEquals(19, thermostat.getTemp())
    }

    @Test
    fun `min temp is 10, temp defaults to 10`(){
        val thermostat = Thermostat()
        thermostat.decrease(11)
        assertEquals(10, thermostat.getTemp())
    }

    @Test
    fun `max temp is 25, temp defaults to 25`(){
        val thermostat = Thermostat()
        thermostat.increase(6)
        assertEquals(25, thermostat.getTemp())
    }
}