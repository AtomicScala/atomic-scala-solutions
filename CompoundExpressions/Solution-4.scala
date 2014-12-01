// Solution-4.scala
// Solution to Exercise 4 in "Compound Expressions"
import com.atomicscala.AtomicTest._

val distance = 9
val activity = "biking"

val willDo = {
  if (activity == "running") {
    distance < 10
  } else if (activity == "biking") {
    distance < 20
  } else if (activity == "walking") {
    distance < 6
  } else {
      false
  }
}

println(activity + ": " + willDo)

/* Output
(run 3 times, once for each activity):
running: true
walking: false
biking: true
*/
