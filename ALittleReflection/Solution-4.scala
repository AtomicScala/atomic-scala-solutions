// Solution-4.scala
// Solution to Exercise 4 in "A Little Reflection"
import com.atomicscala.AtomicTest._
import com.atomicscala.Name2

// TraitBodies.scala

trait AllAbstract {
  def f(n:Int):Int
  val d:Double
}

trait PartialAbstract {
  def f(n:Int):Int
  val d:Double
  def g(s:String) = s"($s)"
  val j = 42
}

trait Concrete {
  def f(n:Int) = n * 11
  val d = 1.61803
}

// Create unnamed class on-the-fly (lines 70-71):
val x = new AllAbstract with
  PartialAbstract with Concrete with Name2

x is "$anon"

/* OUTPUT_SHOULD_BE
$anon
*/
