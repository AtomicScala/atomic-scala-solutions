// Solution-1.scala
// Solution to Exercise 1 in "Fields"
import com.atomicscala.AtomicTest._

class Cup2 {
  var percentFull = 0
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) percentFull = max
    percentFull // Return value
  }
}

val cup2 = new Cup2
cup2.add(45) is 45
cup2.add(-15) is 30
cup2.add(-50) is -20

/* OUTPUT_SHOULD_BE
45
30
-20
*/
