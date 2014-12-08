// Solution-4.scala
// Solution to Exercise 4 in "Values"

val s = "ABC1234"
println(s)
// This won't work:
s = "DEF1234"
println("You can't change a val")

/* OUTPUT_SHOULD_CONTAIN
error: reassignment to val
s = "DEF1234"
  ^
one error found
*/