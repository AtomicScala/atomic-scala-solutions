// Solution-1.scala
// Solution to Exercise 1 in "Defining Operators"
import com.atomicscala.AtomicTest._

class SimpleTime2(val hours:Int, val minutes:Int) {
  def -(aTime:SimpleTime2):SimpleTime2 = {
    val h = hours - aTime.hours
    val m = minutes - aTime.minutes
    if(h < 0)
      new SimpleTime2(0, 0)
    else if(m >= 0)
      new SimpleTime2(h, m)
    else
      new SimpleTime2(h - 1, m + 60)
  }
}

val someT1 = new SimpleTime2(10, 30)
val someT2 = new SimpleTime2(9, 30)
val someST = someT1 - someT2
someST.hours is 1
someST.minutes is 0

val someST2 = new SimpleTime2(10, 30) - new SimpleTime2(9, 45)
someST2.hours is 0
someST2.minutes is 45

/* OUTPUT_SHOULD_BE
1
0
0
45
*/
