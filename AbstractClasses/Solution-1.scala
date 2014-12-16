// Solution-1.scala
// Solution to Exercise 1 in "Abstract Classes"
import com.atomicscala.AtomicTest._

abstract class Animal {
  def templateMethod =
    "The " + animal + " goes " + sound
  // Abstract methods (no function body):
  def animal:String
  def sound:String
  def food:String
}

class Duck extends Animal {
  def animal = "Duck"
  // optional override:
  override def sound = "Quack"
  def food = "plants"
}

class Cow extends Animal {
  def animal = "Cow"
  def sound = "Moo"
  def food = "grass"
}

val duck = new Duck
duck.food is "plants"
val cow = new Cow
cow.food is "grass"

/* OUTPUT_SHOULD_BE
plants
grass
*/
