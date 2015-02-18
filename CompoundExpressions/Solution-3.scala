// Solution-3.scala
// Solution to Exercise 3 in "Compound Expressions"

val airTemperature = 40
val hour = 7

// Uncomment these one at a time:
/* val activity = "swimming" */
/* val activity = "walking" */
/* val activity = "biking" */
/* val activity = "couch" */

val isOpen = {
  if(activity == "swimming") {
      val opensAt = 9
      val closesAt = 20
      if(hour >= opensAt && hour <= closesAt) true
      else false
  } else {
    true
  }
}

val isGoodTemperature = {
  if(activity == "swimming") {
    if(airTemperature > 80) true
    else false
  } else if(activity == "biking") {
    if(airTemperature > 50) true
    else false
  } else true
}

val shouldDoActivity = isOpen && isGoodTemperature
println(activity + ":" + isOpen + " && " +
  isGoodTemperature + " = " + shouldDoActivity)

/* OUTPUT_SHOULD_BE
swimming:false && false = false
*/
