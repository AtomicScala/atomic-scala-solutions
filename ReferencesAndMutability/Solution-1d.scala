// Solution-1d.scala
// Solution to Exercise 1 in "References & Mutability"
import com.atomicscala.AtomicTest._
import collection.mutable.Map

val m = Map("Foo" -> "Bar")
val original = m
m is "Map(Foo -> Bar)"
m("Foo") = "Zup"
m is "Map(Foo -> Zup)"
m("Goat") = "Calico" // Adds a new pair
m is "Map(Goat -> Calico, Foo -> Zup)"

// From our logic in Solution-1c.scala, this SHOULDN'T work. But it
// does! NOW what's going on?
m += ("Frog" -> "Green")
m += ("Cow" -> "Brown")
m is "Map(Goat -> Calico, Foo -> Zup, Frog -> Green, Cow -> Brown)"
m -= "Cow"
m is "Map(Goat -> Calico, Foo -> Zup, Frog -> Green)"

/* In Solution-1c.scala, the += wasn't overloaded for the immutable
Map, so Scala synthesized it by first applying '+' and then '='.
But there IS a += defined for the mutable Map, so that is called in
this case. */

// Note that here, the original IS being directly modified:
original is "Map(Goat -> Calico, Foo -> Zup, Frog -> Green)"

/* OUTPUT_SHOULD_BE
Map(Foo -> Bar)
Map(Foo -> Zup)
Map(Goat -> Calico, Foo -> Zup)
Map(Goat -> Calico, Foo -> Zup, Frog -> Green, Cow -> Brown)
Map(Goat -> Calico, Foo -> Zup, Frog -> Green)
Map(Goat -> Calico, Foo -> Zup, Frog -> Green)
*/
