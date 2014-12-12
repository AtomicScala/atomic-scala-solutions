// Solution-4.scala
// Solution to Exercise 4 in "Class Exercises"
import com.atomicscala.AtomicTest._

class SimpleTime(val hours:Int, val minutes:Int) {
  def subtract(aTime:SimpleTime):SimpleTime = {
    val h = hours - aTime.hours
    val m = minutes - aTime.minutes
    if(h < 0) {
      new SimpleTime(0, 0)
    } else if(m >= 0) {
      new SimpleTime(h, m)
    } else {
      new SimpleTime(h - 1, m + 60)
    }
  }
}

val t1 = new SimpleTime(10, 30)
val t2 = new SimpleTime(9, 30)
val st = t1.subtract(t2)
st.hours is 1
st.minutes is 0
val st2 = new SimpleTime(10, 30).subtract(new SimpleTime(9, 45))
st2.hours is 0
st2.minutes is 45
val st3 = new SimpleTime(9, 30).subtract(new SimpleTime(10, 0))
st3.hours is 0
st3.minutes is 0

/* OUTPUT_SHOULD_BE
1
0
0
45
0
0
*/
