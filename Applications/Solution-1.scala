// Solution-1.scala
// Solution to Exercise 1 in "Applications"
// Compile, then run with
// > scala WhenAmI
import com.atomicscala.AtomicTest._

object WhenAmI extends App {
  hi
  println(new java.util.Date())
  def hi = println("Hello! It's:")
}

/* OUTPUT_SHOULD_CONTAIN
Hello! It's:
*/
