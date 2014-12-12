// Solution-1.scala
// Solution to Exercise 1 in "Class Exercises"
import com.atomicscala.AtomicTest._

class Dimension(var height:Int, var width:Int)
val c = new Dimension(5,7)
c.height is 5
c.height = 10
c.height is 10
c.width = 19
c.width is 19

/* OUTPUT_SHOULD_BE
5
10
19
*/
