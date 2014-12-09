// Solution-10.scala
// Solution to Exercise 10 in "Summary 1"

val aHeight = 68.0
val idealBMI = 22.0
val idealWeight = {
  idealBMI * (aHeight*aHeight) / 703.07
}
println(idealWeight)

/* OUTPUT_SHOULD_BE
144.69114028475116
*/
