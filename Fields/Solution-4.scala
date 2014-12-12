// Solution-4.scala
// Solution to Exercise 4 in "Fields"
import com.atomicscala.AtomicTest._

class Cup4 {
  var percentFull = 0
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) percentFull = max
    percentFull // Return this value
  }
  def set(x:Int):Unit = { percentFull = x }
  def get():Int = { percentFull }
}

val cup4 = new Cup4
cup4.set(56)
cup4.get() is 56

/* OUTPUT_SHOULD_BE
56
*/
