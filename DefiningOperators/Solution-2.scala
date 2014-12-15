// Solution-2.scala
// Solution to Exercise 2 in "Defining Operators"
import com.atomicscala.AtomicTest._
import scala.math.pow

class FancyNumber1(val num:Int) {
  def power(n:Int):Int = pow(num.toDouble, n.toDouble).toInt
}

val a1 = new FancyNumber1(2)
a1.power(3) is 8
val b1 = new FancyNumber1(10)
b1.power(2) is 100

/* OUTPUT_SHOULD_BE
8
100
*/
