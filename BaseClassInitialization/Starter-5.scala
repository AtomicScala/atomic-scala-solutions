// Starter Code for Exercise 5
// From "Base Class Initialization" atom
import com.atomicscala.AtomicTest._

val t = new Trip("Detroit","Houston",
  "5/1/2012","6/1/2012")
val a = new AirplaneTrip("Detroit",
  "London","9/1/1939",
  "10/31/1939", "Superman")
val cities = Vector("Boston",
  "Albany","Buffalo","Cleveland",
  "Columbus","Indianapolis",
  "St. Louis", "Kansas City",
  "Denver", "Grand Junction",
  "Salt Lake City", "Las Vegas",
  "Bakersfield", "San Francisco")
val c = new CarTrip(cities,
  "6/1/2012", "7/1/2012")
c.origination is "Boston"
c.destination is "San Francisco"
c.startDate is "6/1/2012"
t is "From Detroit to Houston:"
  + " 5/1/2012 to 6/1/2012"
c is "From Boston to San Francisco:"
  + " 6/1/2012 to 7/1/2012"
