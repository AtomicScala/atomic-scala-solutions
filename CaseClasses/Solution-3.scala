// Solution-3.scala
// Solution to Exercise 3 in "Case Classes"
import com.atomicscala.AtomicTest._

case class Dog(name:String, breed:String)

val dogs = Vector(Dog("Fido", "Golden Lab"),
                  Dog("Ruff", "Alaskan Malamute"),
                  Dog("Fifi", "Miniature Poodle"))

dogs(0) is "Dog(Fido,Golden Lab)"
dogs(1) is "Dog(Ruff,Alaskan Malamute)"
dogs(2) is "Dog(Fifi,Miniature Poodle)"

/* OUTPUT_SHOULD_BE
Dog(Fido,Golden Lab)
Dog(Ruff,Alaskan Malamute)
Dog(Fifi,Miniature Poodle)
*/
