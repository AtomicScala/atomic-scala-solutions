// Solution-3.scala
// Solution to Exercise 3 in "Polymorphism"
import com.atomicscala.AtomicTest._

class Element {
  def draw = "Drawing the element"
}

class Inert extends Element {
  override def draw = "Inert drawing!"
}


class Wall2 extends Inert {
   override def draw = "Don't draw on the wall!"
}

val wall2 = new Wall2
wall2.draw is "Don't draw on the wall!"
