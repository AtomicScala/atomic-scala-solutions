// Solution-1.scala
// Solution to Exercise 1 in "Polymorphism"
import com.atomicscala.AtomicTest._

trait Mobile {
  def moves = "Movement"
}

class Animal extends Mobile {
  override def moves = "Biological " + super.moves
}

class Vehicle  extends Mobile {
  override def moves = "Mechanical " + super.moves
}

def movable(mobile:Mobile) = mobile.moves

movable(new Animal) is "Biological Movement"
movable(new Vehicle) is "Mechanical Movement"

/* OUTPUT_SHOULD_BE
Biological Movement
Mechanical Movement
*/
