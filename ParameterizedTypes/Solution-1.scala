// Solution-1.scala
// Solution to Exercise 1 in "Parameterized Types"
import com.atomicscala.AtomicTest._

def explicitDouble(v1:Double, v2:Double, v3:Double):Vector[Double] = {
  Vector(v1, v2, v3)
}

explicitDouble(1, 2, 3) is Vector(1.0, 2.0, 3.0)

/* OUTPUT_SHOULD_BE
Vector(1.0, 2.0, 3.0)
*/
