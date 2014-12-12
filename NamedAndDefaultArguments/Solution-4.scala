// Solution-4.scala
// Solution to Exercise 4 in "Named & Default Arguments"
import com.atomicscala.AtomicTest._

class Planet(val name:String, val description:String, val moons:Int = 1) {
  def hasMoon():Boolean = {
    if(moons > 0) true else false
  }
}

val earth = new Planet(moons = 1, name="Earth", description = "a hospitable planet")
earth.hasMoon is true

/* OUTPUT_SHOULD_BE
true
*/
