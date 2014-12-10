// Solution-3.scala
// Solution to Exercise 3 in "Fields"
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
cup3.percentFull = 56
cup3.percentFull is 56

/* OUTPUT_SHOULD_BE
56
*/
