// Solution-3.scala
// Solution to Exercise 3 in "Auxiliary Constructors"
import com.atomicscala.AtomicTest._

println("Can't put anything before the call to primary constructor")

class TryMe(val name: String) {
  def this() = {
    //println("Can't put anything before the call to primary constructor")
    // Can't even put a val
    // val someVal = 0
    this("Default Name")
  }
}
