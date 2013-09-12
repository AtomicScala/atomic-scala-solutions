// Solution-1.scala
// Solution to Exercise 1 in "Evaluation Order"
import com.atomicscala.AtomicTest._

val sky = "sunny"
var temperature = 87

val sunnyAndWarm = sky == "sunny" &&
  temperature > 80
println(sunnyAndWarm)

