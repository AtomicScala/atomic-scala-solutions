// Solution-2.scala
// Solution to Exercise 2 in "Functions as Objects"
import com.atomicscala.AtomicTest._

var str1 = ""
val numberV = Vector(1, 2, 3, 4)
numberV.foreach(n => str1 += n + ",")
str1 is "1,2,3,4,"

/* OUTPUT_SHOULD_BE
1,2,3,4,
*/
