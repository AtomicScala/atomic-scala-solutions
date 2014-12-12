// Solution-2.scala
// Solution to Exercise 2 in "Auxiliary Constructors"
import com.atomicscala.AtomicTest._

class ClothesWasher2(val model:String = "Unknown", val capacity:Double = 2D) {
  val cycles = 5
}

val washer4 = new ClothesWasher2
washer4.capacity is 2D
washer4.model is "Unknown"

val washer5 = new ClothesWasher2(model="AllInOne")
washer5.capacity is 2D
washer5.model is "AllInOne"

val washer6 = new ClothesWasher2(capacity=3.6D)
washer6.capacity is 3.6D
washer6.model is "Unknown"

/* OUTPUT_SHOULD_BE
2.0
Unknown
2.0
AllInOne
3.6
Unknown
*/
