// Starter Code for Exercise 4
// From "Composition" Atom (2nd edition)
import com.atomicscala.AtomicTest._

val bot = new Robot(
  Vector(Mobility("Propeller"),
    Mobility("Legs"),
    Vision("UV"),
    Vision("Visible Spectrum"),
    Manipulator("Magnet"),
    Manipulator("Claw"))
)

bot is "Mobility(Propeller), " +
"Mobility(Legs), Vision(UV), " +
"Vision(Visible Spectrum), " +
"Manipulator(Magnet), " +
"Manipulator(Claw)"
