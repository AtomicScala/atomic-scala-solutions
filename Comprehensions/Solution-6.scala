// Solution-6.scala
// Solution to Exercise 6 in "Comprehensions"
import com.atomicscala.AtomicTest._

case class Activity(date:String, action:String)

def getActivities(date:String, activities:Vector[Activity]):Vector[String] = {
  for {
    a <- activities
    if a.date equals(date)
  }
  yield a.action
}

val activities = Vector(
  Activity("01-01", "Run"),
  Activity("01-03", "Ski"),
  Activity("01-04", "Run"),
  Activity("01-10", "Ski"),
  Activity("01-03", "Run"))

getActivities("01-01", activities) is Vector("Run")
getActivities("01-02", activities) is Vector()
getActivities("01-03", activities) is Vector("Ski", "Run")
getActivities("01-04", activities) is Vector("Run")
getActivities("01-10", activities) is Vector("Ski")

/* OUTPUT_SHOULD_BE
Vector(Run)
Vector()
Vector(Ski, Run)
Vector(Run)
Vector(Ski)
*/
