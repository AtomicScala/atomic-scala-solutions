// Solution-4.scala
// Solution to Exercise 4 in "Sequences"
import com.atomicscala.AtomicTest._

trait Contact {
  val email:String
}

class Person(val first:String, val last:String) {
  override def toString = s"$first $last"
}

class Friend(first:String, last:String, val email:String)
  extends Person(first:String, last:String) with Contact

val friends = Vector(
  new Friend("Zach", "Smith", "zach@smith.com"),
  new Friend("Mary", "Add", "mary@add.com"),
  new Friend("Sally","Taylor","sally@taylor.com")
)

val sorted = friends.sortBy(_.email)

sorted is "Vector(Mary Add, Sally Taylor, Zach Smith)"

/* OUTPUT_SHOULD_BE
Vector(Mary Add, Sally Taylor, Zach Smith)
*/
