// Solution-6.scala
// Solution to Exercise 6 in "Polymorphism" (2nd edition)
import com.atomicscala.AtomicTest._

trait Shape {
  def draw:String
}

class Rectangle extends Shape {
  override def draw = "Rectangle"
}

class Square extends Rectangle {
  override def draw = "Square"
}

class Ellipse extends Shape {
  override def draw = "Ellipse"
}

class Circle extends Ellipse {
  override def draw = "Circle"
}

class Drawing(shapes:Shape*) {
  val parts = shapes.toVector
  def draw = for { shape <- parts } yield shape.draw
  override def toString = draw.mkString(", ")
}

val drawing = new Drawing(
  new Rectangle, new Square,
  new Ellipse, new Circle)
drawing.draw is "Vector(Rectangle," +
  " Square, Ellipse, Circle)"
drawing is "Rectangle, Square," +
  " Ellipse, Circle"

/* OUTPUT_SHOULD_BE
Vector(Rectangle, Square, Ellipse, Circle)
Rectangle, Square, Ellipse, Circle
*/
