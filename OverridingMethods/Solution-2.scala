// Solution-2.scala
// Solution to Exercise 2 in "Overriding Methods"
import com.atomicscala.AtomicTest._

class GreatApe2(val weight:Double, val age:Int, val gender:String) {
  def myWords:Vector[String] = Vector("Roar")
}

class Bonobo2(weight:Double, age:Int, gender:String)
  extends GreatApe2(weight, age, gender) {
  override def myWords:Vector[String] = super.myWords ++ Vector("Hello")
}

val roaringApe = new GreatApe2(112, 9, "Male")
roaringApe.myWords is Vector("Roar")

val chattyBonobo = new Bonobo2(150, 14, "Female")
chattyBonobo.myWords is Vector("Roar", "Hello")

/* OUTPUT_SHOULD_BE
Vector(Roar)
Vector(Roar, Hello)
*/
