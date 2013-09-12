// Solution-3.scala
// Solution to Exercise 3 in "Overriding Methods"
import com.atomicscala.AtomicTest._

class Trip(val origination: String, val destination: String, val startDate: String, val endDate: String) {
  override def toString = "From " + origination + " to " + destination + ": " + startDate + " to " + endDate
 }

val t = new Trip("Detroit","Houston",
  "5/1/2012","6/1/2012")
t is "From Detroit to Houston:" +
  " 5/1/2012 to 6/1/2012"

class AirplaneTrip(origination: String, destination: String, startDate: String, endDate: String, val movie: String)
extends Trip(origination, destination, startDate, endDate){
  override def toString = super.toString + ", we watched " + movie
}

val a = new AirplaneTrip("Detroit",
  "London","9/1/1939",
  "10/31/1939", "Superman")
a is "From Detroit to London: 9/1/1939 to 10/31/1939, we watched Superman"

val cities = Vector("Boston",
  "Albany","Buffalo","Cleveland",
  "Columbus","Indianapolis",
  "St. Louis", "Kansas City",
  "Denver","Grand Junction",
  "Salt Lake City","Las Vegas",
  "Bakersfield","San Francisco")

 class CarTrip(val cities: Vector[String], startDate: String, endDate: String)
 extends Trip(cities(0), cities(cities.size-1), startDate, endDate){
  val firstCity = cities(0)
  val lastCity = cities(cities.size-1)

}

val c = new CarTrip(cities,
  "6/1/2012","7/1/2012")
c.origination is "Boston"
c.destination is "San Francisco"
c.startDate is "6/1/2012"

c is "From Boston to San Francisco:" +
  " 6/1/2012 to 7/1/2012"

