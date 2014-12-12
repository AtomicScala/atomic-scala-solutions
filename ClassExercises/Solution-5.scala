// Solution-5.scala
// Solution to Exercise 5 in "Class Exercises"
import com.atomicscala.AtomicTest._

class SimpleTimeDefault(val hours:Int, val minutes:Int = 0) {
  def subtract(aTime:SimpleTimeDefault):SimpleTimeDefault = {
    val h = hours - aTime.hours
    val m = minutes - aTime.minutes
    if(h < 0) {
      new SimpleTimeDefault(0, 0)
    } else if(m >= 0) {
      new SimpleTimeDefault(h, m)
    } else {
      new SimpleTimeDefault(h - 1, m + 60)
    }
  }
}

val anotherT1 = new SimpleTimeDefault(10, 30)
val anotherT2 = new SimpleTimeDefault(9)
val anotherST = anotherT1.subtract(anotherT2)
anotherST.hours is 1
anotherST.minutes is 30
val anotherST2 =
  new SimpleTimeDefault(10).subtract(new SimpleTimeDefault(9, 45))
anotherST2.hours is 0
anotherST2.minutes is 15

/* OUTPUT_SHOULD_BE
1
30
0
15
*/
