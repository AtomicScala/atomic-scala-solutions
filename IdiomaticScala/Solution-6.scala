// Solution-6.scala
// Solution to Exercise 6 in "Idiomatic Scala"
import com.atomicscala.AtomicTest._

// Dog.scala
class Dog {
  def bark = "yip!"
}
val dog = new Dog
dog.bark is "yip!"

// Cat.scala
  class Cat {
  def meow = "mew!"
}
val cat = new Cat
cat.meow is "mew!"

// Hamster.scala
  class Hamster {
  def speak = "squeak!"
  def exercise = speak + " Running on wheel"

}
val hamster = new Hamster
hamster.exercise is "squeak! Running on wheel"

/* OUTPUT_SHOULD_BE
yip!
mew!
squeak! Running on wheel
*/
