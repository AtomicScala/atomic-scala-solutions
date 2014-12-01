// Solution-7.scala
// Solution to Exercise 7 in "Summary 2"
import com.atomicscala.AtomicTest._

// TicTacToe.scala

class Cell {
  var entry = ' '
  def set(e:Char) = {
    if(entry==' ' && (e=='X' || e=='O')) {
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
  def play(e:Char, x:Int, y:Int) = {
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
    for (row <- cells) {
      for (cell <- row) {
        print(cell.entry + " ")
      }
      println
    }
  }
}

val grid = new Grid
grid.play('X', 1, 1) is "successful move"
grid.play('X', 1, 1) is "invalid move"
grid.play('O', 1, 3) is "invalid move"
grid.play('O', 0, 0) is "successful move"
grid.play('X', 2, 2) is "successful move"
