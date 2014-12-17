// Starter Code for Exercise 4
// From "Polymorphism" atom
import com.atomicscala.AtomicTest._

class Character(val player:String="None") extends Element
// Change the next line
class Dragon extends Character
val d = new Dragon("Puff")
d.player is "Puff"
