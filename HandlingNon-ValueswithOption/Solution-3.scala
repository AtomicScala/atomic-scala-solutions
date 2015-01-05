// Solution-3.scala
// Solution to Exercise 3 in "Handling Non-Values with Option"
import com.atomicscala.AtomicTest._

class Cell {
  var entry = ' '
  def set(e:Char):Option[String] =
    if(entry==' ' && (e=='X' || e=='O')) {
      entry = e
      Some("successful move")
    } else
      None
}

class Grid {
  val cells = Vector(
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell)
  )
  def play(e:Char, x:Int, y:Int):Option[String] = {
    if(x < 0 || x > 2 || y < 0 || y > 2)
      None
    else
      cells(x)(y).set(e)
  }
}

val grid = new Grid
grid.play('X', 1, 1) is Some("successful move")
grid.play('X', 1, 1) is None
grid.play('O', 1, 3) is None

/* OUTPUT_SHOULD_BE
Some(successful move)
None
None
*/
