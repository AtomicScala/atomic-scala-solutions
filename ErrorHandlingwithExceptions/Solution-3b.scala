// Solution-3b.scala
// Solution to Exercise 3 in "Error Handling with Exceptions"
import com.atomicscala.AtomicTest._

val v = Vector(1, 7, 22, 11, 17)
v(4) is 17

def t(i:Int) = try {
  v(i)
} catch {
  case e:IndexOutOfBoundsException => "IndexOutOfBoundsException"
}

t(5) is "IndexOutOfBoundsException"
t(-1) is "IndexOutOfBoundsException"

/* OUTPUT_SHOULD_BE
17
IndexOutOfBoundsException
IndexOutOfBoundsException
*/
