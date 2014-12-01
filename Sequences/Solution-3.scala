// Solution-3.scala
// Solution to Exercise 3 in "Sequences"
import com.atomicscala.AtomicTest._

case class Person(first:String, last:String, email:String) {
  override def toString = first + " " + last
  val fullName = toString
}

val p1 = Person("Zach", "Smith", "zach@smith.com")
val p2 = Person("Mary", "Add", "mary@add.com")
val p3 = Person("Sally", "Taylor", "sally@taylor.com")

val v = Vector(p1, p2, p3)
val sorted = v.sortBy(_.last)
sorted is "Vector(Mary Add, Zach Smith, Sally Taylor)"
