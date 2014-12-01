// Solution-4.scala
// Solution to Exercise 4 in "Overloading"
import com.atomicscala.AtomicTest._

class FunNumbers2 {
  def f(i:Int, j:Int):Double = { i + j }
  // this won't work (redefined function, different only in return type):
  // def f(i:Int, j:Int):Int = { i + j }

}

val funNumbers2 = new FunNumbers2

funNumbers2.f(1, 2) is 3
funNumbers2.f(1, 2) is 3.0
