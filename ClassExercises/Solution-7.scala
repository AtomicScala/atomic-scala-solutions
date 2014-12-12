// Solution-7.scala
// Solution to Exercise 7 in "Class Exercises"
import com.atomicscala.AtomicTest._

class SimpleTimeNamed(val hours:Int=0, val minutes:Int = 0) {
  def subtract(aTime:SimpleTimeNamed):SimpleTimeNamed = {
    val h = hours - aTime.hours
    val m = minutes - aTime.minutes
    if(h < 0) {
      new SimpleTimeNamed(0, 0)
    } else if(m >= 0) {
      new SimpleTimeNamed(h, m)
    } else {
      new SimpleTimeNamed(h - 1, m + 60)
    }
  }
}

val namedST = new SimpleTimeNamed(hours=9)
val anotherNamedST = new SimpleTimeNamed(minutes=30)
namedST.hours is 9
namedST.minutes is 0
anotherNamedST.hours is 0
anotherNamedST.minutes is 30

/* OUTPUT_SHOULD_BE
9
0
0
30
*/
