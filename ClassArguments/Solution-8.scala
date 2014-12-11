// Solution-8.scala
// Solution to Exercise 8 in "Class Arguments"
import com.atomicscala.AtomicTest._

class Cup5(var percentFull:Int) {
  val max = 100
  def add(amount:Int*):Int = {
    for(i<-amount) {
      percentFull += i
      if(percentFull > max) {
        percentFull = max
      }
    }
    percentFull // Return this value
  }
}

val cup5 = new Cup5(0)
cup5.add(20, 30, 50, 20, 10, -10, -40, 10, 50) is 100
cup5.add(10, 10, -10, 10, 90, 70, -70) is 30

/* OUTPUT_SHOULD_BE
100
30
*/
