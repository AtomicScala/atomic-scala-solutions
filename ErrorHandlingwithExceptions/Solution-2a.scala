// Solution-2a.scala
// Solution to Exercise 2 in "Error Handling with Exceptions"
import com.atomicscala.AtomicTest._

class Solution2 {
  def f = "Solution2"
}

var s2:Solution2 = null

s2.f

/* OUTPUT_SHOULD_CONTAIN
java.lang.NullPointerException
*/
