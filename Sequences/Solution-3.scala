// Solution-3.scala
// Solution to Exercise 3 in "Sequences"
import com.atomicscala.AtomicTest._

case class Person(first:String, last:String, email:String)

val people = Vector(
  Person("Zach", "Smith", "zach@smith.com"),
  Person("Mary", "Add", "mary@add.com"),
  Person("Sally", "Taylor", "sally@taylor.com")
)

val sorted = people.sortBy(_.last)
sorted is "Vector(Person(Mary,Add,mary@add.com), Person(Zach,Smith,zach@smith.com), Person(Sally,Taylor,sally@taylor.com))"

/* OUTPUT_SHOULD_BE
Vector(Person(Mary,Add,mary@add.com), Person(Zach,Smith,zach@smith.com), Person(Sally,Taylor,sally@taylor.com))
*/
