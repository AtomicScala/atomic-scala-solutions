// Solution-2.scala
// Solution to Exercise 2 in "Error Handling with Exceptions"
/* Create a class with a simple method f. Create a var of that class and
initialize it to the special pre-defined value null, which means “nothing.”
Try to call f using this var. Now wrap the call in a try-catch clause to catch
the exception. */
import com.atomicscala.AtomicTest._

class Solution2 {
  def f = "Solution2"
}

var s2:Solution2 = null

// Produces java.lang.NullPointerException:
// s2.f

def t = try {
  s2.f
} catch {
  case e:NullPointerException => "Throws null pointer exception"
}

t is "Throws null pointer exception"