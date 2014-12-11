// Solution-3.scala
// Solution to Exercise 3 in "Methods"

def isArg1GreaterThanArg2(num1:Double, num2:Double):Boolean = {
  num1 > num2
}

val t1 = isArg1GreaterThanArg2(4.1, 4.12)
println(t1)
assert(false == t1, "Expected false, Got " + t1)
val t2 = isArg1GreaterThanArg2(2.1, 1.2)
println(t2)
assert(true == t2, "Expected true, Got " + t2)

/* OUTPUT_SHOULD_BE
false
true
*/
