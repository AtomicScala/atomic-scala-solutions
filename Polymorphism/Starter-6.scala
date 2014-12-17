// Starter Code for Exercise 6
// From "Polymorphism" atom (2nd edition)
import com.atomicscala.AtomicTest._

val drawing = new Drawing(
  new Rectangle, new Square,
  new Ellipse, new Circle)
drawing.draw is "Vector(Rectangle," +
  " Square, Ellipse, Circle)"
drawing is "Rectangle, Square," +
  " Ellipse, Circle"
