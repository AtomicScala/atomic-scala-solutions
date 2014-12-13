// Solution-4.scala
// Solution to Exercise 4 in "Comprehensions"
import com.atomicscala.AtomicTest._

def yielding4(v:Vector[Int]):Vector[Int] = {
  // You can get this to work if you create the variables 
  // OUTSIDE the loop. Any attempt to create them inside 
  // the loop fails.
  var n = 0
  var isOdd = false
  for {
    n <- v
    if n < 10
    isOdd = (n % 2 != 0)
    if(isOdd)
  }
  yield n
}

val v4 = Vector(1,2,3,5,6,7,8,10,13,14,17)
yielding4(v4) is Vector(1,3,5,7)

/* OUTPUT_SHOULD_BE
Vector(1, 3, 5, 7)
*/
