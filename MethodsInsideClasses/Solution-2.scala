// Solution-2.scala
// Solution to Exercise 2 in "Methods Inside Classes"

class Flare {
  def light():String = { "Flare used!"}
}

val flare = new Flare
val f1 = flare.light
assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)
println(f1)

/* OUTPUT_SHOULD_BE
Flare used!
*/
