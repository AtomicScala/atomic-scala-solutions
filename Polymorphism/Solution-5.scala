// Solution-5.scala
// Solution to Exercise 5 in "Polymorphism" (2nd edition)
import com.atomicscala.AtomicTest._

class Seed

class Tomato extends Seed {
  override def toString = "Tomato"
}

class Corn extends Seed {
  override def toString = "Corn"
}

class Zucchini extends Seed {
  override def toString = "Zucchini"
}

class Garden(seeds:Seed*) {
  val plants = seeds.toVector
  override def toString = plants.mkString(", ")
}

val garden = new Garden(new Tomato, new Corn, new Zucchini)
garden is "Tomato, Corn, Zucchini"

/* OUTPUT_SHOULD_BE
Tomato, Corn, Zucchini
*/
