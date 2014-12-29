// Solution-5.scala
// Solution to Exercise 5 in "Sequences"
import com.atomicscala.AtomicTest._

trait Contact {
  val email:String
}

class Person2(val first:String, val last:String) {
  override def toString = s"$first $last"
}

class Friend(first:String, last:String, val email:String)
  extends Person2(first:String, last:String) with Contact

val friends2 = Vector(
  new Friend("Zach", "Smith", "zach@smith.com"),
  new Friend("Mary", "Add", "mary@add.com"),
  new Friend("Sally","Taylor","sally@taylor.com"),
  new Friend("Mary", "Smith", "mary@smith.com")
)

val s1 = friends2.sortBy(_.first)
val s2 = s1.sortBy(_.last)
s2 is "Vector(Mary Add, Mary Smith, Zach Smith, Sally Taylor)"

/* OUTPUT_SHOULD_BE
Vector(Mary Add, Mary Smith, Zach Smith, Sally Taylor)
*/
