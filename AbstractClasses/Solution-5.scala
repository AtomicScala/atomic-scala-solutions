// Solution-5.scala
// Solution to Exercise 5 in "Abstract Classes"
import com.atomicscala.AtomicTest._

abstract class Animal {
  def templateMethod =
    "The " + animal + " goes " + sound
  def animal:String
  def sound:String
  def food:String
}

class PrehistoricAnimal extends Animal {
  def animal:String = "Dinosaur"
  def sound:String = "roar"
  def food:String = "other dinosaurs"
  def namedAnimal(name:String):String = animal + ": " + name
}

val dino = new PrehistoricAnimal
dino.namedAnimal("T-Rex") is "Dinosaur: T-Rex"
dino.templateMethod is "The Dinosaur goes roar"

/* OUTPUT_SHOULD_BE
Dinosaur: T-Rex
The Dinosaur goes roar
*/
