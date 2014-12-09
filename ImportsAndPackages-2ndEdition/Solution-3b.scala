// Solution-3b.scala
// Solution to Exercise 3 in "Imports & Packages"

// Approach 2: import everything
import com.atomicscala.pythagorean._

val rt = new RightTriangle
println(rt.hypotenuse(3,4))
println(rt.area(3,4))
assert(rt.hypotenuse(3,4) == 5)
assert(rt.area(3,4) == 6)

val et = new EquilateralTriangle
println(et.area(2))
assert(et.area(2) == Math.sqrt(3))
println(et.area(9.49))
assert(Math.round(et.area(9.49)) == 39)

/* OUTPUT_SHOULD_BE
5.0
6.0
1.7320508075688772
38.99716723368346
*/
