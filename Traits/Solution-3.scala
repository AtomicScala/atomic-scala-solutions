// Solution-3.scala
// Solution to Exercise 3 in "Traits"
import com.atomicscala.AtomicTest._

trait BatteryPower {
  def monitor(level:Int) = level match {
    case i if(i < 20) => "red"
    case i if(i <= 39) => "yellow"
    case _ => "green"
  }
}

trait Toy

val toy2 = new Toy with BatteryPower
toy2.monitor(50) is "green"

/* OUTPUT_SHOULD_BE
green
*/
