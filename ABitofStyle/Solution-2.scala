// Solution-2.scala
// Solution to Exercise 2 in "A Bit of Style"
import com.atomicscala.AtomicTest._

class Exclaim2(val s:String) {
  def parens() = s + "!"
  val noParens = s + "!"
}

val e2 = new Exclaim2("yes")
e2.noParens is "yes!"
e2.parens() is "yes!"

/* OUTPUT_SHOULD_BE
yes!
yes!
*/
