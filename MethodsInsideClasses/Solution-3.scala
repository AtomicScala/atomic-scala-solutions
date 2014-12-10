// Solution-3.scala
// Solution to Exercise 3 in "Methods Inside Classes"

class Flare {
  def light():String = { "Flare used!"}
}

class Sailboat2 {
  def raise():String = { "Sails raised" }
  def lower():String = { "Sails lowered" }
  def signal():String = {
    new Flare().light()
  }
}

class Motorboat2 {
  def start():String = { "Motor on" }
  def stop():String = { "Motor off" }
  def signal():String = {
    new Flare().light()
  }
}

val sailboat2 = new Sailboat2
val signal = sailboat2.signal()
assert(signal == "Flare used!", "Expected Flare used! Got " + signal)
println(signal)

val motorboat2 = new Motorboat2
val flare2 = motorboat2.signal()
assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)
println(flare2)

/* OUTPUT_SHOULD_BE
Flare used!
Flare used!
*/
