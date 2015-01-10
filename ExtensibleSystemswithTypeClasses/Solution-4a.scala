// Solution-4a.scala
// Solution to Exercise 4 in "Extensible Systems with Type Classes"
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

a(Circle(2.2)) is "Circle(2.2) area: 13.82"
a(EQLTriangle(3.9)) is "EQLTriangle(3.9) area: 6.59"
a(Circle(4.5)) is "Circle(4.5) area: 28.27"

// The duplicated lines from Shape_Inheritance.scala:
val shapes = Vector(Circle(2.2), EQLTriangle(3.9), Circle(4.5))
// But it's a Vector of unrelated types:
val result = for(s <- shapes) yield a(s)

/* OUTPUT_SHOULD_CONTAIN
Solution-4a.scala:36: error: could not find implicit value for parameter calc: this.Calc[Product with Serializable]
val result = for(s <- shapes) yield a(s)
                                     ^
one error found
*/
