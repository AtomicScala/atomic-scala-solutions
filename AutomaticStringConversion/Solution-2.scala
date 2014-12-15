// Solution-2.scala
// Solution to Exercise 2 in "Automatic String Conversion"
import com.atomicscala.AtomicTest._

case class Cycle(riders:Int) {
  override def toString = riders match {
    case 1 => "Unicycle"
    case 2 => "Bicycle"
    case 3 => "Tricycle"
    case _ => "Cycle with " + riders + " wheels"
  }
}

val c1 = Cycle(1)
c1 is "Unicycle"
val c2 = Cycle(2)
c2 is "Bicycle"
val cn = Cycle(5)
cn is "Cycle with 5 wheels"

/* OUTPUT_SHOULD_BE
Unicycle
Bicycle
Cycle with 5 wheels
*/
