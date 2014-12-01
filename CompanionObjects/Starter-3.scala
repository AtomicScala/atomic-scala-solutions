// Starter Code for Exercise 3
// From "Companion Objects" atom
import com.atomicscala.AtomicTest._

def calories(lbs:Int, mins:Int, mph:Double=3):Long =
  math.round((MET * 3.5 * lbs * 0.45)/200.0 * mins)

val sally = new WalkActivity3
sally.calories(150, 30) is 82
