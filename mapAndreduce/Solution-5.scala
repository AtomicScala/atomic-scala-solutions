// Solution-5.scala
// Solution to Exercise 5 in "map & reduce"
import com.atomicscala.AtomicTest._

val vReduce = Vector(1, 10, 100, 1000)
var sum = 0
for(n <- vReduce)
  sum += n
sum is 1111

/* OUTPUT_SHOULD_BE
1111
*/
