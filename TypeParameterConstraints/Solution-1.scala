// Solution-1.scala
// Solution to Exercise 1 in "Type Parameter Constraints"
import com.atomicscala.AtomicTest._

// Here's one way to solve it -- but not the only way.

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
import Protein._

object Fruit extends Enumeration {
  case class _Val() extends Val
    with Edible
  type Fruit = _Val
  val apple, orange, banana, tomato = _Val()
}
import Fruit._

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
import Cutlery._

object Device extends Enumeration {
  case class _Val() extends Val
    with Handheld
  type Device = _Val
  val poacher, timer, sifter, torch = _Val()
}
import Device._

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
  val kitchens = Vector[Kitchen]()
}

val house = new Object with House

/* OUTPUT_SHOULD_BE
INCOMPLETE SOLUTION
*/
