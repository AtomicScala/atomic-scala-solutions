// Solution-2.scala
// Solution to Exercise 2 in "Polymorphism"
import com.atomicscala.AtomicTest._

class Element {
  def draw = "Drawing the element"
}

class Inert extends Element {
  override def draw = "Inert drawing!"
}

val e = new Element
e.draw is "Drawing the element"

val in = new Inert
in.draw is "Inert drawing!"

class Wall extends Inert
val wall = new Wall
wall.draw is "Inert drawing!"

/* OUTPUT_SHOULD_BE

*/
