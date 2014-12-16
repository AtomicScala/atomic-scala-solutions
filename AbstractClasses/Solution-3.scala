// Solution-3.scala
// Solution to Exercise 3 in "Abstract Classes"
import com.atomicscala.AtomicTest._

abstract class Adder(x:Int) {
  def add(y:Int):Int
}

class NumericAdder(x:Int) extends Adder(x) {
  def add(y:Int):Int = x + y
}

val num = new NumericAdder(5)
num.add(10) is 15

/* OUTPUT_SHOULD_BE
15
*/
