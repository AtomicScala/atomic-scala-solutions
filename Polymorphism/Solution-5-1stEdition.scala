// Solution-5.scala
// Solution to Exercise 5 in "Polymorphism"
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

class Character2(val player:String = "None") extends Element2
class Dragon2 extends Character2("Puff")

var d2 = new Dragon2
d2.player is "Puff"

/* OUTPUT_SHOULD_BE
Puff
*/
