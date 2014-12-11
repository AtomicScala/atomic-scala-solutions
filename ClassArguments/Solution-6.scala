// Solution-6.scala
// Solution to Exercise 6 in "Class Arguments"
import com.atomicscala.AtomicTest._

class Cup2(var percentFull:Int) {
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    percentFull
  }
}

val cup2 = new Cup2(0)
cup2.add(45) is 45
cup2.add(-15) is 30
cup2.add(-50) is -20
cup2.percentFull = 70
cup2.percentFull is 70

/* OUTPUT_SHOULD_BE
45
30
-20
70
*/
