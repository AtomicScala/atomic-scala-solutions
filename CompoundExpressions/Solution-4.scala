// Solution-4.scala
// Solution to Exercise 4 in "Compound Expressions"

val distance = 9
val activity = "biking"

val willDo = {
  if(activity == "running") {
    distance < 10
  } else if(activity == "biking") {
    distance < 20
  } else if(activity == "walking") {
    distance < 6
  } else {
      false
  }
}

println(activity + ": " + willDo)

/* OUTPUT_SHOULD_BE
biking: true
*/
