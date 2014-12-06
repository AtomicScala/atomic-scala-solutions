// Starter Code for Exercise 1
// From "String Interpolation" atom
import com.atomicscala.AtomicTest._

val gnome = new GardenGnome(20.0, 110.0, false)
gnome.show() is "20.0 110.0 false true"
val bob = new GardenGnome("Bob")
bob.show() is "15.0 100.0 true true"
