// Solution-4.scala
// Solution to Exercise 4 in "Expressions"
import com.atomicscala.AtomicTest._

/*{oldDescription}
Combine the above 3 expressions into a multiline expression that returns miles.
{oldDescription}*/

val yards2: Double = {
  val feetPerMile = 5280
  feetPerMile/3
}
val miles2 = 2000/yards2

println(miles2)
