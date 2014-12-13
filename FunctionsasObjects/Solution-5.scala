// Solution-5.scala
// Solution to Exercise 5 in "Functions as Objects"
import com.atomicscala.AtomicTest._

var s = ""
val v = Vector(1, 5, 7, 8)
v.foreach((x:Int) => (s = s + (x * 7 + " ")))

s is "7 35 49 56 "

/* OUTPUT_SHOULD_BE
7 35 49 56
*/
