// Solution-3.scala
// Solution to Exercise 3 in "Companion Objects"
import com.atomicscala.AtomicTest._

class WalkActivity3 {
  def calories(lbs:Int, mins:Int, mph:Double = 3):Long =
    scala.math.round((WalkActivity3.MET * 3.5 * lbs * 0.45)/200.0 * mins)
}

object WalkActivity3 {
  var log = new String
  val MET = 2.3
  def start(athlete:String) =
    log += "[" + athlete + "] Activity started,"
  def stop(athlete:String) =
    log += "[" + athlete + "] Activity stopped,"
}

val sally = new WalkActivity3
sally.calories(150, 30) is 82

/* OUTPUT_SHOULD_BE
82
*/
