// Solution-2.scala
// Solution to Exercise 2 in "Abstract Classes"
import com.atomicscala.AtomicTest._

abstract class Animal {
  def templateMethod =
    "The " + animal + " goes " + sound
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

class Chicken extends Animal {
  def food = "insects"
  def animal = "Chicken"
  def sound = "Bawk"
}

class Pig extends Animal {
  def food = "anything"
  def animal = "Pig"
  def sound = "Oink"
}

val duck = new Duck
duck.food is "plants"
val cow = new Cow
cow.food is "grass"

val chicken = new Chicken
chicken.food is "insects"
val pig = new Pig
pig.food is "anything"

/* OUTPUT_SHOULD_BE
plants
grass
insects
anything
*/
