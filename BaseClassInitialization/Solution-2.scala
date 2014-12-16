// Solution-2.scala
// Solution to Exercise 2 in "Base Class Initialization"
import com.atomicscala.AtomicTest._

class GreatApe2(val weight:Double, val age:Int, val gender:String) {
  def myWords:Vector[String] = Vector("Roar")
}

class Bonobo2(weight:Double, age:Int, gender:String)
  extends GreatApe2(weight, age, gender) {
     println(myWords ++ Vector("Hello"))
}

new Bonobo2(150, 14, "Female")

/* OUTPUT_SHOULD_BE
Vector(Roar, Hello)
*/
