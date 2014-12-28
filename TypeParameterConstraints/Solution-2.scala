// Solution-2.scala
// Solution to Exercise 2 in "Type Parameter Constraints"
import com.atomicscala.AtomicTest._

class WithF {
  def f(n:Int) = n * 11
}

def callF[T <: WithF](t:T, n:Int) = t.f(n)

callF(new WithF, 2) is 22

callF(new WithF {
  override def f(n:Int) = n * 7
}, 2) is 14

/* OUTPUT_SHOULD_BE
22
14
*/
