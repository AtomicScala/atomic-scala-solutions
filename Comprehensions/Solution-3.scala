// Solution-3.scala
// Solution to Exercise 3 in "Comprehensions"
import com.atomicscala.AtomicTest._

def yielding3(v:Vector[Int]):Vector[Int]={
  val result:Vector[Int] = for {
    n <- v
    if n < 10
    if n % 2 != 0
  } yield n * 10 + 2
  result
}

val v = Vector(1,2,3,5,6,7,8,10,13,14,17)
yielding3(v) is Vector(12, 32, 52, 72)

/* OUTPUT_SHOULD_BE
Vector(12, 32, 52, 72)
*/
