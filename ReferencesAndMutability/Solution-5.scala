// Solution-5.scala
// Solution to Exercise 5 in "References & Mutability"
import com.atomicscala.AtomicTest._

class K

def f(k:K) = k = new K

/* OUTPUT_SHOULD_CONTAIN
error: reassignment to val
def f(k:K) = k = new K
               ^
one error found
*/
