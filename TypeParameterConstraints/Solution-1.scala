// Solution-1.scala
// Solution to Exercise 1 in "Type Parameter Constraints"
import com.atomicscala.AtomicTest._

/*{oldDescription}
1.  Modify House5.scala from Composition by adding Enumerations for different types of food and utensils. Use type constraints for Clean and Store as shown in Resilience.scala
{oldDescription}*/

// House5.scala

trait Building
trait Room
trait Storage
trait Sink
trait Store[T]
trait Cook[T]
trait Clean[T]

trait Edible

object Protein extends Enumeration {
  case class _Val() extends Val
       with Edible
    type Protein = _Val
    val beef, chicken, pork, tofu = _Val()
  }

object Fruit extends Enumeration {
  case class _Val() extends Val
    with Edible
  type Fruit = _Val
  val apple, orange, banana, tomato = _Val()
}

trait Food[F <: Edible] extends Store[F]
  with Clean[F]
  with Cook[F]

trait Handheld

object Cutlery extends Enumeration {
  case class _Val() extends Val
    with Handheld
  type Cutlery = _Val
  val knife, spoon, fork, spatula = _Val()

}

object Device extends Enumeration {
  case class _Val() extends Val
    with Handheld
  type Device = _Val
  val poacher, timer, sifter, torch = _Val()
}

trait Utensils[U <: Handheld] extends Store[U]
  with Clean[U]
  with Cook[U]

trait Kitchen {
  val rooms:Vector[Room]
  val storage:Storage
  val sinks:Vector[Sink]
  val food:Food[Edible]
  val utensils:Utensils[Handheld]
}

trait House extends Building {
  val kitchens:Vector[Kitchen]
}

val house = new Object with House
// needs solution

/* OUTPUT_SHOULD_BE

*/
