// Solution-6.scala
// Solution to Exercise 6 in "Case Classes"
import com.atomicscala.AtomicTest._

case class SimpleTimeDefault(hours:Int, minutes:Int = 0) {
  def subtract(aTime:SimpleTimeDefault):SimpleTimeDefault = {
    val h = hours - aTime.hours
    val m = minutes - aTime.minutes

    if(h < 0)
       return new SimpleTimeDefault(0)  // See simplification above

    if(m >= 0)
      new SimpleTimeDefault(h, m)
    else
      new SimpleTimeDefault(h-1, m+60)

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
