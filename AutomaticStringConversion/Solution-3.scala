// Solution-3.scala
// Solution to Exercise 3 in "Automatic String Conversion"
import com.atomicscala.AtomicTest._

case class Cycle2(riders:Int) {
  override def toString = riders match {
    case 1 => "Unicycle"
    case 2 => "Bicycle"
    case 3 => "Tricycle"
    case r:Int if(r < 0) => "That's not a cycle!"
    case _ => "Cycle with " + riders + " wheels"
  }
}

val uni = Cycle2(1)
uni is "Unicycle"
val bike = Cycle2(2)
bike is "Bicycle"
val quad = Cycle2(4)
quad is "Cycle with 4 wheels"

Cycle2(-2) is "That's not a cycle!"

/* OUTPUT_SHOULD_BE
Unicycle
Bicycle
Cycle with 4 wheels
That's not a cycle!
*/
