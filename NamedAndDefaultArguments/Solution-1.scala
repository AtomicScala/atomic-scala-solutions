// Solution-1.scala
// Solution to Exercise 1 in "Named & Default Arguments"
import com.atomicscala.AtomicTest._

class SimpleTime(val hours:Int, val minutes:Int)

val t = new SimpleTime(hours=5, minutes=30)
t.hours is 5
t.minutes is 30

/* OUTPUT_SHOULD_BE
5
30
*/
