// Solution-3c.scala
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

f3(new Base) is "f3 Base"

/* OUTPUT_SHOULD_CONTAIN
error: inferred type arguments [this.Base] do not conform to method f3's type parameter bounds [T <: this.Most]
f3(new Base) is "f3 Base"
^
error: type mismatch;
 found   : this.Base
 required: T
f3(new Base) is "f3 Base"
   ^
two errors found
*/
