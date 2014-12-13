// Solution-1.scala
// Solution to Exercise 1 in "Polymorphism"
import com.atomicscala.AtomicTest._

trait Mobile {
  def moves = "Locomotion!"
}

class Animal {
  def breathes = true
  def descriptor = "Beast"
}
class Vehicle {
  def hasDriver = true
  def descriptor = "Machine"
}

class MovingAnimal extends Animal with Mobile
class MovingVehicle extends Vehicle with Mobile

val dog = new MovingAnimal
dog.moves is "Locomotion!"

val car = new MovingVehicle
car.moves is "Locomotion!"

// try somethat that doesn't use the Mobile trait
// val blob = new Animal
// blob.moves is "Locomotion!"

/* OUTPUT_SHOULD_BE

*/
