// Solution-2.scala
// Solution to Exercise 2 in "Comprehensions"
import com.atomicscala.AtomicTest._

def yielding2(l:List[Int]):List[Int] = {
  for {
    n <- l
    if n < 10
    isOdd = (n % 2 != 0)
    if(isOdd)
  } yield n
}

val theList = List(1,2,3,5,6,7,8,10,13,14,17)
yielding2(theList) is List(1,3,5,7)

/* OUTPUT_SHOULD_BE
List(1, 3, 5, 7)
*/
