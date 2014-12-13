// Solution-2.scala
// Solution to Exercise 2 in "Parameterized Types"
import com.atomicscala.AtomicTest._

def explicitList(v1:Vector[Double]):List[Double] = {
    v1.toList
}

explicitList(Vector(10.0, 20.0)) is List(10.0, 20.0)
explicitList(Vector(1, 2, 3)) is List(1.0, 2.0, 3.0)

/* OUTPUT_SHOULD_BE
List(10.0, 20.0)
List(1.0, 2.0, 3.0)
*/
