// Solution-3.scala
// Solution to Exercise 3 in "Maps"
import com.atomicscala.AtomicTest._

case class Name(firstName:String, lastName:String)

val m = Map("sally@taylor.com"->Name("Sally","Taylor"),
            "mary@smith.com"->Name("Mary", "Smith"))

val m2 = m + ("jiminy@cricket.com"->Name("Jiminy", "Cricket"))

m2("jiminy@cricket.com") is Name("Jiminy", "Cricket")
m2("sally@taylor.com") is Name("Sally", "Taylor")

/* OUTPUT_SHOULD_BE
Name(Jiminy,Cricket)
Name(Sally,Taylor)
*/
