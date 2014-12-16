// Solution-1.scala
// Solution to Exercise 1 in "Traits"
import com.atomicscala.AtomicTest._

trait EnergySource

trait BatteryPower {
  def monitor(charge:Int):String = {
    if(charge < 20) "red"
    else if(charge < 40) "yellow"
    else "green"
  }
}

class Battery extends EnergySource with BatteryPower

val battery = new Battery
battery.monitor(80) is "green"
battery.monitor(30) is "yellow"
battery.monitor(10) is "red"

 // With pattern matching:

trait BatteryPower2 {
  def monitor(level:Int) = level match {
    case i if(i < 20) => "red"
    case i if(i <= 39) => "yellow"
    case _ => "green"
  }
}

val battery2 = new EnergySource with BatteryPower2
battery2.monitor(80) is "green"
battery2.monitor(30) is "yellow"
battery2.monitor(10) is "red"

/* OUTPUT_SHOULD_BE
green
yellow
red
green
yellow
red
*/
