// Solution-6.scala
// Solution to Exercise 6 in "Polymorphism"
import com.atomicscala.AtomicTest._

class Element2 {
  val id = getClass.getSimpleName.split('$').last
  def interact(other:Element2) = id + " interact " + other.id
}

trait Skill {
  val id:String
}

trait Magic extends Skill {
  def castSpell = "Spell!"
}

trait Flight extends Skill {
  def fly = "Fly!"
}

class Character(var player:String = "None") extends Element2

class Dragon extends Character with Magic with Flight

val d = new Dragon
d.player = "Puff"

class NoMagicNoFlyingDragon extends Character("Puff")

val d3 = new NoMagicNoFlyingDragon

d3.player is "Puff"
// d3.fly is "Fly!"
// d3.Magic is "Spell!"
d3.id is "NoMagicNoFlyingDragon"

/* OUTPUT_SHOULD_BE
Puff
NoMagicNoFlyingDragon
*/
