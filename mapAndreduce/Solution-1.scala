// Solution-1.scala
// Solution to Exercise 1 in "map & reduce"
import com.atomicscala.AtomicTest._

val v = Vector(1, 2, 3, 4)
v.map(n => ((n * 11) + 10)) is Vector(21, 32, 43, 54)

/* OUTPUT_SHOULD_BE
Vector(21, 32, 43, 54)
*/
