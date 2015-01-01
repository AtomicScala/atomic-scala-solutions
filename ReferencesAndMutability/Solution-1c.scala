// Solution-1c.scala
// Solution to Exercise 1 in "References & Mutability"
import com.atomicscala.AtomicTest._

var m = Map("Foo" -> "Bar")
val original = m
m is "Map(Foo -> Bar)"

// Surprise! The following appears to be modifying an existing
// immutable map! What's happening here?
m += ("Frog" -> "Green")
m += ("Cow" -> "Brown")
m is "Map(Foo -> Bar, Frog -> Green, Cow -> Brown)"
m -= "Cow"
m is "Map(Foo -> Bar, Frog -> Green)"

/* The '+' and '-' parts of '+=' and '-=' cause a new Map to be
created, and the '=' part assigns that new map to m, which works
because m is a var. Try changing it to a val and see what happens.
But the original Map object is not modified, as you can see here: */
original is "Map(Foo -> Bar)"

/* OUTPUT_SHOULD_BE
Map(Foo -> Bar)
Map(Foo -> Bar, Frog -> Green, Cow -> Brown)
Map(Foo -> Bar, Frog -> Green)
Map(Foo -> Bar)
*/
