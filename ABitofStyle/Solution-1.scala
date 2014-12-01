// Solution-1.scala
// Solution to Exercise 1 in "A Bit of Style"
import com.atomicscala.AtomicTest._

class Exclaim(val s:String) {
  def parens() = s + "!"
  def noParens = s + "!"
}

val e = new Exclaim("cool")
e.noParens is "cool!"
e.parens() is "cool!"
