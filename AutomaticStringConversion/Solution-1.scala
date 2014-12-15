// Solution-1.scala
// Solution to Exercise 1 in "Automatic String Conversion"
import com.atomicscala.AtomicTest._

case class Bicycle(riders:Int) {
  override def toString = "Bicycle built for 2"
}

val forTwo = Bicycle(2)
forTwo is "Bicycle built for 2"

/* OUTPUT_SHOULD_BE
Bicycle built for 2
*/
