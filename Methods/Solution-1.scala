// Solution-1.scala
// Solution to Exercise 1 in "Methods"

def getSquare(num:Int):Int = {
  num * num
}

val a = getSquare(3)
println(a)
assert(a == 9, "Expected 9, Got " + a)
val b = getSquare(6)
println(b)
assert(b == 36, "Expected 36, Got " + b)
val c = getSquare(5)
println(c)
assert(c == 25, "Expected 25, Got " + c)

/* OUTPUT_SHOULD_BE
9
36
25
*/
