// Solution-2.scala
// Solution to Exercise 2 in "Pattern Matching with Tuples"
import com.atomicscala.AtomicTest._
import paintcolors.Color
import paintcolors.Color._

def blend(a:Color, b:Color) =
  (a, b) match {
    case _ if a == b => a
    case (`red`, `blue`) |
         (`blue`, `red`) => purple
    case (`red`, `yellow`) |
         (`yellow`, `red`) => orange
    case (`blue`, `yellow`) |
         (`yellow`, `blue`) => green
    case (`brown`, _) |
         (_, `brown`) => brown
  }

blend(red, yellow) is orange
blend(red, red) is red
blend(yellow,blue) is green

/* OUTPUT_SHOULD_BE
orange
red
green
*/
