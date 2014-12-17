// Solution-2.scala
// Solution to Exercise 2 in "A Little Reflection"
import com.atomicscala.AtomicTest._
import com.atomicscala.Name

class ReflectedToy2(name:String, batteryOperated:Boolean) extends Name

val reflected2 = new ReflectedToy2("Flamingo", false)

reflected2 is "ReflectedToy2"

/* OUTPUT_SHOULD_BE
ReflectedToy2
*/
