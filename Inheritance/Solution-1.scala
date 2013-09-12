// Solution-1.scala
// Solution to Exercise 1 in "Inheritance"
import com.atomicscala.AtomicTest._

class GreatApe {
  // Not practical, just demonstration:
  val weight = 100.0
  val age = 12

  def vocalize = "Grrr!"
}

class Bonobo extends GreatApe
class Chimpanzee extends GreatApe
class BonoboB extends Bonobo

def display(ape:GreatApe) =
  "weight: " + ape.weight +
  " age: " + ape.age

val ape1 = new GreatApe
ape1.vocalize is "Grrr!"
val ape2 = new Bonobo
ape2.vocalize is "Grrr!"
val ape3 = new Chimpanzee
ape3.vocalize is "Grrr!"


