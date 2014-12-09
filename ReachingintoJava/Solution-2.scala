// Solution-2.scala
// Solution to Exercise 2 in "Reaching into Java"
import com.atomicscala.AtomicTest._
import java.text.SimpleDateFormat

val datePattern = new SimpleDateFormat("mm/dd/yy")
val mayDay = datePattern.parse("05/01/12")
mayDay.getDate is 1
mayDay.getMonth is 0 // this is actually minutes

println("ANSWER: mm represents minutes")

/* OUTPUT_SHOULD_BE
warning: there were two deprecation warnings; re-run with -deprecation for details
one warning found
1
0
ANSWER: mm represents minutes
*/
