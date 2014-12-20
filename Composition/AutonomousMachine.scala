// Solution-1.scala
// Solution to Exercise 1 in "Composition" (2nd edition)
import com.atomicscala.AtomicTest._

trait Mobility {
  def mobility:String
}

trait Vision {
  def vision:String
}

trait Manipulator {
  def manipulator:String
}

class Drone(val mobility:String, val vision:String, val manipulator:String)
extends Mobility with Vision with Manipulator {
  override def toString = s"$mobility, $vision, $manipulator"
}

val walker = new Drone("Legs", "Visible Spectrum", "Magnet")
walker is "Legs, Visible Spectrum, Magnet"
val crawler = new Drone("Treads", "Infrared", "Claw")
crawler is "Treads, Infrared, Claw"
val arial = new Drone("Propeller", "UV", "None")

arial is "Propeller, UV, None"

/* OUTPUT_SHOULD_BE
Legs, Visible Spectrum, Magnet
Treads, Infrared, Claw
Propeller, UV, None
*/
