// Solution-4.scala
// Solution to Exercise 4 in "For Loops"
import com.atomicscala.AtomicTest._

var totalEvens:Int = 0
for(i <- Range(0, 10).inclusive) {
  if(i % 2 == 0)
    totalEvens = totalEvens + i
}
totalEvens is 30

/* OUTPUT_SHOULD_BE
30
*/
