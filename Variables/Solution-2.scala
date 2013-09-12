// Solution-2.scala
// Solution to Exercise 2 in "Variables"
import com.atomicscala.AtomicTest._

/*{oldDescription}
Create an Int variable (var) named v1 that is set to 5. Update it to 10 and store in a val. Did this work? Can you think of a time that this might be useful?
{oldDescription}*/

var v1 = 5
v1 = 10
val constantv1 = v1
println(v1)
println(constantv1)
