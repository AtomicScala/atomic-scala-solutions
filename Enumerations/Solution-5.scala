// Solution-5.scala
// Solution to Exercise 5 in "Enumerations"
import com.atomicscala.AtomicTest._

object Move extends Enumeration {
  type Move = Value
  val Unset, X, O = Value
}
import Move._

class Cell {
  var entry = Unset
  def set(e:Move) = {
    if(entry == Unset && (e == X || e == O)) {
      entry = e
      "successful move"
    } else
      "invalid move"
  }
}

class Grid {
  val cells = Vector(
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell),
    Vector(new Cell, new Cell, new Cell)
  )
  def play(e:Move, x:Int, y:Int) = {
    val status = {
      if(x < 0 || x > 2 || y < 0 || y > 2)
        "invalid move"
      else
        cells(x)(y).set(e)
    }
    showBoard()
    status
  }
  def showBoard() = {
    for(row <- cells) {
      for(cell <- row) {
        print(cell.entry + " ")
      }
      println
    }
  }
}

val grid = new Grid
grid.play(Move.X, 1, 1) is "successful move"
grid.play(Move.X, 1, 1) is "invalid move"
grid.play(Move.O, 1, 3) is "invalid move"
grid.play(Move.O, 0, 0) is "successful move"
grid.play(Move.X, 2, 2) is "successful move"

/* OUTPUT_SHOULD_BE
Unset Unset Unset
Unset X Unset
Unset Unset Unset
successful move
Unset Unset Unset
Unset X Unset
Unset Unset Unset
invalid move
Unset Unset Unset
Unset X Unset
Unset Unset Unset
invalid move
O Unset Unset
Unset X Unset
Unset Unset Unset
successful move
O Unset Unset
Unset X Unset
Unset Unset X
successful move
*/
