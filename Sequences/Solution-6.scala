// Solution-6.scala
// Solution to Exercise 6 in "Sequences"
import com.atomicscala.AtomicTest._

trait Contact {
  val email:String
}

class Person2(val first:String, val last:String) {
  override def toString = s"$first $last"
}

class Friend(first:String, last:String, val email:String)
  extends Person2(first:String, last:String) with Contact

val friends3 = Vector(
  new Friend("Zach", "Smith", "zach@smith.com"),
  new Friend("Mary", "Add", "mary@add.com"),
  new Friend("Sally","Taylor","sally@taylor.com"),
  new Friend("Mary", "Smith", "mary@smith.com")
)

val s3 = friends3.sortBy(_.last)
val s4 = s3.sortBy(_.first)
s4 is "Vector(Mary Add, Mary Smith, Sally Taylor, Zach Smith)"

/* OUTPUT_SHOULD_BE
Vector(Mary Add, Mary Smith, Sally Taylor, Zach Smith)
*/
