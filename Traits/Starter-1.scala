// Starter Code for Exercise 1
// From "Traits" atom
import com.atomicscala.AtomicTest._

class Battery extends EnergySource with BatteryPower
val battery = new Battery
battery.monitor(80) is "green"
battery.monitor(30) is "yellow"
battery.monitor(10) is "red"
