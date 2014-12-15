// Solution-3.scala
// Solution to Exercise 3 in "Defining Operators"
import com.atomicscala.AtomicTest._
import scala.math.pow

class FancyNumber2(val num:Int) {
  def power(n:Int):Int = pow(num.toDouble,  n.toDouble).toInt
  def ^(n:Int):Int = power(n)
}

val a2 = new FancyNumber2(2)
a2.^(3) is 8
val b2 = new FancyNumber2(10)
b2 ^ 2 is 100

/* OUTPUT_SHOULD_BE
8
100
*/
