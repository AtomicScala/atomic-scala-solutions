// Solution-3.scala
// Solution to Exercise 3 in "Lists & Recursion"
import com.atomicscala.AtomicTest._

def sumIt(someNumbers:List[Int]):Int =
  someNumbers.reduce((total, n) => total + n)

sumIt(List(1, 2, 3)) is 6
sumIt(List(45, 45, 45, 60)) is 195

/* ANSWER: This is somewhat subjective. However, it's probably
less effort & debugging to implement the "reduce" solution. */

/* OUTPUT_SHOULD_BE
6
195
*/
