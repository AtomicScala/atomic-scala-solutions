// Solution-4.scala
// Solution to Exercise 4 in "Defining Operators"
import com.atomicscala.AtomicTest._
import scala.math.pow

class FancyNumber3(val num:Int) {
  def power(n:Int):Int = pow(num.toDouble,  n.toDouble).toInt
  def ^(n:Int):Int = power(n)
  def **(n:Int):Int = power(n)
}

val a3 = new FancyNumber3(2)
a3.^(3) is 8
a3.**(3) is 8
val b3 = new FancyNumber3(10)
b3 ^ 2 is 100
b3 ** 2 is 100

/* OUTPUT_SHOULD_BE
8
8
100
100
*/
