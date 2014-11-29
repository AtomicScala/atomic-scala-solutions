// Solution-2.scala
// Solution to Exercise 2 in "Imports & Packages"
import com.atomicscala.pythagorean.EquilateralTriangle

val et = new EquilateralTriangle
println(et.area(2))
assert(et.area(2) == Math.sqrt(3))
println(et.area(9.49))
assert(Math.round(et.area(9.49)) == 39)
