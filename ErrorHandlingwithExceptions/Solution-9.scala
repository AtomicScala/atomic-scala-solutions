// Solution-9.scala
// Solution to Exercise 9 in "Error Handling with Exceptions"
/* Create a three-level inheritance hierarchy of exceptions. Now
create a base class A with a method f that throws the exception at
the base of your hierarchy. Inherit B from A and override f so it
throws the exception at level two of your hierarchy. Repeat by
inheriting class C from B. Create a C and assign it
to an A (this is called “upcasting”), then call f. */
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