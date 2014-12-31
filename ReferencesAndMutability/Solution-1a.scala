// Solution-1a.scala
// Solution to Exercise 1 in "References & Mutability"
import com.atomicscala.AtomicTest._

var m = Map("Foo" -> "Bar")

m("Goat") = "Calico" // Try to add a new pair

/* OUTPUT_SHOULD_CONTAIN
error: value update is not a member of scala.collection.immutable.Map[String,String]
m("Goat") = "Calico" // Try to add a new pair
^
one error found
*/
