// Solution-4.scala
// Solution to Exercise 4 in "Composition" (2nd edition)
import com.atomicscala.AtomicTest._

trait Ability
case class Mobility(mobility:String) extends Ability
case class Vision(vision:String) extends Ability
case class Manipulator(manipulator:String) extends Ability

class Drone(val abilities:Vector[Ability]) {
  override def toString = abilities.mkString(", ")
}

val arialWalker = new Drone(
  Vector(Mobility("Propeller"), Mobility("Legs"),
    Vision("UV"), Vision("Visible Spectrum"),
    Manipulator("Magnet"), Manipulator("Claw"))
)

arialWalker is "Mobility(Propeller), Mobility(Legs), Vision(UV), Vision(Visible Spectrum), Manipulator(Magnet), Manipulator(Claw)"

/* OUTPUT_SHOULD_BE
Mobility(Propeller), Mobility(Legs), Vision(UV), Vision(Visible Spectrum), Manipulator(Magnet), Manipulator(Claw)
*/
