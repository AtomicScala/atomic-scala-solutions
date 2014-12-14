// Solution-1.scala
// Solution to Exercise 1 in "Pattern Matching with Case Classes"
import com.atomicscala.AtomicTest._

case class Passenger(first:String, last:String)
case class Train(travelers:Vector[Passenger], line:String)
case class Plane(passengers:Vector[Passenger], plane:String)
case class Bus(passengers:Vector[Passenger], capacity:Int)

def travel(transport:Any):String = {
  transport match {
    case Train(travelers, line) => "Train line " + line + " " + travelers
    case Plane(travelers, equipment) => "Plane " + equipment + " " + travelers
    case Bus(travelers, capacity) => "Bus size " + capacity + " " + travelers
    case Passenger => "Walking along"
    case thingamajig => thingamajig + " is in limbo!"
  }
}

val travelers = Vector(
  Passenger("Harvey", "Rabbit"),
  Passenger("Dorothy", "Gale"))

val trip2 = Vector(
  Train(travelers, "Reading"),
  Plane(travelers, "B757"),
  Bus(travelers, 100))

travel(trip2(1)) is "Plane B757 Vector(Passenger(Harvey,Rabbit), Passenger(Dorothy,Gale))"

/* OUTPUT_SHOULD_BE
Plane B757 Vector(Passenger(Harvey,Rabbit), Passenger(Dorothy,Gale))
*/
