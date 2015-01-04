// Solution-1.scala
// Solution to Exercise 1 in "Pattern Matching with Tuples"
import com.atomicscala.AtomicTest._
import paintcolors.Color
import paintcolors.Color._

def blend(a:Color, b:Color) =
  (a, b) match {
    case _ if a == b => a
    case (red, `blue`) |
         (`blue`, `red`) => purple
    case (`red`, `yellow`) |
         (`yellow`, `red`) => orange
    case (`blue`, `yellow`) |
         (`yellow`, `blue`) => green
    case (`brown`, _) |
         (_, `brown`) => brown
    case _ => // Interesting, not accurate:
         Color((a.id + b.id) % Color.maxId)
  }

/* OUTPUT_SHOULD_CONTAIN
Solution-1.scala:10: error: illegal variable in pattern alternative
    case (red, `blue`) |
          ^
*/
