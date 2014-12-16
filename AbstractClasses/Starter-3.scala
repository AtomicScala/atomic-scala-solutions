// Starter Code for Exercise 3
// From "Abstract Classes" atom
import com.atomicscala.AtomicTest._

class NumericAdder(val x:Int) extends Adder(x) {
  def add(y:Int):Int = // Complete this
}

val num = new NumericAdder(5)
num.add(10) is 15
