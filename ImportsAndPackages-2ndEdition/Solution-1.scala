// Solution-1.scala
// Solution to Exercise 1 in "Imports & Packages"
import com.atomicscala.pythagorean.RightTriangle

val rt = new RightTriangle
println(rt.hypotenuse(3,4))
println(rt.area(3,4))
assert(rt.hypotenuse(3,4) == 5)
assert(rt.area(3,4) == 6)

/* OUTPUT_SHOULD_BE
5.0
6.0
*/
