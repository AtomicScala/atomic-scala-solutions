// Solution-3.scala
// Solution to Exercise 3 in "Evaluation Order"
import com.atomicscala.AtomicTest._

val sky = "sunny"
val temperature = 10

val sunnyAndExtreme =
  (sky == "sunny" ||
  sky == "party cloudy") &&
  (temperature > 80 ||
  temperature < 20)

 println(sunnyAndExtreme)

