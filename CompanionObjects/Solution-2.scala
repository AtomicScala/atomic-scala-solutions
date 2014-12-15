// Solution-2.scala
// Solution to Exercise 2 in "Companion Objects"
import com.atomicscala.AtomicTest._

class WalkActivity2

object WalkActivity2 {
  //val log = new StringBuilder (another solution!)
  var log = new String
  def start(athlete:String) =
    log += "[" + athlete + "] Activity started."
  def stop(athlete:String) =
    log += "[" + athlete + "] Activity stopped."
}

WalkActivity2.start("Jane")
WalkActivity2.stop("Jane")
WalkActivity2.start("John")
WalkActivity2.log is "[Jane] Activity started.[Jane] Activity stopped.[John] Activity started."

/* OUTPUT_SHOULD_BE
[Jane] Activity started.[Jane] Activity stopped.[John] Activity started.
*/
