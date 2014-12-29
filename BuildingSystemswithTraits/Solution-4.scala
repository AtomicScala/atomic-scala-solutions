// Solution-4.scala
// Solution to Exercise 4 in "Building Systems with Traits"
import com.atomicscala.AtomicTest._
import sodafountain._
import IceCream._

object Container extends Enumeration {
  type Container = Value
  val Pint, Quart, HalfGallon = Value
}
import Container._

case class TakeHome(container:Container, flavor:IceCream)

TakeHome(Pint, Chocolate) is "TakeHome(Pint,Chocolate)"
TakeHome(Quart, Strawberry) is "TakeHome(Quart,Strawberry)"
TakeHome(HalfGallon, Vanilla) is "TakeHome(HalfGallon,Vanilla)"

/* OUTPUT_SHOULD_BE
TakeHome(Pint,Chocolate)
TakeHome(Quart,Strawberry)
TakeHome(HalfGallon,Vanilla)
*/
