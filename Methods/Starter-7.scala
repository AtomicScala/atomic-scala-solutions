// Starter Code for Exercise 7
// From "Methods" atom

val normal = bmiStatus(160, 68)
assert("Normal weight" == normal,
  "Expected Normal weight, Got " + normal)
val overweight = bmiStatus(180, 60)
assert("Overweight" == overweight,
  "Expected Overweight, Got " + overweight)
val underweight = bmiStatus(100, 68)
assert("Underweight" == underweight,
  "Expected Underweight, Got " + underweight)
