// Starter Code for Exercise 1
// From "Pattern Matching with Case Classes" atom
import com.atomicscala.AtomicTest._

val trip2 = Vector(
  Train(travelers, "Reading"),
  Plane(travelers, "B757"),
  Bus(travelers, 100))

travel(trip2(1)) is "Plane B757 Vector(Passenger(Harvey,Rabbit), Passenger(Dorothy,Gale))"
