// Solution-1.scala
// Solution to Exercise 1 in "Companion Objects"
import com.atomicscala.AtomicTest._

class WalkActivity

object WalkActivity {
  def start(athlete:String) = println(s"$athlete started!")
}

WalkActivity.start("Johnny")

/* OUTPUT_SHOULD_BE
Johnny started!
*/
