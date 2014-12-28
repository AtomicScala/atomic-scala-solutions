// Solution-3b.scala
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

f2(new Base) is "f2 Base"

/* OUTPUT_SHOULD_CONTAIN
error: inferred type arguments [this.Base] do not conform to method f2's type parameter bounds [T <: this.Derived]
f2(new Base) is "f2 Base"
^
error: type mismatch;
 found   : this.Base
 required: T
f2(new Base) is "f2 Base"
   ^
two errors found
*/
