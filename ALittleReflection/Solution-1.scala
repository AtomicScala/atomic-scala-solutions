// Solution-1.scala
// Solution to Exercise 1 in "A Little Reflection"
import com.atomicscala.AtomicTest._
import com.atomicscala.Name

case class Toy(name:String, batteryOperated:Boolean)

val toy = new Toy("Teddy Bear", false)

println(toy)

case class ReflectedToy(name:String, batteryOperated:Boolean) extends Name

val reflectedToy = new ReflectedToy("Bunny", true)
println(reflectedToy)
