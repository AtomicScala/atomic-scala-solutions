// Starter Code for Exercise 1
// From "Pattern Matching with Case Classes" atom
import com.atomicscala.AtomicTest._

val trip2 = Vector(
Â  Train(travelers, "Reading"),
Â  Plane(travelers, "B757"),
Â Â Bus(travelers, 100))
travel(trip2(1)) is "Plane B757 " +
Â  "Vector(Passenger(Harvey,Rabbit), " +
Â  "Passenger(Dorothy,Gale))"
