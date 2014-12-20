// Starter Code for Exercise 1
// From "Composition" Atom (2nd edition)
import com.atomicscala.AtomicTest._

val walker = new Robot("Legs",
  "Visible Spectrum", "Magnet")
walker is
  "Legs, Visible Spectrum, Magnet"
val crawler = new Robot("Treads",
  "Infrared", "Claw")
crawler is "Treads, Infrared, Claw"
val arial = new Robot("Propeller",
  "UV", "None")
arial is "Propeller, UV, None"
