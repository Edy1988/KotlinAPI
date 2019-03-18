import org.junit.Assert.*
import org.junit.Test

class ThermostatTest{
    @Test

   fun `show current temp`(){
        val thermostat = Thermostat()
    assertEquals(20, thermostat.getTemp())
    }

    @Test
    fun `can increase temp `(){
        val thermostat = Thermostat()
        thermostat.increase(1)
        assertEquals(21, thermostat.getTemp())
    }

    @Test
    fun `can decrease temp `(){
        val thermostat = Thermostat()
        thermostat.decrease(1)
        assertEquals(19, thermostat.getTemp())
    }
}