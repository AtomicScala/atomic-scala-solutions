// Solution-4.scala
// Solution to Exercise 4 in "Tagging Traits & Case Objects"
import com.atomicscala.AtomicTest._

sealed trait Color
case object Red extends Color
case object Green extends Color
case object Blue extends Color
object Color {
  val values = Vector(Red, Green, Blue, Red)
}

def display(c:Color) = c match {
  case Red => s"It's $c"
  case Green => s"It's $c"
  case Blue => s"It's $c"
}

Color.values.map(display) is "Vector(It's Red, It's Green, It's Blue)"

println("ANSWER: The test fails but you can add Color to the Vector")

/* OUTPUT_SHOULD_BE
Vector(It's Red, It's Green, It's Blue, It's Red)
[Error] expected:
Vector(It's Red, It's Green, It's Blue)
ANSWER: The test fails but you can add Color to the Vector
*/
