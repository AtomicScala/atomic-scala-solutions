// Solution-2.scala
// Solution to Exercise 2 in "Values"

val v1 = 17
println(v1)
// This won't work:
v1 = 20
println("You can't change a val")

/* OUTPUT_SHOULD_CONTAIN
error: reassignment to val
v1 = 20
   ^
one error found
*/