// Solution-3.scala
// Solution to Exercise 3 in "Comprehensions"
import com.atomicscala.AtomicTest._

def yielding3(l:List[Int]):List[Int] = {
  val result:List[Int] = for {
    n <- l
    if n < 10
    if n % 2 != 0
  } yield n
  result
}

val theList2 = List(1,2,3,5,6,7,8,10,13,14,17)
yielding3(theList2) is List(1,3,5,7)

/* OUTPUT_SHOULD_BE
List(1, 3, 5, 7)
*/
