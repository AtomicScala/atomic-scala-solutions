// Solution-3.scala
// Solution to Exercise 3 in "Named & Default Arguments"
import com.atomicscala.AtomicTest._

class Planet(val name:String, val description:String, val moons:Int = 1) {
  def hasMoon():Boolean = {
    if(moons > 0) {
      true 
    } else {
      false
    }
  }
}

val p = new Planet(name = "Mercury", description = "small and hot planet", moons = 0)
p.hasMoon is false

/* OUTPUT_SHOULD_BE
false
*/
