// Solution-1.scala
// Solution to Exercise 1 in "Tagging Traits & Case Objects"
import com.atomicscala.AtomicTest._

sealed trait Color
case object Red extends Color
case object Green extends Color
case object Blue extends Color
case object Purple extends Color
object Color {
  val values = Vector(Red, Green, Blue, Purple)
}

def display(c:Color) = c match {
  case Red => s"It's $c"
  case Green => s"It's $c"
  case Blue => s"It's $c"
}

// Test fails if you add Purple but not to match expression
// Color.values.map(display) is "Vector(It's Red, It's Green, It's Blue)"

/* OUTPUT_SHOULD_CONTAIN
warning: match may not be exhaustive.
It would fail on the following input: Purple
def display(c:Color) = c match {
                       ^
one warning found
*/
