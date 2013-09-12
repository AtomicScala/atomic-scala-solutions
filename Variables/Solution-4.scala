// Solution-4.scala
// Solution to Exercise 4 in "Variables"
import com.atomicscala.AtomicTest._

/*{oldDescription}
Create a new Int variable (var) called v2 initialized to v1. Set v1 to 20. Did the value of v2 change?
{oldDescription}*/

var v1 = 15
val constantv1 = v1

var v2 = v1
v1 = 20
println(v2)
