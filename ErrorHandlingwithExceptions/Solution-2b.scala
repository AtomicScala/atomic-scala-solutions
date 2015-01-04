// Solution-2b.scala
// Solution to Exercise 2 in "Error Handling with Exceptions"
import com.atomicscala.AtomicTest._

class Solution2 {
  def f = "Solution2"
}

var s2:Solution2 = null

def t = try {
  s2.f
} catch {
  case e:NullPointerException => "Throws null pointer exception"
}

t is "Throws null pointer exception"

/* OUTPUT_SHOULD_BE
Throws null pointer exception
*/
