// Solution-2.scala
// Solution to Exercise 2 in "Error Reporting with Either"
import com.atomicscala.AtomicTest._

class Cell {
  var entry = ' '
  def set(e:Char) =
    if(entry==' ' && (e=='X' || e=='O')) {
      entry = e
      Right("successful move")
    } else
      Left("invalid move")
}

class Grid {
  val cells = Vector(
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell)
  )
  def play(e:Char, x:Int, y:Int) = {
    if(x < 0 || x > 2 || y < 0 || y > 2)
      Left("invalid move")
    else
      cells(x)(y).set(e)
  }
}

val grid = new Grid
grid.play('X', 1, 1) is Right("successful move")
grid.play('X', 1, 1) is Left("invalid move")
grid.play('O', 1, 3) is Left("invalid move")

/* OUTPUT_SHOULD_BE
Right(successful move)
Left(invalid move)
Left(invalid move)
*/
