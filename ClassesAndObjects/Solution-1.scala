// Solution-1.scala
// Solution to Exercise 1 in "Classes & Objects"

val r1 = Range(0, 10)
println(r1.step)

val r2 = Range(0, 10, 2)
println(r2.step)

// BONUS
val r3 = r1.by(4)
println(r3.step)

/* OUTPUT_SHOULD_BE
1
2
4
*/
