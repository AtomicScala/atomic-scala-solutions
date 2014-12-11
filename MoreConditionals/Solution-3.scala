// Solution-3.scala
// Solution to Exercise 3 in "More Conditionals"
import com.atomicscala.AtomicTest._

def isPalIgnoreCase(str:String):Boolean = {
  val s = str.toUpperCase.reverse
  s.equals(str.toUpperCase)
}

isPalIgnoreCase("Bob") is true
isPalIgnoreCase("DAD") is true
isPalIgnoreCase("Blob") is false

/* OUTPUT_SHOULD_BE
true
true
false
*/
