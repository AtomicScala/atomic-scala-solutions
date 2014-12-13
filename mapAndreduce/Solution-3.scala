// Solution-3.scala
// Solution to Exercise 3 in "map & reduce"
import com.atomicscala.AtomicTest._
import scala.collection.immutable.VectorBuilder

val v = Vector(1, 2, 3, 4)

var vb1 = new VectorBuilder[Int]()
for(n <- v)
  vb1 += (n * 11) + 10

vb1.result is Vector(21, 32, 43, 54)

/* OUTPUT_SHOULD_BE
Vector(21, 32, 43, 54)
*/
