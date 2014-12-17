// Solution-4.scala
// Solution to Exercise 4 in "Polymorphism"
import com.atomicscala.AtomicTest._

class Element {
  val id = getClass.getSimpleName.split('$').last
  def interact(other:Element) = id + " interact " + other.id
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

class Character(val player:String = "None") extends Element
class Dragon(val dragonPlayer:String) extends Character(dragonPlayer) with Magic with Flight

val d = new Dragon("Puff")
d.player is "Puff"

/* OUTPUT_SHOULD_BE
Puff
*/
