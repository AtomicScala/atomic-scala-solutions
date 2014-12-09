// Solution-2.scala
// Solution to Exercise 2 in "Methods"

def getSquareDouble(num:Double):Double = {
  num * num
}

val sd1 = getSquareDouble(1.2)
println(sd1)
assert(1.44 == sd1, "Expected 1.44, Got " + sd1)
val sd2 = getSquareDouble(5.7)
println(sd2)
assert(32.49 == sd2, "Expected 32.49, Got " + sd2)

/* OUTPUT_SHOULD_BE
1.44
32.49
*/
