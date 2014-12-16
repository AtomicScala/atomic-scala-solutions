// Solution-3.scala
// Solution to Exercise 3 in "Enumerations"
import com.atomicscala.AtomicTest._

object MonthName extends Enumeration {
  type MonthName = Value
  val January = Value(1)
  val February,
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

import MonthName._

def monthNumber(name:MonthName) = name.id

July is "July"
monthNumber(July) is 7

/* OUTPUT_SHOULD_BE
July
7
*/
