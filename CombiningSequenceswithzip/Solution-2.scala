// Solution-2.scala
// Solution to Exercise 2 in "Combining Sequences with zip"
import com.atomicscala.AtomicTest._

val people = Vector("Sally Smith",
  "Dan Jones", "Tom Brown", "Betsy Blanc",
  "Stormy Morgan")
val size = people.size
val group1 = people.take(size/2)
val group2 = people.takeRight(size/2)
val pairs = group1 zip group2

pairs is Vector(
  ("Sally Smith","Betsy Blanc"),
  ("Dan Jones","Stormy Morgan"))

/* OUTPUT_SHOULD_BE
Vector((Sally Smith,Betsy Blanc), (Dan Jones,Stormy Morgan))
*/
