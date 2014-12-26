// Solution-2.scala
// Solution to Exercise 2 in "Tagging Traits & Case Objects"
import com.atomicscala.AtomicTest._

object EnumColor extends Enumeration {
  type EnumColor = Value
  val Red, Green, Blue = Value
}

EnumColor.Red is "Red"
EnumColor.Blue is "Blue"
EnumColor.Green is "Green"

/* OUTPUT_SHOULD_BE
Red
Blue
Green
*/
