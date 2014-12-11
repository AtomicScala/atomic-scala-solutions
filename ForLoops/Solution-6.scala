// Solution-6.scala
// Solution to Exercise 6 in "For Loops"
import com.atomicscala.AtomicTest._

var evens2:Int = 0
var odds2:Int = 0

for(i<- Range.inclusive(0, 10)) {
  if(i % 2 == 0) evens2 = evens2 + i
  else odds2 = odds2 + i
}

println(evens2)
println(odds2)
evens2 + odds2 is 55

/* OUTPUT_SHOULD_BE
30
25
55
*/
