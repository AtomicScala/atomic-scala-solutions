// Solution-2.scala
// Solution to Exercise 2 in "Extensible Systems with Type Classes"
import com.atomicscala.AtomicTest._

/*{oldDescription} 2.  Add a new operation show to
Shape_Inheritance.scala that returns a String of information about
the Shape. Verify that it works. Now do the same thing to
Shape_TypeClass.scala and note the differences. {oldDescription}*/

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

val shapes = Vector(Circle(2.2),
  EQLTriangle(3.9), Circle(4.5))

def a(s:Shape) = f"$s area: ${s.area}%.2f"

val result = for(s <- shapes) yield a(s)

result is "Vector(Circle(2.2) area: " +
"13.82, EQLTriangle(3.9) area: 6.59," +
" Circle(4.5) area: 28.27)"


/* OUTPUT_SHOULD_BE

*/
