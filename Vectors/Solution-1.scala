// Solution-1.scala
// Solution to Exercise 1 in "Vectors"
// Try this in the REPL

val v1 = Vector("This", "Is", "A", "Vector", "Of", "Strings")
println(v1)
val v2 = Vector(4, 5, 6, 7, 8)
println(v2)
val v3 = Vector(Range(0, 2), Range(0, 5))
println(v3)

/* REPL Session:
scala> val v1 = Vector("This", "Is", "A", "Vector", "Of", "Strings")
v1:scala.collection.immutable.Vector[java.lang.String] = Vector(This, Is, A, Vector, Of, Strings)

scala> val v2 = Vector(4, 5, 6, 7, 8)
v2:scala.collection.immutable.Vector[Int] = Vector(4, 5, 6, 7, 8)

scala> val v3 = Vector(Range(0, 2), Range(0, 5))
v3:scala.collection.immutable.Vector[scala.collection.immutable.Range] = Vector(Range(0, 1), Range(0, 1, 2, 3, 4))
*/


/* OUTPUT_SHOULD_BE
Vector(This, Is, A, Vector, Of, Strings)
Vector(4, 5, 6, 7, 8)
Vector(Range(0, 1), Range(0, 1, 2, 3, 4))
*/
