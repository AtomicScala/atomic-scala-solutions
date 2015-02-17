// Starter Code for Exercise 2
// From "Comprehensions" atom
import com.atomicscala.AtomicTest._

// Here's the original yielding2:
def yielding2(v:Vector[Int]):Vector[Int]={
  for {
    n <- v
    if n < 10
    isOdd = (n % 2 != 0)
    if(isOdd)
  } yield n
}

val theList = List(1,2,3,5,6,7,8,10,13,14,17)
yielding2(theList) is List(1,3,5,7)
