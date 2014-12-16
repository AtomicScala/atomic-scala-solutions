// Solution-5.scala
// Solution to Exercise 5 in "Reaching into Java"
import com.atomicscala.AtomicTest._
import org.apache.commons.math3._
import stat.descriptive._

val s = new SummaryStatistics
// add values here
s.addValue(10)
s.addValue(20)
s.addValue(30)
s.addValue(80)
s.addValue(90)
s.addValue(100)

s.getMean is 55
s.getStandardDeviation is 39.370039370059054

/* OUTPUT_SHOULD_BE
55.0
39.370039370059054
*/
