// Solution-4.scala
// Solution to Exercise 4 in "Abstract Classes"
import com.atomicscala.AtomicTest._

abstract class Adder(x:Int) {
  def add(y:Int):Int
}

case class MyAdder(x:Int) extends Adder(x) {
  def add(y:Int):Int = x+y
}

val myNum = MyAdder(15)
myNum.add(20) is 35
println(myNum)

/* OUTPUT_SHOULD_BE
35
MyAdder(15)
*/
