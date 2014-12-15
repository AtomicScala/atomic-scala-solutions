// Solution-3.scala
// Solution to Exercise 3 in "Idiomatic Scala"
import com.atomicscala.AtomicTest._

// CompoundExpressions2.scala

val activity = "swimming"
val hour = 10

val isOpen =
  if(activity == "swimming" || activity == "ice skating") {
    val opens = 9
    val closes = 20
    println("Operating hours: " + opens + " - " + closes)
    if(hour >= opens && hour <= closes) true
    else
      false
  } else
    true

println(isOpen)

// OR ...

def isOpen(activity:String, hour:Int) = activity match {
  case "swimming" | "ice skating" =>
    val opens = 9
    val closes = 20
    println("Operating hours: " + opens + " - " + closes)
    (hour >= opens && hour <= closes)
  case _ => true
}

println(isOpen("swimming", 10))

/* OUTPUT_SHOULD_BE
Operating hours: 9 - 20
true
Operating hours: 9 - 20
true
*/
