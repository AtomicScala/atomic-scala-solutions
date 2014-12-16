// Solution-2.scala
// Solution to Exercise 2 in "Uniform Access & Setters"
import com.atomicscala.AtomicTest._

class Base (var d3:Int) {
  def f1:Int = 99
  def f2:Int = 99
  val d1:Int = 99
  val d2:Int = 99
  var n = 1
}

class Derived(d3:Int) extends Base(d3) {
  override def f1 = 1
  override val f2 = 1 // Was def, now val
  override val d1 = 1
  // Can't do this; must be a val:
  // def d2 = 1
  override val d2 = 1

}

val d = new Derived(1)
d.d3 is 1 // Calls getter (line 20)
d.d3 = 42 // Calls setter (line 21)
d.d3 is 42

/* OUTPUT_SHOULD_BE
1
42
*/
