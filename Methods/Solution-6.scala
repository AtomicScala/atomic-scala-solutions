// Solution-6.scala
// Solution to Exercise 6 in "Methods"
import com.atomicscala.AtomicTest._

def manyTimesString(str:String, num:Int) = str*num

val m1 = manyTimesString("abc", 3)
println(m1)
assert("abcabcabc" == m1, "Expected abcabcabc, Got " + m1)
val m2 = manyTimesString("123", 2)
println(m2)
assert("123123" == m2, "Expected 123123, Got " + m2)
