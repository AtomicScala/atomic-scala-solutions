// Solution-3a.scala
// Solution to Exercise 3 in "Error Handling with Exceptions"
import com.atomicscala.AtomicTest._

val v = Vector(1, 7, 22, 11, 17)
v(4) is 17

v(5)

/* OUTPUT_SHOULD_CONTAIN
17
java.lang.IndexOutOfBoundsException: 5
*/
