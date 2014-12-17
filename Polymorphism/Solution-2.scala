// Solution-2.scala
// Solution to Exercise 2 in "Polymorphism"
import com.atomicscala.AtomicTest._
import com.atomicscala.Name

class Element extends Name {
  def interact(other:Element) =
    s"$this interact $other"
  def draw = "Drawing the element"
}

class Inert extends Element {
  override def draw = "Inert drawing!"
}
class Wall extends Inert

val e = new Element
e.draw is "Drawing the element"

val in = new Inert
in.draw is "Inert drawing!"

val wall = new Wall
wall.draw is "Inert drawing!"

/* OUTPUT_SHOULD_BE
Drawing the element
Inert drawing!
Inert drawing!
*/
