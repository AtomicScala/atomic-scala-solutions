// Solution-2.scala
// Solution to Exercise 2 in "Maps"
import com.atomicscala.AtomicTest._

case class Name(firstName:String, lastName:String)

val m = Map("sally@taylor.com"->Name("Sally","Taylor"),
            "mary@smith.com"->Name("Mary", "Smith"))

m("sally@taylor.com") is Name("Sally", "Taylor")

/* OUTPUT_SHOULD_BE
Name(Sally,Taylor)
*/
