// Starter Code for Exercise 5
// From "Composition" Atom (2nd edition)
import com.atomicscala.AtomicTest._

val bot = new Robot
bot.addMobility(
  Mobility("Propeller"))
bot.addMobility(
  Mobility("Legs"))
bot.addVision(
  Vision("UV"))
bot.addVision(Vision(
  "Visible Spectrum"))
bot.addManipulator(
  Manipulator("Magnet"))
bot.addManipulator(
  Manipulator("Claw"))

bot is "Mobility(Propeller)," +
" Mobility(Legs) | Vision(UV)," +
" Vision(Visible Spectrum) | " +
"Manipulator(Magnet)," +
" Manipulator(Claw)"
