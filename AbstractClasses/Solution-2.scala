// Solution-2.scala
// Solution to Exercise 2 in "Abstract Classes"
import com.atomicscala.AtomicTest._

abstract class Animal {
  def templateMethod =
    "The " + animal + " goes " + sound
  // Abstract methods (no function body):
  def animal:String
  def sound:String
  def food:String
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

val chicken = new Chicken
chicken.food is "insects"
val pig = new Pig
pig.food is "anything"

