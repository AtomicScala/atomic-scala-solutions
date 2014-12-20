// Solution-3.scala
// Solution to Exercise 3 in "Composition" (1st Edition)
import com.atomicscala.AtomicTest._

case class Knife(name:String)
case class Fork(name:String)
case class Spoon(name:String)
class Utensils

case class Spatula(name:String)
case class Flatware(names:String*)

class PrepUtensils extends Utensils {
  val spatula = new Spatula("Turning")
  val chefKnife = new Knife("Chef")
  val butterKnife  = new Knife("Butter")
  val spoon = new Spoon("Serving")
  override def toString = "PrepUtensils"
}

class ServeUtensils extends Utensils {
  val flatware = new Flatware("Fork", "Knife", "Spoon")
  val servingSpoon = new Spoon("Serving")
  override def toString = "ServeUtensils"
}

trait Kitchen {
  def serveFood:Boolean
  def prepFood:Boolean
  val utensils:Vector[Utensils]
}

class ServingKitchen extends Kitchen {
  override def serveFood:Boolean = true
  override def prepFood:Boolean = false
  val serveUtensils = new ServeUtensils
  val utensils = Vector(serveUtensils)
}

class WorkKitchen extends Kitchen {
   override def serveFood:Boolean = false
   override def prepFood:Boolean = true
   val prepUtensils = new PrepUtensils
   val utensils = Vector(prepUtensils)
}

class SimpleKitchen extends Kitchen {
  override def serveFood:Boolean = true
  override def prepFood:Boolean = true
  val serveUtensils = new ServeUtensils
  val prepUtensils = new PrepUtensils
  val utensils = Vector(serveUtensils, prepUtensils)
}

val serving = new ServingKitchen
serving.serveFood is true
serving.prepFood is false
serving.utensils is "Vector(ServeUtensils)"

val work = new WorkKitchen
work.prepFood is true
work.serveFood is false
work.utensils is "Vector(PrepUtensils)"

val simple = new SimpleKitchen
simple.serveFood is true
simple.prepFood is true
simple.utensils is "Vector(ServeUtensils, PrepUtensils)"

/* OUTPUT_SHOULD_BE
true
false
Vector(ServeUtensils)
true
false
Vector(PrepUtensils)
true
true
Vector(ServeUtensils, PrepUtensils)
*/
