// Solution-3.scala
// Solution to Exercise 3 in "Expressions"
import com.atomicscala.AtomicTest._

/*{oldDescription}
Create an expression that divides the 2000 by yardsPerMile to calculate miles for someone who swam 2000 yards.
{oldDescription}*/

val feetPerMile = 5280
val yardsPerMile=feetPerMile/3.0

val miles = 2000/yardsPerMile
println(miles)
