// Solution-1.scala
// Solution to Exercise 1 in "Traits"
import com.atomicscala.AtomicTest._

trait EnergySource

trait BatteryPower {
 def monitor(charge:Int):String = {
   if (charge < 20) "red"
   else if (charge < 40) "yellow"
   else "green"
 }
}

class Battery extends EnergySource with BatteryPower
val battery = new Battery
battery.monitor(80) is "green"
battery.monitor(30) is "yellow"
battery.monitor(10) is "red"

 /* or, fancier solution

trait BatteryPower {
  def monitor(level:Int) = level match {
  case i: Int if (i < 20) => "red"
  case i: Int if (i <= 39) => "yellow"
  case _ => "green"
  }
}

val batteryPower = new EnergySource with BatteryPower
batteryPower.monitor(80) is "green"
batteryPower.monitor(30) is "yellow"
batteryPower.monitor(10) is "red"

*/
