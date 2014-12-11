// Solution-2.scala
// Solution to Exercise 2 in "Named & Default Arguments"
import com.atomicscala.AtomicTest._

class SimpleTime2(val hours:Int, val minutes:Int = 0)

val t2 = new SimpleTime2(hours=10)
t2.hours is 10
t2.minutes is 0

/* OUTPUT_SHOULD_BE
10
0
*/
