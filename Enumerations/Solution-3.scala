// Solution-3.scala
// Solution to Exercise 3 in "Enumerations"
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

def monthNumber(name: MonthName) = {
	name.id

}
July is "July"

monthNumber(July) is 6

