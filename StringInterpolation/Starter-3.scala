// Starter Code for Exercise 3
// From "String Interpolation" atom
import com.atomicscala.AtomicTest._

val gnome = new GardenGnome(20.0, 110.0, false)
gnome.show() is "height: 20.0 weight: 110.0 happy: false painted: true"
val bob = new GardenGnome("Bob")
bob.show() is "height: 15.0 weight: 100.0 true true"
