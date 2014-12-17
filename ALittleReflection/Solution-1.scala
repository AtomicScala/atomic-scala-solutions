// Solution-1.scala
// Solution to Exercise 1 in "A Little Reflection"
import com.atomicscala.AtomicTest._
import com.atomicscala.Name

case class Toy(name:String, batteryOperated:Boolean)

val toy = new Toy("Teddy Bear", false)

toy is "Toy(Teddy Bear,false)" // Also calls println

case class ReflectedToy(name:String, batteryOperated:Boolean) extends Name

val reflectedToy = new ReflectedToy("Bunny", true)

reflectedToy is "ReflectedToy"

/* OUTPUT_SHOULD_BE
Toy(Teddy Bear,false)
ReflectedToy
*/
