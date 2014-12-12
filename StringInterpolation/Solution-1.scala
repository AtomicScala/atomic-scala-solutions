// Solution-1.scala
// Solution to Exercise 1 in "String Interpolation"
import com.atomicscala.AtomicTest._

class GardenGnome(val height:Double, val weight:Double, val happy:Boolean) {
  println("Inside primary constructor")
  var painted = true
  def magic(level:Int):String = {
    "Poof! " + level
  }
  def this(height:Double) {
    this(height, 100.0, true)
  }
  def this(name:String) = {
    this(15.0)
    painted is true
  }
  def show():String = {
    s"$height $weight $happy $painted"
  }
}

val gnome = new GardenGnome(20.0, 110.0, false)
gnome.show() is "20.0 110.0 false true"
val bob = new GardenGnome("Bob")
bob.show() is "15.0 100.0 true true"

/* OUTPUT_SHOULD_BE
Inside primary constructor
20.0 110.0 false true
Inside primary constructor
true
15.0 100.0 true true
*/
