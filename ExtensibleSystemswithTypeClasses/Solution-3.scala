// Solution-3.scala
// Solution to Exercise 3 in "Extensible Systems with Type Classes"
import com.atomicscala.AtomicTest._
import scala.math.{Pi, sqrt}

trait Calc[S] {
  def area(shape:S):Double
}

def a[S](shape:S)(implicit calc:Calc[S]) =
  f"$shape area: ${calc.area(shape)}%2.2f"

case class Circle(radius:Double)

implicit object CircleCalc
extends Calc[Circle] {
  def area(shape:Circle) =
    2 * shape.radius * Pi
}

case class EQLTriangle(side:Double)

implicit object EQLTriangleCalc
extends Calc[EQLTriangle] {
  def area(shape:EQLTriangle) =
    (sqrt(3)/4) * shape.side * shape.side
}

case class Rectangle(sideA:Double, sideB:Double)

a(Circle(2.2)) is "Circle(2.2) area: 13.82"
a(EQLTriangle(3.9)) is "EQLTriangle(3.9) area: 6.59"

a(Rectangle(4.5, 11)) is "Rectangle(4.5,11.0) area: 49.50"

/* OUTPUT_SHOULD_CONTAIN
Solution-3.scala:34: error: could not find implicit value for parameter calc: this.Calc[this.Rectangle]
a(Rectangle(4.5, 11)) is "Rectangle(4.5,11.0) area: 49.50"
 ^
one error found
*/
