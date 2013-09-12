// Solution-3.scala
// Solution to Exercise 3 in "Variables"
import com.atomicscala.AtomicTest._

/*{oldDescription}
Using v1 and constantv1 from above, now set v1 to 15. Did the value of constantv1 change?
{oldDescription}*/

var v1 = 10
val constantv1 = v1
v1 = 15

println(constantv1)
