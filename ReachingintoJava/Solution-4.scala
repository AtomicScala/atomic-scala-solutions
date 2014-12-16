// Solution-4.scala
// Solution to Exercise 4 in "Reaching into Java"
import com.atomicscala.AtomicTest._
import org.apache.commons.math3._
import stat._
// scala -classpath .;..;../libs/commons-math3-3.3.jar Solution-4.scala

val f = new Frequency
f.addValue("cat")
f.addValue("dog")
f.addValue("cat")
f.addValue("bird")
f.addValue("cat")
f.addValue("cat")
f.addValue("kitten")
f.addValue("mouse")
f.getCount("cat") is 4

/* OUTPUT_SHOULD_BE
4
*/
