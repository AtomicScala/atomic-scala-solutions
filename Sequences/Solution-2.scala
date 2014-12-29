// Solution-2.scala
// Solution to Exercise 2 in "Sequences"
import com.atomicscala.AtomicTest._

case class Person(first:String, last:String, email:String) {
  override def toString = s"$first $last"
  val fullName = toString
}

val people = Vector(
  Person("John", "Smith", "john@smith.com"),
  Person("Mary", "Smith", "mary@smith.com"),
  Person("Sally", "Small", "sally@small.com")
)

people.size is 3

/* OUTPUT_SHOULD_BE
3
*/
