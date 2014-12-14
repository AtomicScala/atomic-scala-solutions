// Solution-3.scala
// Solution to Exercise 3 in "Pattern Matching with Case Classes"
import com.atomicscala.AtomicTest._

case class Passenger(first:String, last:String)
case class Train(travelers:Vector[Passenger], line:String)
case class Plane(passengers:Vector[Passenger], plane:String)
case class Bus(passengers:Vector[Passenger], capacity:Int)

def travel2(transport:Any):String = {
  transport match {
    case Train(travelers, line) => "Train line " + line + " " + travelers
    case Plane(travelers, equipment) => "Plane " + equipment + " " + travelers
    case Bus(travelers, capacity) => "Bus size " + capacity + " " + travelers
    case Passenger(first, last) => first + " is walking"
    case thingamajig => thingamajig + " is in limbo!"
  }
}

case class Kitten(name:String)

travel2(Kitten("Kitty")) is "Kitten(Kitty) is in limbo!"

/* OUTPUT_SHOULD_BE
Kitten(Kitty) is in limbo!
*/
