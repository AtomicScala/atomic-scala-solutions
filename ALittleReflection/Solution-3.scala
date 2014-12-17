// Solution-3.scala
// Solution to Exercise 3 in "A Little Reflection"
import com.atomicscala.AtomicTest._
import com.atomicscala.Name2

case class ReflectedToy3(name:String, batteryOperated:Boolean) extends Name2

val reflected3 = new ReflectedToy3("Flamingo", false)

reflected3 is "class $ReflectedToy3"

/* OUTPUT_SHOULD_BE
class $ReflectedToy3
*/
