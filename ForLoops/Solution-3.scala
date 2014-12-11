// Solution-3.scala
// Solution to Exercise 3 in "For Loops"
import com.atomicscala.AtomicTest._

var total:Int = 0
for(i <- Range(0, 10).inclusive)
  total = total + i
total is 55

/* OUTPUT_SHOULD_BE
55
*/
