// Solution-3.scala
// Solution to Exercise 3 in "A Little Reflection"
import com.atomicscala.AtomicTest._
import com.atomicscala.Name2

case class ReflectedToy3(name:String, batteryOperated:Boolean) extends Name2

val reflected3 = new ReflectedToy3("Flamingo", false)
println(reflected3)

// The above results in anonymous class $anon$1$ReflectedToy3
// needs solution
