// Solution-2.scala
// Solution to Exercise 2 in "map & reduce"
import com.atomicscala.AtomicTest._

val v = Vector(1, 2, 3, 4)
// This doesn't produce a result:
v.foreach(n=>((n*11) + 10)) is Vector(21, 32, 43, 54)

/* OUTPUT_SHOULD_BE
()
[Error] expected:
Vector(21, 32, 43, 54)
*/
