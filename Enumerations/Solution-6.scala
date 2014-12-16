// Solution-6.scala
// Solution to Exercise 6 in "Enumerations"
import com.atomicscala.AtomicTest._

object Level extends Enumeration {
  type Level = Value
  val Overflow, High, Medium,
      Low, Empty = Value
  val Draining, Pooling, Dry = Value
}

import Level._

def checkLevel(level:Level) = level match {
  case Overflow | Pooling => "Warning!"
  case Empty | Dry => "Alert"
  case other =>  "Level " + level + " OK"
}

Level.Draining is Draining
Level.Draining.id is 5

checkLevel(Low) is "Level Low OK"
checkLevel(Empty) is "Alert"
checkLevel(Draining) is "Level Draining OK"
checkLevel(Pooling) is "Warning!"
checkLevel(Dry) is "Alert"

/* OUTPUT_SHOULD_BE
Draining
5
Level Low OK
Alert
Level Draining OK
Warning!
Alert
*/
