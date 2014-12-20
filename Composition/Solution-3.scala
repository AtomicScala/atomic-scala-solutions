// Solution-3.scala
// Solution to Exercise 3 in "Composition" (2nd edition)
import com.atomicscala.AtomicTest._

case class Mobility(mobility:String)
case class Vision(vision:String)
case class Manipulator(manipulator:String)

class Robot(val move:Vector[Mobility], val see:Vector[Vision], val touch:Vector[Manipulator]) {
  override def toString = move.mkString(", ") + " | " + see.mkString(", ")  + " | " + touch.mkString(", ")
}

val bot = new Robot(
  Vector(
    Mobility("Propeller"),
    Mobility("Legs")),
  Vector(
    Vision("UV"),
    Vision("Visible Spectrum")),
  Vector(
    Manipulator("Magnet"),
    Manipulator("Claw"))
)

bot is "Mobility(Propeller)," +
" Mobility(Legs) | Vision(UV)," +
" Vision(Visible Spectrum) | " +
"Manipulator(Magnet), " +
"Manipulator(Claw)"

/* OUTPUT_SHOULD_BE
Mobility(Propeller), Mobility(Legs) | Vision(UV), Vision(Visible Spectrum) | Manipulator(Magnet), Manipulator(Claw)
*/
