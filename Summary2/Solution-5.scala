// Solution-5.scala
// Solution to Exercise 5 in "Summary 2"
// To run, first compile ClassBodies.scala:
// scalac ClassBodies.scala
import com.atomicscala.AtomicTest._
import com.atomicscala.Bodies._

val nb = new NoBody
nb.who is "Nobody's home"

val sb = new SomeBody
sb.name is "Janet Doe"

val eb = new EveryBody
var everyone = ""
for(i <- eb.all) {
  everyone += i.name + ", "
}

everyone is "Janet Doe, Janet Doe, Janet Doe, "

/* OUTPUT_SHOULD_BE
Nobody's home
Janet Doe is SomeBody
Janet Doe
Janet Doe is SomeBody
Janet Doe is SomeBody
Janet Doe is SomeBody
Janet Doe, Janet Doe, Janet Doe,
*/
