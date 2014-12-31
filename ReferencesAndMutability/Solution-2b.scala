// Solution-2b.scala
// Solution to Exercise 2 in "References & Mutability"
import com.atomicscala.AtomicTest._
import collection.mutable.Set

val s = Set("Foo")
val original = s
s is "Set(Foo)"
s.add("Zup")
s is "Set(Foo, Zup)"
s.add("Calico")
s is "Set(Calico, Foo, Zup)"

// Operators += and -= are overloaded as in Solution-1d.scala:
s += ("Frog")
s += ("Cow")
s is "Set(Cow, Calico, Frog, Foo, Zup)"
s -= "Cow"
s is "Set(Calico, Frog, Foo, Zup)"

// Original is being directly modified:
original is "Set(Calico, Frog, Foo, Zup)"

/* OUTPUT_SHOULD_BE
Set(Foo)
Set(Foo, Zup)
Set(Calico, Foo, Zup)
Set(Cow, Calico, Frog, Foo, Zup)
Set(Calico, Frog, Foo, Zup)
Set(Calico, Frog, Foo, Zup)
*/
