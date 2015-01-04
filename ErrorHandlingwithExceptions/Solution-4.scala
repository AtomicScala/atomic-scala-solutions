// Solution-4.scala
// Solution to Exercise 4 in "Error Handling with Exceptions"
import com.atomicscala.AtomicTest._

class FauxPas(msg:String) extends Exception(msg) {
  def what = msg
}

def t = try {
  throw new FauxPas("Oops!")
} catch {
  case e:FauxPas => e.what
}

t is "Oops!"

/* OUTPUT_SHOULD_BE
Oops!
*/
