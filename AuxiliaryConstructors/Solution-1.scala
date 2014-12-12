// Solution-1.scala
// Solution to Exercise 1 in "Auxiliary Constructors"
import com.atomicscala.AtomicTest._

class ClothesWasher(val model:String, val capacity:Double) {
  val cycles = 5

  def this(model:String) = {
    this(model, 2)
  }

  def this(capacity:Double) = {
     this("Unknown", capacity)
  }

  def this() = {
    this("Unknown", 2)
  }

}

val washer1 = new ClothesWasher
washer1.capacity is 2D
washer1.model is "Unknown"

val washer2 = new ClothesWasher("AllInOne")
washer2.capacity is 2D
washer2.model is "AllInOne"

val washer3 = new ClothesWasher(3.6)
washer3.capacity is 3.6
washer3.model is "Unknown"

/* OUTPUT_SHOULD_BE
2.0
Unknown
2.0
AllInOne
3.6
Unknown
*/
