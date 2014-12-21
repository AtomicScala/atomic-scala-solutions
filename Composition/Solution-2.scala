// Solution-2.scala
// Solution to Exercise 2 in "Composition" (2nd edition)
import com.atomicscala.AtomicTest._

case class Mobility(mobility:String)
case class Vision(vision:String)
case class Manipulator(manipulator:String)

class Robot(val move:Mobility, val see:Vision, val touch:Manipulator) {
  override def toString = s"$move, $see, $touch"
}

val walker = new Robot(
  Mobility("Legs"),
  Vision("Visible Spectrum"),
  Manipulator("Magnet"))
walker is "Mobility(Legs), " +
  "Vision(Visible Spectrum)," +
  " Manipulator(Magnet)"
val crawler = new Robot(
  Mobility("Treads"),
  Vision("Infrared"),
  Manipulator("Claw"))
crawler is "Mobility(Treads)," +
  " Vision(Infrared), " +
  "Manipulator(Claw)"
val arial = new Robot(
  Mobility("Propeller"),
  Vision("UV"),
  Manipulator("None"))
arial is "Mobility(Propeller)," +
  " Vision(UV), Manipulator(None)"

/* OUTPUT_SHOULD_BE
Mobility(Legs), Vision(Visible Spectrum), Manipulator(Magnet)
Mobility(Treads), Vision(Infrared), Manipulator(Claw)
Mobility(Propeller), Vision(UV), Manipulator(None)
*/
