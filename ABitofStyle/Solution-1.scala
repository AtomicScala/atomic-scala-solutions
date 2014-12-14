// Solution-1.scala
// Solution to Exercise 1 in "A Bit of Style"
import com.atomicscala.AtomicTest._

class Exclaim(val s:String) {
  def parens() = s + "!"
  def noParens = s + "!"
}

val e = new Exclaim("yes")
e.noParens is "yes!"
e.parens() is "yes!"

/* OUTPUT_SHOULD_BE
yes!
yes!
*/
