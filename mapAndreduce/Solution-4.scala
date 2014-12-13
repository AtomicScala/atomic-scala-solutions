// Solution-4.scala
// Solution to Exercise 4 in "map & reduce"
import com.atomicscala.AtomicTest._
import scala.collection.immutable.VectorBuilder

val v = Vector(1, 2, 3, 4)
var vb2 = new VectorBuilder[Int]()
for(n <- v)
  vb2 += (n+1)

vb2.result is Vector(2, 3, 4, 5)

/* OUTPUT_SHOULD_BE
Vector(2, 3, 4, 5)
*/
