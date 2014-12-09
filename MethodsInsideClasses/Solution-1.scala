// Solution-1.scala
// Solution to Exercise 1 in "Methods Inside Classes"

class Sailboat {
  def raise():String = { "Sails raised" }
  def lower():String = { "Sails lowered" }
}

class Motorboat {
  def start():String = { "Motor on" }
  def stop():String = { "Motor off" }
}

val sailboat = new Sailboat
val r1 = sailboat.raise()
assert(r1 == "Sails raised", "Expected Sails raised, Got " + r1)
println(r1)

val r2 = sailboat.lower()
assert(r2 == "Sails lowered", "Expected Sails lowered, Got " + r2)
println(r2)

val motorboat = new Motorboat
val s1 = motorboat.start()
assert(s1 == "Motor on", "Expected Motor on, Got " +  s1)
val s2 = motorboat.stop()
assert(s2 == "Motor off", "Expected Motor off, Got " + s2)
println(s2)

/* OUTPUT_SHOULD_BE
Sails raised
Sails lowered
Motor off
*/
