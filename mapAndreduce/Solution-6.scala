// Solution-6.scala
// Solution to Exercise 6 in "map & reduce"
import com.atomicscala.AtomicTest._

def sumIt(someNumbers:Int*):Int = {
  someNumbers.reduce((total, n) => total + n)
}

sumIt(1, 2, 3) is 6
sumIt(45, 45, 45, 60) is 195

/* OUTPUT_SHOULD_BE
6
195
*/
