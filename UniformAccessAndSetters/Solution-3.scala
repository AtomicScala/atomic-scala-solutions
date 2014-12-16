// Solution-3.scala
// Solution to Exercise 3 in "Uniform Access & Setters"
import com.atomicscala.AtomicTest._

class FunStuff {
  var internal = "all the fun happens here"
  def x = internal
  def x_=(newVal:String) = internal = newVal
}

val fun = new FunStuff
fun.x is "all the fun happens here"
fun.x = "make it so"
fun.x is "make it so"

/* OUTPUT_SHOULD_BE
all the fun happens here
make it so
*/
