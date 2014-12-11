// Solution-2.scala
// Solution to Exercise 2 in "For Loops"
import com.atomicscala.AtomicTest._

val r2 = Range(0, 10).inclusive
r2 is (0 to 10)
r2 is (0 until 11)

/* OUTPUT_SHOULD_BE
Range(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
Range(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
*/
