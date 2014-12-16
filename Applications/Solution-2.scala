// Solution-2.scala
// Solution to Exercise 2 in "Applications"
// Compile, then run with
// > scala Battery1
import com.atomicscala.AtomicTest._

trait EnergySource

trait BatteryPower {
 def monitor(charge:Int):String = {
   if(charge < 20) "red"
   else if(charge < 40) "yellow"
   else "green"
 }
}

class Battery1 extends EnergySource with BatteryPower

object Battery1 extends App {
  val battery = new Battery1
  battery.monitor(80) is "green"
  battery.monitor(30) is "yellow"
  battery.monitor(10) is "red"
}

/* OUTPUT_SHOULD_BE
green
yellow
red
*/
