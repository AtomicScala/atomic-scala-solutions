// Solution-4.scala
// Solution to Exercise 4 in "Error Handling with Exceptions"
/* Inherit your own subclass of Exception. Write a constructor for this class
that takes a String argument and stores it inside the base-class Exception
object. Write a method that displays the stored String. Create a try-catch
clause to test your new exception class. */
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
