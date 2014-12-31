// Solution-1b.scala
// Solution to Exercise 1 in "References & Mutability"
import com.atomicscala.AtomicTest._

var m = Map("Foo" -> "Bar")

m("Foo") = "Zub" // Try to modify an existing element

/* OUTPUT_SHOULD_CONTAIN
error: value update is not a member of scala.collection.immutable.Map[String,String]
m("Foo") = "Zub" // Try to modify an existing element
^
one error found
*/
