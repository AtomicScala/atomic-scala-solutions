// Solution-2.scala
// Solution to Exercise 2 in "Overriding Methods"
import com.atomicscala.AtomicTest._

class GreatApe2(val weight:Double, val age:Int, val gender:String) {
  def knownWords:Vector[String] = Vector("Roar")
}

class Bonobo2(weight:Double, age:Int, gender:String)
  extends GreatApe2(weight, age, gender) {
  override def knownWords:Vector[String] = super.knownWords ++ Vector("Hello")
}

val roaringApe = new GreatApe2(112, 9, "Male")
roaringApe.knownWords is Vector("Roar")

val chattyBonobo = new Bonobo2(150, 14, "Female")
chattyBonobo.knownWords is Vector("Roar","Hello")

/* OUTPUT_SHOULD_BE

*/
