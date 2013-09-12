// Solution-2.scala
// Solution to Exercise 2 in "Reaching into Java"
import com.atomicscala.AtomicTest._

import java.text.SimpleDateFormat

println("Exercise 2")
val datePattern = new SimpleDateFormat("mm/dd/yy")
val mayDay = datePattern.parse("05/01/12")
mayDay.getDate is 1
mayDay.getMonth is 0 // this is actually minutes

println("ANSWER: mm represents minutes")

