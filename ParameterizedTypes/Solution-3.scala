// Solution-3.scala
// Solution to Exercise 3 in "Parameterized Types"
import com.atomicscala.AtomicTest._

def explicitSet(v1:Vector[Double]):Set[Double] = {
  v1.toSet
}

explicitSet(Vector(10.0, 20.0, 10.0)) is Set(10.0, 20.0)
explicitSet(Vector(1, 2, 3, 2, 3, 4)) is Set(1.0, 2.0, 3.0, 4.0)

/* OUTPUT_SHOULD_BE
Set(10.0, 20.0)
Set(1.0, 2.0, 3.0, 4.0)
*/
