// Solution-1.scala
// Solution to Exercise 1 in "Enumerations"
import com.atomicscala.AtomicTest._

object MonthName extends Enumeration {
  type MonthName = Value
  val January,
      February,
      March,
      April,
      May,
      June,
      July,
      August,
      September,
      October,
      November,
      December = Value
}

MonthName.February is "February"
MonthName.February.id is 1

/* OUTPUT_SHOULD_BE
February
1
*/
