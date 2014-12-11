// Solution-4.scala
// Solution to Exercise 4 in "Summary 2"
// To run, first compile BasicMethods.scala:
// scalac BasicMethods.scala
import com.atomicscala.AtomicTest._
import com.atomicscala.BasicLibrary._

val wb = new WhizBang
wb.cube(3) is 27
wb.bang("pop") is "pop!"

/* OUTPUT_SHOULD_BE
27
pop!
*/
