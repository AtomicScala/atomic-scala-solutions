// Solution-9.scala
// Solution to Exercise 9 in "Summary 1"

val lbs = 150.0
val height = 68.0
val weightStatus = {
  val bmi = lbs/(height*height) * 703.07
  if(bmi < 18.5) println("Underweight")
    else if(bmi < 25) println("Normal weight")
    else println("Overweight")
}
println(weightStatus)

/* OUTPUT_SHOULD_BE
Normal weight
()
*/
