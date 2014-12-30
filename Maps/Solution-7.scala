// Solution-7.scala
// Solution to Exercise 7 in "Maps"
import com.atomicscala.AtomicTest._

case class Person(name:String)

val m = Map(Person("Bob") -> "CEO", Person("Janice") -> "CFO")

m(Person("Janice")) is "CFO"

/* OUTPUT_SHOULD_BE
CFO
*/
