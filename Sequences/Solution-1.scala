// Solution-1.scala
// Solution to Exercise 1 in "Sequences"
import com.atomicscala.AtomicTest._

case class Person(first:String, last:String, email:String) {
  override def toString = s"$first $last"
  val fullName = toString
}

val p = Person("John", "Smith", "john@smith.com")
p.fullName is "John Smith"
p.first is "John"
p.email is "john@smith.com"

/* OUTPUT_SHOULD_BE
John Smith
John
john@smith.com
*/
