// Solution-5.scala
// Solution to Exercise 5 in "Case Classes"
import com.atomicscala.AtomicTest._

case class Dimension1(val height:Int, var width:Int)

val c2 = new Dimension1(5,7)
c2.height is 5
//c2.height = 10
c2.width = 19
c2.width is 19

/* OUTPUT_SHOULD_BE
5
19
*/
