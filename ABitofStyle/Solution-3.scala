// Solution-3.scala
// Solution to Exercise 3 in "A Bit of Style"
import com.atomicscala.AtomicTest._

class Exclaim3(val s:String) {
  def noParens = s + "!"
}

val e3 = new Exclaim3("big yes")
e3.noParens is "big yes!"

/* OUTPUT_SHOULD_BE
big yes!
*/
