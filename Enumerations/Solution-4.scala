// Solution-4.scala
// Solution to Exercise 4 in "Enumerations"
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

import MonthName._

def season(name:MonthName) = name match {
  case January | February | December => "Winter"
  case March | April | May => "Spring"
  case June | July | August => "Summer"
  case September | October | November => "Autumn"
}

season(January) is "Winter"
season(April) is "Spring"
season(August) is "Summer"
season(November) is "Autumn"

/* OUTPUT_SHOULD_BE
Winter
Spring
Summer
Autumn
*/
