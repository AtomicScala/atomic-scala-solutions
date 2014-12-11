// Solution-1.scala
// Solution to Exercise 1 in "More Conditionals"
import com.atomicscala.AtomicTest._

println("Elements read left to right match those read right to left.")
println("If length is even, middle elements must be repeated.")
println("If length is odd, middle element doesn't matter.")

val bothWaysEven = Vector(1, 2, 3, 3, 2, 1)
bothWaysEven is bothWaysEven.reverse

val bothWaysOdd = Vector(1, 2, 3, 2, 1)
bothWaysOdd is bothWaysOdd.reverse

/* OUTPUT_SHOULD_BE
Elements read left to right match those read right to left.
If length is even, middle elements must be repeated.
If length is odd, middle element doesn't matter.
Vector(1, 2, 3, 3, 2, 1)
Vector(1, 2, 3, 2, 1)
*/
