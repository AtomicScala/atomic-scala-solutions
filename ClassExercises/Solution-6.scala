// Solution-6.scala
// Solution to Exercise 6 in "Class Exercises"
import com.atomicscala.AtomicTest._

class SimpleTimeAux(val hours:Int, val minutes:Int) {
  def this(hours:Int) = {
    this(hours, 0)
  }
  def subtract(aTime:SimpleTimeAux):SimpleTimeAux = {
    val h = hours - aTime.hours
    val m = minutes - aTime.minutes
    if(h < 0) {
      new SimpleTimeAux(0, 0)
    } else if(m >= 0) {
      new SimpleTimeAux(h, m)
    } else {
      new SimpleTimeAux(h - 1, m + 60)
    }
  }
}

val auxT1 = new SimpleTimeAux(10, 5)
val auxT2 = new SimpleTimeAux(6)
val auxST = auxT1.subtract(auxT2)
auxST.hours is 4
auxST.minutes is 5
val auxST2 = new SimpleTimeAux(12).subtract(new SimpleTimeAux(9, 45))
auxST2.hours is 2
auxST2.minutes is 15

/* OUTPUT_SHOULD_BE
4
5
2
15
*/
