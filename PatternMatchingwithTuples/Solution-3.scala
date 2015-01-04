// Solution-3.scala
// Solution to Exercise 3 in "Pattern Matching with Tuples"
import com.atomicscala.AtomicTest._

object Color extends Enumeration {
  type Color = Value
  val red, blue, yellow, purple,
    green, orange, brown, magenta = Value
}
import Color._

def blend2(a:Color, b:Color) =
  (a, b) match {
    case _ if a == b => a
    case (`red`, `blue`) |
         (`blue`, `red`) => purple
    case (`red`, `yellow`) |
         (`yellow`, `red`) => orange
    case (`blue`, `yellow`) |
         (`yellow`, `blue`) => green
    case (`magenta`, `yellow`) |
         (`yellow`, `magenta`) => purple
    case (`magenta`, `red`) |
         (`red`, `magenta`) => purple
    case (`brown`, _) |
         (_, `brown`) => brown
    case _ => // Interesting, not accurate:
         Color((a.id + b.id) % Color.maxId)
  }

blend2(red, yellow) is orange
blend2(red, red) is red
blend2(yellow,blue) is green
blend2(yellow, magenta) is purple
blend2(red, magenta) is purple

/* OUTPUT_SHOULD_BE
orange
red
green
purple
purple
*/
