// Solution-9.scala
// Solution to Exercise 9 in "Error Handling with Exceptions"
import com.atomicscala.AtomicTest._

class Level1 extends Exception
class Level2 extends Level1
class Level3 extends Level2

class A {
  def f = throw new Level1
}

class B extends A {
  override def f = throw new Level2
}

class C extends B {
  override def f = throw new Level3
}

// Your stack trace will give you the same results, albeit noisier.
// getClass().getSimpleName() reduces it to the minimum:
def test = try {
  val a:A = new C
  a.f
} catch {
  case e:Exception => e.getClass().getSimpleName()
}

test is "Level3"

/* OUTPUT_SHOULD_BE
Level3
*/
