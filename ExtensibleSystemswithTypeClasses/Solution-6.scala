// Solution-6.scala
// Solution to Exercise 6 in "Extensible Systems with Type Classes"
import com.atomicscala.AtomicTest._

trait Transformer[From, To] {
  def convert(source:From):To
}

def transform[From, To](source:From)(implicit transformer:Transformer[From, To]):To =
  transformer.convert(source)

/********* Pets *************/
case class Pet(name:String)

implicit object PetTransformer extends Transformer[Pet, String] {
  def convert(pet:Pet):String = s"Here, ${pet.name}!"
}

transform(Pet("Pollux")) is "Here, Pollux!"

/********* Rectangles ******/
case class Rectangle(sideA:Double, sideB:Double)

implicit object RectangleTransformer extends Transformer[Rectangle, Double] {
  def convert(shape:Rectangle):Double = shape.sideA * shape.sideB
}

transform(Rectangle(4.5, 11)) is 49.50

// We can also create Transformers for existing types:
implicit object DoubleTransformer extends Transformer[Double, Int] {
  def convert(source:Double):Int = source.toInt // Truncates
}

transform(1.99) is 1

// Based on Solution 1 from "Design by Contract":
implicit object StringTransformer extends Transformer[String, Int] {
  def convert(source:String):Int = source.foldLeft(0)(_ + _.asDigit)
}

transform("Supercalifragilisticexpealidocious") is 681

/* OUTPUT_SHOULD_BE
Here, Pollux!
49.5
1
681
*/
