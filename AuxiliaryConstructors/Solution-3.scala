// Solution-3.scala
// Solution to Exercise 3 in "Auxiliary Constructors"
import com.atomicscala.AtomicTest._

// You can't put anything before the call to the primary constructor

class TryMe(val name:String) {
  def this() = {
    // Can't even put a val definition:
    val someVal = 0
    this("Default Name")
  }
}

/* OUTPUT_SHOULD_CONTAIN
error: 'this' expected but 'val' found.
    val someVal = 0
    ^
one error found
*/
