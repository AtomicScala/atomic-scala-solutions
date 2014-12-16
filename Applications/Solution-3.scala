// Solution-3.scala
// Solution to Exercise 3 in "Applications"
// Compile, then run with
// > scala Battery2 10 30 50
import com.atomicscala.AtomicTest._

trait BatteryPower {
 def monitor(charge:Int):String = {
   if(charge < 20) "red"
   else if(charge < 40) "yellow"
   else "green"
 }
}

trait EnergySource

class Battery2 extends EnergySource with BatteryPower

object Battery2 extends App {
  val battery = new Battery2
  for(arg <- args)
    println(battery.monitor(arg.toInt))
}

/* OUTPUT_SHOULD_BE
red
yellow
green
*/
