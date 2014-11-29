// Solution-3a.scala
// Solution to Exercise 3 in "Imports & Packages"

// Solution 1: import specific classes
import com.atomicscala.pythagorean.{RightTriangle, EquilateralTriangle}

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
