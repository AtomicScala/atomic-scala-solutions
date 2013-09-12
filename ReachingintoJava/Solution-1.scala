// Solution-1.scala
// Solution to Exercise 1 in "Reaching into Java"
import com.atomicscala.AtomicTest._

import java.text.SimpleDateFormat

val datePattern = new SimpleDateFormat("MM/dd/yy")
val mayDay = datePattern.parse("05/01/12")
mayDay.getDate is 1
mayDay.getMonth is 4

