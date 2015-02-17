// Solution-4.scala
// Solution to Exercise 4 in "Comprehensions"
import com.atomicscala.AtomicTest._

def yielding3(v:Vector[Int]):Vector[Int] = {
  // You can get this to work if you create the vars
  // OUTSIDE the loop. Any attempt to create them as
  // vars inside the comprehension fails.
  var n = 0
  var isOdd = false
  for {
    n <- v
    if n < 10
    isOdd = (n % 2 != 0)
    if(isOdd)
  } yield {
    val u = n * 10
    u + 2
  }
}

val v = Vector(1,2,3,5,6,7,8,10,13,14,17)
yielding3(v) is Vector(12, 32, 52, 72)

/* OUTPUT_SHOULD_BE
Vector(12, 32, 52, 72)
*/
