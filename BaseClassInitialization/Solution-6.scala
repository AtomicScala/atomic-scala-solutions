// Solution-6.scala
// Solution to Exercise 6 in "Base Class Initialization"
import com.atomicscala.AtomicTest._

/* Yes -- you only have to write the toString method. The real benefit is exposed if you add another subclass, CarTrip.
*/

class Trip(val origination:String, val destination:String, val startDate:String, val endDate:String) {
  override def toString = "From " + origination + " to " + destination + ": " + startDate + " to " + endDate
}

 val cities = Vector("Boston",
  "Albany","Buffalo","Cleveland",
  "Columbus","Indianapolis",
  "St. Louis", "Kansas City",
  "Denver","Grand Junction",
  "Salt Lake City","Las Vegas",
  "Bakersfield","San Francisco")

class CarTrip(val cities:Vector[String], startDate:String, endDate:String)
  extends Trip(cities(0), cities(cities.size-1), startDate, endDate) {
  val firstCity = cities(0)
  val lastCity = cities(cities.size-1)
  override def toString = "Traveling from " + firstCity + " to " + lastCity + ": " + startDate + " to " + endDate
}

val c = new CarTrip(cities, "6/1/2012","7/1/2012")
c.origination is "Boston"
c.destination is "San Francisco"
c.startDate is "6/1/2012"

c is "Traveling from Boston to San Francisco:" +
  " 6/1/2012 to 7/1/2012"

/* OUTPUT_SHOULD_BE

*/
