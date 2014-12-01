// Solution-3.scala
// Solution to Exercise 3 in "Traits"
import com.atomicscala.AtomicTest._

trait BatteryPower {
 def monitor(charge: Int) : String = {
   if (charge < 20) "red"
   else if (charge < 40) "yellow"
   else "green"
 }
}

trait Toy

val toy2 = new Toy with BatteryPower
toy2.monitor(50) is "green"
