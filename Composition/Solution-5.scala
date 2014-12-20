// Solution-5.scala
// Solution to Exercise 5 in "Composition" (2nd edition)
import com.atomicscala.AtomicTest._

case class Mobility(mobility:String)
case class Vision(vision:String)
case class Manipulator(manipulator:String)

class Robot {
  var mobility = Vector[Mobility]()
  var vision = Vector[Vision]()
  var manipulator = Vector[Manipulator]()
  def addMobility(m:Mobility) = mobility = mobility :+ m
  def addVision(v:Vision) = vision = vision :+ v
  def addManipulator(m:Manipulator) = manipulator = manipulator :+ m
  override def toString =
    mobility.mkString(", ") + " | " +
    vision.mkString(", ") + " | " +
    manipulator.mkString(", ")
}

val bot = new Robot
bot.addMobility(
  Mobility("Propeller"))
bot.addMobility(
  Mobility("Legs"))
bot.addVision(
  Vision("UV"))
bot.addVision(Vision(
  "Visible Spectrum"))
bot.addManipulator(
  Manipulator("Magnet"))
bot.addManipulator(
  Manipulator("Claw"))

bot is "Mobility(Propeller)," +
" Mobility(Legs) | Vision(UV)," +
" Vision(Visible Spectrum) | " +
"Manipulator(Magnet)," +
" Manipulator(Claw)"

/* OUTPUT_SHOULD_BE
Mobility(Propeller), Mobility(Legs) | Vision(UV), Vision(Visible Spectrum) | Manipulator(Magnet), Manipulator(Claw)
*/
