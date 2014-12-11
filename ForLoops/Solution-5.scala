// Solution-5.scala
// Solution to Exercise 5 in "For Loops"
import com.atomicscala.AtomicTest._

var evens:Int = 0
var odds:Int = 0

for(i <- 0 to 10) {
  if(i % 2 == 0) evens = evens + i
  else odds = odds + i
}

evens is 30
odds is 25
(evens + odds) is 55

/* OUTPUT_SHOULD_BE
30
25
55
*/
