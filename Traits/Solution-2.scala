// Solution-2.scala
// Solution to Exercise 2 in "Traits"
import com.atomicscala.AtomicTest._

trait BatteryPower {
  def monitor(level:Int) = level match {
    case i if(i < 20) => "red"
    case i if(i <= 39) => "yellow"
    case _ => "green"
  }
}

trait Toy

class BatteryPoweredToy extends Toy with BatteryPower

val toy = new BatteryPoweredToy
toy.monitor(50) is "green"

/* OUTPUT_SHOULD_BE
green
*/
