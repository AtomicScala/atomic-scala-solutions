// Solution-7b.scala
// Solution to Exercise 7 in "Extensible Systems with Type Classes"
import com.atomicscala.AtomicTest._

trait Transformer[From, To] {
  def convert(source:From):To
}

trait Transformer2[From, To] {
  def convert(source:From):To
}

def transform[From, To](source:From)(implicit transformer:Transformer[From, To]):To =
  transformer.convert(source)

def transform2[From, To](source:From)(implicit transformer:Transformer2[From, To]):To =
  transformer.convert(source)

case class Pet(name:String)

implicit object PetTransformer extends Transformer[Pet, String] {
  def convert(pet:Pet):String = s"Here, ${pet.name}!"
}

case class Animal(name:String)

implicit object PetTransformer2 extends Transformer2[Pet, Animal] {
  def convert(pet:Pet):Animal = Animal(pet.name)
}

transform(Pet("Pollux")) is "Here, Pollux!"
transform2(Pet("Pollux")) is "Animal(Pollux)"

/* OUTPUT_SHOULD_BE
Here, Pollux!
Animal(Pollux)
*/
