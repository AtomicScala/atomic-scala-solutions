// Solution-5.scala
// Solution to Exercise 5 in "Abstract Classes"
import com.atomicscala.AtomicTest._

abstract class Animal {
  def templateMethod =
    "The " + animal + " goes " + sound
  // Abstract methods (no function body):
  def animal:String
  def sound:String
  def food:String
}

class PrehistoricAnimal extends Animal {
  def food:String = "insects"
  def sound:String = "roar"
  // If you remove the following line, this will fail
  // Needs a definition
  def animal:String = "Dinosaur"
  def animal(name:String):String = name
}

val dino = new PrehistoricAnimal
dino.animal("T-Rex") is "T-Rex"
dino.animal is "Dinosaur"
