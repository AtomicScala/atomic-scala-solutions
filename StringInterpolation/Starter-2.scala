// Starter Code for Exercise 2
// From "String Interpolation" atom
import com.atomicscala.AtomicTest._

val gnome = new GardenGnome(20.0, 50.0, false)
gnome.show(87) is "Poof! 87 false true"
val bob = new GardenGnome("Bob")
bob.show(25) is "Poof! 25 true true"
