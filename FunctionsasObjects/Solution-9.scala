// Solution-9.scala
// Solution to Exercise 9 in "Functions as Objects"
import com.atomicscala.AtomicTest._

val pluralize = (x:String) => (x + "s")

val words = Vector("word", "cat", "animal")

var s = ""
words.foreach((x:String) => (s = s + (pluralize(x) + " ")))

s is "words cats animals "

/* OUTPUT_SHOULD_BE
words cats animals
*/
