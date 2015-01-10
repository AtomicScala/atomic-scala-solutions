// Solution-7a.scala
// Solution to Exercise 7 in "Extensible Systems with Type Classes"
import com.atomicscala.AtomicTest._

trait Transformer[From, To] {
  def convert(source:From):To
}

def transform[From, To](source:From)(implicit transformer:Transformer[From, To]):To =
  transformer.convert(source)

def transform2[From, To](source:From)(implicit transformer:Transformer[From, To]):To =
  transformer.convert(source)

case class Pet(name:String)

implicit object PetTransformer extends Transformer[Pet, String] {
  def convert(pet:Pet):String = s"Here, ${pet.name}!"
}

case class Animal(name:String)

implicit object PetTransformer2 extends Transformer[Pet, Animal] {
  def convert(pet:Pet):Animal = Animal(pet.name)
}

transform(Pet("Pollux")) is "Here, Pollux!"
transform2(Pet("Pollux")) is "Animal(Pollux)"

/* OUTPUT_SHOULD_CONTAIN
error: ambiguous implicit values:
 both object PetTransformer of type this.PetTransformer.type
 and object PetTransformer2 of type this.PetTransformer2.type
 match expected type this.Transformer[this.Pet,To]
transform(Pet("Pollux")) is "Here, Pollux!"
         ^
error: ambiguous implicit values:
 both object PetTransformer of type this.PetTransformer.type
 and object PetTransformer2 of type this.PetTransformer2.type
 match expected type this.Transformer[this.Pet,To]
transform2(Pet("Pollux")) is "Animal(Pollux)"
          ^
two errors found
*/
