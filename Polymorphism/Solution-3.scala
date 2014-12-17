// Solution-3.scala
// Solution to Exercise 3 in "Polymorphism"
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

class Wall extends Inert {
  override def draw = "Don't draw on the wall!"
}

val e = new Element
e.draw is "Drawing the element"

val in = new Inert
in.draw is "Inert drawing!"

val wall = new Wall
wall.draw is "Don't draw on the wall!"

/* OUTPUT_SHOULD_BE
Drawing the element
Inert drawing!
Don't draw on the wall!
*/
