// Solution-6.scala
// Solution to Exercise 6 in "Maps"
import com.atomicscala.AtomicTest._

val set1 = Set("English", "French", "Spanish", "German", "Chinese")
val set2 = set1 + "French"

val set3 = set1 - "Spanish"
set3.size is 4

case class Name(firstName:String, lastName:String)

val m = Map("sally@taylor.com" -> Name("Sally","Taylor"),
            "mary@smith.com" -> Name("Mary", "Smith"))

val m2 = m + ("jiminy@cricket.com" -> Name("Jiminy", "Cricket"))

val map3 = m2 - "jiminy@cricket.com"
map3.size is 2
