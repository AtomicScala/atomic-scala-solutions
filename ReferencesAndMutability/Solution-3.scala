// Solution-3.scala
// Solution to Exercise 3 in "References & Mutability"
import com.atomicscala.AtomicTest._
import collection.mutable.MutableList
var lst = MutableList(1,2,3)
val original = lst

println(lst)

val x = lst :+ 11
println(x)
val y = lst ++ lst
println(y)
val z = lst ++: lst
println(z)
lst :+= 99
println(lst)
println(original)
original += 99
println(original)

/* OUTPUT_SHOULD_BE

*/
