// Solution-2.scala
// Solution to Exercise 2 in "Evaluation Order"

val sky = "sunny"
var temperature = 87
val somewhatSunnyAndWarm =
  (sky == "sunny" ||
  sky == "party cloudy") &&
  temperature > 80

println(somewhatSunnyAndWarm)

/* OUTPUT_SHOULD_BE
true
*/
