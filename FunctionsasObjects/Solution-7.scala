// Solution-7.scala
// Solution to Exercise 7 in "Functions as Objects"
import com.atomicscala.AtomicTest._

var s = ""
val numbers = Vector(1, 2, 5, 3, 7)
numbers.foreach(x => (s = s + (x*x + " ")))

s is "1 4 25 9 49 "

/* OUTPUT_SHOULD_BE
1 4 25 9 49
*/
