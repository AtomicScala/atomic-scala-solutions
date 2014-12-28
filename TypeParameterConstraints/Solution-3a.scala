// Solution-3a.scala
// Solution to Exercise 3 in "Type Parameter Constraints"
import com.atomicscala.AtomicTest._

class Base {
  override def toString = "Base"
}
class Derived extends Base {
  override def toString = "Derived"
}
class Most extends Derived {
  override def toString = "Most"
}

def f1[T <: Base](t:T) = "f1 " + t
def f2[T <: Derived](t:T) = "f2 " + t
def f3[T <: Most](t:T) = "f3 " + t

f1(new Base) is "f1 Base"
f1(new Derived) is "f1 Derived"
f1(new Most) is "f1 Most"

f2(new Derived) is "f2 Derived"
f2(new Most) is "f2 Most"

f3(new Most) is "f3 Most"

/* OUTPUT_SHOULD_BE
f1 Base
f1 Derived
f1 Most
f2 Derived
f2 Most
f3 Most
*/
