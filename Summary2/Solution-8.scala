// Solution-8.scala
// Solution to Exercise 8 in "Summary 2"
import com.atomicscala.AtomicTest._

class Cell {
  var entry = ' '
  def set(e:Char):String = {
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
  def play(e:Char, x:Int, y:Int):String = {
    val status = {
      if(x < 0 || x > 2 || y < 0 || y > 2)
        "invalid move"
      else
        cells(x)(y).set(e)
    }
    showBoard()
    status
  }
  def showBoard():Unit = {
    for(row <- cells) {
      for(cell <- row) {
        print(cell.entry + " ")
      }
      println
    }
  }
  def checkFor3(row:Vector[Cell]):Boolean = {
    var countX = 0
    var countO = 0
    for(c <- row) {
      if(c.entry == 'X') {
        countX = countX + 1
      }
      else if(c.entry == 'O') {
        countO = countO + 1
      }
    }
    if(countX == 3) true
        else if(countO == 3) true
    else false
  }
  def checkWinner():Boolean = {
    for(row <- cells) {
      if(checkFor3(row)) return true
    }
    // transpose (to check columns)
    for(row <- cells.transpose) {
      if(checkFor3(row)) return true
    }
    // check diagonal
    val diag1 = Vector(cells(0)(0), cells(1)(1), cells(2)(2))
    if(checkFor3(diag1)) return true
    val diag2 = Vector(cells(0)(2), cells(1)(1), cells(2)(0))
    if(checkFor3(diag2)) return true
    false
  }
}

val grid = new Grid
grid.play('X', 0, 0)
grid.play('X', 0, 1)
grid.play('X', 0, 2)
grid.checkWinner() is true

val grid2 = new Grid
grid2.play('X', 0, 1)
grid2.play('X', 1, 1)
grid2.play('X', 2, 1)
grid2.checkWinner() is true

val grid3 = new Grid
grid3.play('X', 0, 0)
grid3.play('X', 1, 1)
grid3.play('X', 2, 2)
grid3.checkWinner() is true

val grid4 = new Grid
grid4.play('X', 0, 2)
grid4.play('X', 1, 1)
grid4.play('X', 2, 0)
grid4.checkWinner() is true

// need to be all same symbol
val grid5 = new Grid
grid5.play('X', 0, 2)
grid5.play('O', 1, 1)
grid5.play('X', 2, 0)
grid5.checkWinner() is false

// needs to work for O too!
val grid6 = new Grid
grid6.play('O', 0, 0)
grid6.play('O', 0, 1)
grid6.play('O', 0, 2)
grid6.checkWinner() is true

/* OUTPUT_SHOULD_BE
X


X X


X X X


true
  X


  X
  X

  X
  X
  X
true
X


X
  X

X
  X
    X
true
    X


    X
  X

    X
  X
X
true
    X


    X
  O

    X
  O
X
false
O


O O


O O O


true
*/
