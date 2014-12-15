// Solution-3.scala
// Solution to Exercise 3 in "Inheritance"
import com.atomicscala.AtomicTest._

class Cycle {
  val wheels = 2
  def ride = "Riding"
}

class Bicycle extends Cycle

val c = new Cycle
c.ride is "Riding"
val b = new Bicycle
b.ride is "Riding"
b.wheels is 2

/* OUTPUT_SHOULD_BE
Riding
Riding
2
*/
