// Solution-2.scala
// Solution to Exercise 2 in "Case Classes"
import com.atomicscala.AtomicTest._

case class Person(first:String, last:String, email:String)

val people = Vector(
  Person("Jane", "Smile", "jane@smile.com"),
  Person("Ron", "House", "ron@house.com"),
  Person("Sally", "Dove", "sally@dove.com"))

people(0) is "Person(Jane,Smile,jane@smile.com)"
people(1) is "Person(Ron,House,ron@house.com)"
people(2) is "Person(Sally,Dove,sally@dove.com)"

/* OUTPUT_SHOULD_BE
Person(Jane,Smile,jane@smile.com)
Person(Ron,House,ron@house.com)
Person(Sally,Dove,sally@dove.com)
*/
