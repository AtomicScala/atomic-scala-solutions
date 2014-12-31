// Solution-2a.scala
// Solution to Exercise 2 in "References & Mutability"
import com.atomicscala.AtomicTest._

var s = Set("Foo")
val original = s
s is "Set(Foo)"
// Default Set is immutable, so this doesn't work:
// s.add("Baz")

// += and -= behavior is synthesized as in Solution-1c.scala:
s += ("Frog")
s += ("Cow")
s is "Set(Foo, Frog, Cow)"
s -= "Cow"
s is "Set(Foo, Frog)"

// Original is NOT being modified:
original is "Set(Foo)"

/* OUTPUT_SHOULD_BE
Set(Foo)
Set(Foo, Frog, Cow)
Set(Foo, Frog)
Set(Foo)
*/
