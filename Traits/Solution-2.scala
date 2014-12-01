// Solution-2.scala
// Solution to Exercise 2 in "Traits"
import com.atomicscala.AtomicTest._

trait BatteryPower {
 def monitor(charge:Int):String = {
   if (charge < 20) "red"
   else if (charge < 40) "yellow"
   else "green"
 }
}

trait Toy
class BatteryPoweredToy extends Toy with BatteryPower

val toy = new BatteryPoweredToy
toy.monitor(50) is "green"
