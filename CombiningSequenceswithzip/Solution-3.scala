// Solution-3.scala
// Solution to Exercise 3 in "Combining Sequences with zip"
import com.atomicscala.AtomicTest._

val people = List("Sally Smith",
  "Dan Jones", "Tom Brown", "Betsy Blanc",
  "Stormy Morgan", "Hal Goodsen")
val size = people.size
val group1 = people.take(size/2)
val group2 = people.takeRight(size/2)
val pairs = group1 zip group2

pairs is List(
  ("Sally Smith","Betsy Blanc"),
  ("Dan Jones","Stormy Morgan"),
  ("Tom Brown","Hal Goodsen"))

/* OUTPUT_SHOULD_BE
List((Sally Smith,Betsy Blanc), (Dan Jones,Stormy Morgan), (Tom Brown,Hal Goodsen))
*/
