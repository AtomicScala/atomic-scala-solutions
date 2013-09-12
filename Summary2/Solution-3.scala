// Solution-3.scala
// Solution to Exercise 3 in "Summary 2"
import com.atomicscala.AtomicTest._

val v = Vector('a', 45, "silly", 76.4)
// v.max
println("v.max is not defined")

/* You should do this in the REPL
scala> val v = Vector('a', 45, "silly", 76.4)
v: scala.collection.immutable.Vector[Any] = Vector(a, 45, silly, 76.4)

scala> v.max
<console>:9: error: No implicit Ordering defined for Any.
              v.max

*/
