// Solution-1.scala
// Solution to Exercise 1 in "Case Classes"
import com.atomicscala.AtomicTest._

case class Person(first:String, last:String, email:String)

val p = Person("Jane", "Smile", "jane@smile.com")
p.first is "Jane"
p.last is "Smile"
p.email is "jane@smile.com"

/* OUTPUT_SHOULD_BE
Jane
Smile
jane@smile.com
*/
