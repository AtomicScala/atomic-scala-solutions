// Solution-4.scala
// Solution to Exercise 4 in "Sequences"
import com.atomicscala.AtomicTest._

trait Contact {
  val email: String
}

class Person2(val first: String, val last: String) {
  override def toString = first + " " + last
}

class Friend(first: String, last: String, val email: String)  extends Person2(first: String, last: String) with Contact {
}

val f1 = new Friend("Mary", "Add", "mary@add.com")
val f2 = new Friend("Zach", "Smith", "zach@smith.com")
val f3 = new Friend("Sally", "Taylor", "sally@taylor.com")

val sorted2 = Vector(f1, f2, f3).sortBy(_.email)

sorted2 is "Vector(Mary Add, Sally Taylor, Zach Smith)"
