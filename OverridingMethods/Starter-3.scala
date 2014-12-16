// Starter Code for Exercise 3
// From "Overriding Methods" atom
import com.atomicscala.AtomicTest._

val cities = Vector("Boston",
  "Albany","Buffalo","Cleveland",
  "Columbus","Indianapolis",
  "St. Louis", "Kansas City",
  "Denver", "Grand Junction",
  "Salt Lake City", "Las Vegas",
  "Bakersfield", "San Francisco")

val c = new CarTrip(cities, "6/1/2012", "7/1/2012")

c.origination is "Boston"
c.destination is "San Francisco"
c.startDate is "6/1/2012"

t is "From Detroit to Houston: 5/1/2012 to 6/1/2012"
a is "From Detroit to London: 9/1/1939 to 10/31/1939, we watched Superman"
c is "From Boston to San Francisco:" +
  " 6/1/2012 to 7/1/2012, we visited" +
  " Vector(Albany, Buffalo, " +
  "Cleveland, Columbus, Indianapolis," +
  " St. Louis, Kansas City, Denver, " +
  "Grand Junction, Salt Lake City, " +
  "Las Vegas, Bakersfield)"
