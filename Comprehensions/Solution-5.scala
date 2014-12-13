// Solution-5.scala
// Solution to Exercise 5 in "Comprehensions"
import com.atomicscala.AtomicTest._

case class Activity(date:String, action:String)

def getDates(action:String, activities:Vector[Activity]):Vector[String]  = {
  for {
    a <- activities
    if a.action.equals(action)
  }
  yield a.date
}

val activities = Vector(
  Activity("01-01", "Run"),
  Activity("01-03", "Ski"),
  Activity("01-04", "Run"),
  Activity("01-10", "Ski"),
  Activity("01-03", "Run"))

getDates("Ski", activities) is Vector("01-03", "01-10")
getDates("Run", activities) is Vector("01-01", "01-04", "01-03")
getDates("Bike", activities) is Vector()

/* OUTPUT_SHOULD_BE
Vector(01-03, 01-10)
Vector(01-01, 01-04, 01-03)
Vector()
*/
