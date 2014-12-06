// Starter Code for Exercise 3
// From "Methods Inside Classes" atom

val sailboat2 = new Sailboat2
val signal = sailboat2.signal()
assert(signal == "Flare used!", "Expected Flare used! Got " + signal)
val motorboat2 = new Motorboat2
val flare2 = motorboat2.signal()
assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)
