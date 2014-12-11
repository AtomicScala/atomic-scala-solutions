// Solution-2.scala
// Solution to Exercise 2 in "Pattern Matching"
import com.atomicscala.AtomicTest._

def oneOrTheOther(exp:Boolean):String = {
  exp match {
    case true =>"True!" // No 'return'
    case _ => "It's false"
  }
}

val v = Vector(1)
val v2 = Vector(3, 4)
oneOrTheOther(v == v.reverse) is "True!"
oneOrTheOther(v2 == v2.reverse) is "It's false"

/* OUTPUT_SHOULD_BE
True!
It's false
*/
