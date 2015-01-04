// Solution-4.scala
// Solution to Exercise 4 in "Pattern Matching with Tuples"
import com.atomicscala.AtomicTest._

object Color extends Enumeration {
  type Color = Value
  val white, red, blue, yellow, purple,
    green, orange, brown, magenta = Value
}
import Color._

def blend3(a:Color, b:Color) =
  (a, b) match {
    case _ if a == b => a
    case _ if a == `white` => b
    case _ if b == `white` => a
    case (`red`, `blue`) | (`blue`, `red`) => purple
    case (`red`, `yellow`) | (`yellow`, `red`) => orange
    case (`blue`, `yellow`) | (`yellow`, `blue`) => green
    case (`magenta`, `yellow`) | (`yellow`, `magenta`) => purple
    case (`magenta`, `red`) | (`red`, `magenta`) => purple
    case (`brown`, _) | (_, `brown`) => brown
    case _ => // Interesting, not accurate:
         Color((a.id + b.id) % Color.maxId)
  }


blend3(red, yellow) is orange
blend3(red, red) is red
blend3(yellow,blue) is green
blend3(yellow, magenta) is purple
blend3(red, magenta) is purple
blend3(purple, white) is purple
blend3(white, red) is red

/* OUTPUT_SHOULD_BE
orange
red
green
purple
purple
purple
red
*/
