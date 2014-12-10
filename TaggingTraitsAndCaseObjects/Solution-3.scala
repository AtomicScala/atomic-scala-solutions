// Solution-3.scala
// Solution to Exercise 3 in "Tagging Traits & Case Objects"
import com.atomicscala.AtomicTest._

object EnumColor extends Enumeration {
  type EnumColor = Value
  // This fails with "Red is already defined as value Red"
  val Red, Green, Blue, Red = Value
}

EnumColor.Red is "Red"
EnumColor.Blue is "Blue"
EnumColor.Green is "Green"

/* OUTPUT_SHOULD_CONTAIN
error: Red is already defined as value Red
  val Red, Green, Blue, Red = Value
                        ^
one error found
*/
