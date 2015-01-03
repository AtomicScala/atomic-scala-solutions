// Solution-7.scala
// Solution to Exercise 7 in "References & Mutability"
import com.atomicscala.AtomicTest._

case class Mutable(val x:Int, var y:String)

val m = Mutable(42, "If any part of the object can change")

m is "Mutable(42,If any part of the object can change)"

m.y += ", then it's mutable"

m is "Mutable(42,If any part of the object can change, then it's mutable)"

/* OUTPUT_SHOULD_BE
Mutable(42,If any part of the object can change)
Mutable(42,If any part of the object can change, then it's mutable)
*/
