// Solution-1.scala
// Solution to Exercise 1 in "Reaching into Java"
import com.atomicscala.AtomicTest._
import java.text.SimpleDateFormat

val datePattern = new SimpleDateFormat("MM/dd/yy")
val mayDay = datePattern.parse("05/01/12")
mayDay.getDate is 1
mayDay.getMonth is 4

/* OUTPUT_SHOULD_BE
warning: there were two deprecation warnings; re-run with -deprecation for details
one warning found
1
4
*/
