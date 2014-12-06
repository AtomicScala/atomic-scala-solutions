// Solution-5.scala
// Solution to Exercise 5 in "Base Class Initialization"
import com.atomicscala.AtomicTest._

class Trip(val origination:String, val destination:String, val startDate:String, val endDate:String) {
  override def toString = "From " + origination + " to " + destination + ": " + startDate + " to " + endDate
}

val t = new Trip("Detroit","Houston", "5/1/2012","6/1/2012")
t is "From Detroit to Houston: 5/1/2012 to 6/1/2012"

class AirplaneTrip(origination:String, destination:String, startDate:String, endDate:String, val movie:String)
extends Trip(origination, destination, startDate, endDate) {
  override def toString = "On a flight from " + origination + " to " + destination + ", we watched " + movie
}

val a = new AirplaneTrip("Detroit", "London","9/1/1939", "10/31/1939", "Superman")
a is "On a flight from Detroit to London, we watched Superman"
