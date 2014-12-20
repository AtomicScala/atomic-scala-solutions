// Starter Code for Exercise 2
// From "Composition" Atom (2nd edition)
import com.atomicscala.AtomicTest._

val walker = new Robot(
  Mobility("Legs"),
  Vision("Visible Spectrum"),
  Manipulator("Magnet"))
walker is "Mobility(Legs), " +
  "Vision(Visible Spectrum)," +
  " Manipulator(Magnet)"
val crawler = new Robot(
  Mobility("Treads"),
  Vision("Infrared"),
  Manipulator("Claw"))
crawler is "Mobility(Treads)," +
  " Vision(Infrared), " +
  "Manipulator(Claw)"
val arial = new Robot(
  Mobility("Propeller"),
  Vision("UV"),
  Manipulator("None"))
arial is "Mobility(Propeller)," +
  " Vision(UV), Manipulator(None)"
