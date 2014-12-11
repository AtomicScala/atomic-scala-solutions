// Solution-7.scala
// Solution to Exercise 7 in "Class Arguments"
import com.atomicscala.AtomicTest._

class Cup3(var percentFull:Int) {
  val max = 100
  def add(amount:Int):Int = {
    percentFull += amount
    if(percentFull > max) {
      percentFull = max
    }
    percentFull
  }
}

val cup3 = new Cup3(0)
cup3.percentFull = 100
cup3.percentFull is 100

/* OUTPUT_SHOULD_BE
100
*/
