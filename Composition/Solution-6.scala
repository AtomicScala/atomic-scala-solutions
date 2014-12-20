// Solution-6.scala
// Solution to Exercise 6 in "Composition" (2nd edition)
import com.atomicscala.AtomicTest._

case class Mobility(mobility:String)
case class Vision(vision:String)
case class Manipulator(manipulator:String)

class Robot {
  var mobility = Vector[Mobility]()
  var vision = Vector[Vision]()
  var manipulator = Vector[Manipulator]()
  def +(m:Mobility) = {
  	mobility = mobility :+ m
  	this
  }
  def +(v:Vision) = {
  	vision = vision :+ v
  	this
  }
  def +(m:Manipulator) = {
  	manipulator = manipulator :+ m
  	this
  }
  override def toString =
    mobility.mkString(", ") + " | " +
    vision.mkString(", ") + " | " +
    manipulator.mkString(", ")
}

val bot = new Robot +
  Mobility("Propeller") +
  Mobility("Legs") +
  Vision("UV") +
  Vision("Visible Spectrum") +
  Manipulator("Magnet") +
  Manipulator("Claw")

bot is "Mobility(Propeller)," +
" Mobility(Legs) | Vision(UV)," +
" Vision(Visible Spectrum) |" +
" Manipulator(Magnet)," +
" Manipulator(Claw)"

/* OUTPUT_SHOULD_BE
Mobility(Propeller), Mobility(Legs) | Vision(UV), Vision(Visible Spectrum) | Manipulator(Magnet), Manipulator(Claw)
*/
