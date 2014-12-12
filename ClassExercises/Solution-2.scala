// Solution-2.scala
// Solution to Exercise 2 in "Class Exercises"
import com.atomicscala.AtomicTest._

class Info(val name:String, var description:String)

val info = new Info("stuff", "Something")
info.name is "stuff"
info.description is "Something"
info.description = "Something else"
info.description is "Something else"

/* OUTPUT_SHOULD_BE
stuff
Something
Something else
*/
