// Solution-7.scala
// Solution to Exercise 7 in "Methods"

def bmiStatus(lbs:Double, height:Double):String = {
  val bmi = lbs / (height*height) * 703.07
  if(bmi < 18.5) "Underweight"
  else if(bmi < 25) "Normal weight"
  else "Overweight"
}

val normal = bmiStatus(160, 68)
println(normal)
assert("Normal weight" == normal,
  "Expected Normal weight, Got " + normal)
val overweight = bmiStatus(180, 60)
println(overweight)
assert("Overweight" == overweight,
  "Expected Overweight, Got " + overweight)
val underweight = bmiStatus(100, 68)
println(underweight)
assert("Underweight" == underweight,
  "Expected Underweight, Got " + underweight)

/* OUTPUT_SHOULD_BE
Normal weight
Overweight
Underweight
*/
