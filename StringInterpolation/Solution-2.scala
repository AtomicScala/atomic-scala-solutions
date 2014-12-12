// Solution-2.scala
// Solution to Exercise 2 in "String Interpolation"
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
  def show(level: Int):String = s"${magic(level)} $happy $painted"
}

val gnome = new GardenGnome(20.0, 50.0, false)
gnome.show(87) is "Poof! 87 false true"
val bob = new GardenGnome("Bob")
bob.show(25) is "Poof! 25 true true"

/* OUTPUT_SHOULD_BE
Inside primary constructor
Poof! 87 false true
Inside primary constructor
true
Poof! 25 true true
*/
