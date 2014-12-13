// Solution-4.scala
// Solution to Exercise 4 in "Functions as Objects"
import com.atomicscala.AtomicTest._

val v = Vector(1, 5, 7, 8)
val dogYears = (x:Int) => (x * 7)

var s = ""
v.foreach((x:Int) => (s = s + (dogYears(x) + " ")))
s is "7 35 49 56 "

/* OUTPUT_SHOULD_BE
7 35 49 56
*/
