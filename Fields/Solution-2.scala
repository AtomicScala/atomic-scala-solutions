// Solution-2.scala
// Solution to Exercise 2 in "Fields"
import com.atomicscala.AtomicTest._

class Cup3 {
  var percentFull = 0
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) percentFull = max
    if(percentFull < 0) percentFull = 0
    percentFull // Return this value
  }
}

val cup3 = new Cup3
cup3.add(45) is 45
cup3.add(-55) is 0
cup3.add(10) is 10
cup3.add(-9) is 1
cup3.add(-2) is 0

/* OUTPUT_SHOULD_BE
45
0
10
1
0
*/
