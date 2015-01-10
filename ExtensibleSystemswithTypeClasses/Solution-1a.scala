// Solution-1a.scala
// Solution to Exercise 1 in "Extensible Systems with Type Classes"
import com.atomicscala.AtomicTest._
import scala.math.{Pi, sqrt}

trait Shape {
  def area:Double
}

case class Circle(radius:Double)
extends Shape {
  def area = 2 * Pi * radius
}

case class EQLTriangle(side:Double)
extends Shape {
  def area = (sqrt(3)/4) * side * side
}

case class Rectangle(sideA:Double, sideB:Double)
extends Shape {
  def area = sideA * sideB
}

val shapes = Vector(Circle(2.2),
  EQLTriangle(3.9), Rectangle(4.5, 11))

def a(s:Shape) = f"$s area: ${s.area}%.2f"

val result = for(s <- shapes) yield a(s)

result is "Vector(Circle(2.2) area: 13.82, EQLTriangle(3.9) area: 6.59, Rectangle(4.5,11.0) area: 49.50)"

/* OUTPUT_SHOULD_BE
Vector(Circle(2.2) area: 13.82, EQLTriangle(3.9) area: 6.59, Rectangle(4.5,11.0) area: 49.50)
*/
