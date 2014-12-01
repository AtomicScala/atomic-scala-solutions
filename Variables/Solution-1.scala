// Solution-1.scala
// Solution to Exercise 1 in "Variables"
import com.atomicscala.AtomicTest._

/*{oldDescription}
Create an Int value (val) that is set to 5. Try to update that number to 10. What happened? How would you solve this problem?
{oldDescription}*/

val someV = 5
// uncomment next line to see error
// someV = 10
println("You cannot change a val, once set. Define as a var instead.")

var v = 5
v = 10
